package net.ovilli.primordia.items.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import net.ovilli.primordia.entity.custom.StoneSpearEntity;
import net.ovilli.primordia.entity.custom.WoodenSpearEntity;
import net.ovilli.primordia.items.PRModItems;

import java.util.function.Predicate;

import static net.minecraft.item.RangedWeaponItem.BOW_PROJECTILES;

public class SpearItem extends Item {

    public SpearItem(Settings settings) {
        super(settings);
    }

    public static final int RANGE = 15;

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        user.setCurrentHand(hand);
        return TypedActionResult.consume(itemStack);
    }

    @Override
    public void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {
        if (!(user instanceof PlayerEntity player)) return;

        int charge = this.getMaxUseTime(stack, user) - remainingUseTicks;
        float velocity = getPullProgress(charge);
        if (velocity < 0.1f) return;

        if (!world.isClient) {
            ProjectileEntity spear;
            if (stack.isOf(PRModItems.WOODEN_SPEAR)) {
                spear = new WoodenSpearEntity(world, player);
            } else if (stack.isOf(PRModItems.STONE_SPEAR)) {
                spear = new StoneSpearEntity(world, player);
            } else {
                return;
            }

            spear.setVelocity(player, player.getPitch(), player.getYaw(), 0.0f, velocity * 3.0f, 1.0f);
            world.spawnEntity(spear);
        }

        world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.PLAYERS, 1.0f, 1.0f);
        player.incrementStat(Stats.USED.getOrCreateStat(this));

        if (!player.getAbilities().creativeMode) {
            stack.decrement(1);
        }
    }

    public static float getPullProgress(int useTicks) {
        float f = useTicks / 20.0F;
        f = (f * f + f * 2.0F) / 3.0F;
        return Math.min(f, 1.0F);
    }

    @Override
    public int getMaxUseTime(ItemStack stack, LivingEntity user) {
        return 72000;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.BOW;
    }

    public Predicate<ItemStack> getProjectiles() {
        return BOW_PROJECTILES;
    }

    public int getRange() {
        return RANGE;
    }
}
