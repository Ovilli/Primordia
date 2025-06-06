package net.ovilli.primordia.items.custom;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

import net.ovilli.primordia.entity.custom.StoneSpearEntity;
import net.ovilli.primordia.entity.custom.WoodenSpearEntity;
import net.ovilli.primordia.items.PRModItems;

public class PRSpearItem extends Item {
    public static final int MIN_DRAW_DURATION = 10;
    public static final float THROW_SPEED = 2.5F;

    public PRSpearItem(Item.Settings settings) {
        super(settings);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.SPEAR;
    }

    @Override
    public int getMaxUseTime(ItemStack stack, LivingEntity user) {
        return 72000;
    }

    @Override
    public void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {
        if (!(user instanceof PlayerEntity playerEntity)) return;

        int useTime = getMaxUseTime(stack, user) - remainingUseTicks;
        if (useTime < MIN_DRAW_DURATION) return;


        if (!world.isClient) {
            stack.damage(1, playerEntity, LivingEntity.getSlotForHand(user.getActiveHand()));

                    ProjectileEntity spear;

                    if (stack.isOf(PRModItems.WOODEN_SPEAR)) {
                        spear = new WoodenSpearEntity(world, playerEntity);
                    } else if (stack.isOf(PRModItems.STONE_SPEAR)) {
                        spear = new StoneSpearEntity(world, playerEntity);
                    } else {
                        return;
                    }

                    spear.setVelocity(playerEntity, playerEntity.getPitch(), playerEntity.getYaw(), 0.0F, THROW_SPEED, 1.0F);
                    world.spawnEntity(spear);

                    if (!playerEntity.isCreative()) {
                        playerEntity.getInventory().removeOne(stack);
                    }
                }
            }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        user.setCurrentHand(hand);
        return TypedActionResult.consume(stack);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        return true;
    }

    @Override
    public void postDamageEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        stack.damage(1, attacker, EquipmentSlot.MAINHAND);
    }
}
