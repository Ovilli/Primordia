package net.ovilli.primordia.entity.client;

import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.ovilli.primordia.Primordia;
import net.ovilli.primordia.entity.custom.StoneSpearEntity;
import net.ovilli.primordia.entity.custom.WoodenSpearEntity;

public class StoneSpearRenderer extends EntityRenderer<StoneSpearEntity> {
    protected StoneSpearModel model;


    public StoneSpearRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
        this.model = new StoneSpearModel(ctx.getPart(StoneSpearModel.SPEAR));
    }

    @Override
    public void render(StoneSpearEntity entity, float yaw, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light) {
        matrices.push();

        if(!entity.isGrounded()) {
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(MathHelper.lerp(tickDelta, entity.prevYaw, entity.getYaw())));
            matrices.translate(0, -1.0f, 0);
        }else if (entity.groundedOffset != null) {
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(entity.groundedOffset.getY()));
            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(entity.groundedOffset.getX()));
            matrices.translate(0, -1.0f, 0);
        }

        VertexConsumer vertexconsumer = ItemRenderer.getDirectItemGlintConsumer(vertexConsumers,
                this.model.getLayer(Identifier.of(Primordia.MOD_ID, "textures/entity/spear_entity/stone_spear_entity.png")), false, false);
        this.model.render(matrices, vertexconsumer, light, OverlayTexture.DEFAULT_UV);

        matrices.pop();
        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
    }

    @Override
    public Identifier getTexture(StoneSpearEntity entity) {
        return Identifier.of(Primordia.MOD_ID, "textures/entity/spear_entity/stone_spear_entity.png");
    }
}

