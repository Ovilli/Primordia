package net.ovilli.primordia.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.ovilli.primordia.Primordia;
import net.ovilli.primordia.entity.custom.WoodenSpearEntity;

public class WoodenSpearModel extends EntityModel<WoodenSpearEntity> {
	public static final EntityModelLayer SPEAR = new EntityModelLayer(Identifier.of(Primordia.MOD_ID, "wooden_spear"), "main");

	private final ModelPart spear;

	public WoodenSpearModel(ModelPart root) {
		this.spear = root.getChild("SpearEntity");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData root = modelData.getRoot();

		root.addChild("SpearEntity",
				ModelPartBuilder.create()
						.uv(0, 0)
						.cuboid(-1.0F, -18.0F, -1.0F, 2.0F, 18.0F, 2.0F),
				ModelTransform.pivot(0.0F, 24.0F, 0.0F)
		);

		return TexturedModelData.of(modelData, 32, 32);
	}

	@Override
	public void setAngles(WoodenSpearEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		// No animations needed
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
		spear.render(matrices, vertexConsumer, light, overlay, color);
	}
}
