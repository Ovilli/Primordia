package net.ovilli.primordia.entity.custom;

import net.minecraft.client.util.math.Vector2f;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.ovilli.primordia.entity.PRModEntities;
import net.ovilli.primordia.items.PRModItems;


public class StoneSpearEntity extends PersistentProjectileEntity {
    public Vector2f groundedOffset;


    public StoneSpearEntity(EntityType<? extends PersistentProjectileEntity> entityType, World world) {
        super(entityType, world);
    }

    public StoneSpearEntity(World world, PlayerEntity player) {
        super(PRModEntities.STONE_SPEAR_ENTITY, player, world, new ItemStack(PRModItems.STONE_SPEAR), null);
    }

    @Override
    protected ItemStack getDefaultItemStack() {
        return new ItemStack(PRModItems.STONE_SPEAR);
    }


    public boolean isGrounded() {
        return inGround;
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        entity.damage(this.getDamageSources().thrown(this, this.getOwner()), 4);

        if (!this.getWorld().isClient()) {
            this.getWorld().sendEntityStatus(this, (byte)3);
            this.discard();
        }
    }

    @Override
    protected void onBlockHit(BlockHitResult result) {
        super.onBlockHit(result);

        if(result.getSide() == Direction.SOUTH) {
            groundedOffset = new Vector2f(215f,180f);
        }
        if(result.getSide() == Direction.NORTH) {
            groundedOffset = new Vector2f(215f, 0f);
        }
        if(result.getSide() == Direction.EAST) {
            groundedOffset = new Vector2f(215f,-90f);
        }
        if(result.getSide() == Direction.WEST) {
            groundedOffset = new Vector2f(215f,90f);
        }

        if(result.getSide() == Direction.DOWN) {
            groundedOffset = new Vector2f(115f,180f);
        }
        if(result.getSide() == Direction.UP) {
            groundedOffset = new Vector2f(285f,180f);
        }
    }
}