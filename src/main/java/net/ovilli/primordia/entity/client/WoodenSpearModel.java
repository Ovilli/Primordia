// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package net.ovilli.primordia.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;
import net.ovilli.primordia.Primordia;
import net.ovilli.primordia.entity.custom.StoneSpearEntity;
import net.ovilli.primordia.entity.custom.WoodenSpearEntity;

public class WoodenSpearModel extends EntityModel<WoodenSpearEntity> {
	public static final EntityModelLayer SPEAR = new EntityModelLayer(Identifier.of(Primordia.MOD_ID, "wooden_spear"), "main");
	private final ModelPart spear;

	public WoodenSpearModel(ModelPart root) {
		this.spear = root.getChild("SpearEntity");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData SpearEntity = modelPartData.addChild("SpearEntity", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData cube_r1 = SpearEntity.addChild("cube_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -18.0F, -1.0F, 2.0F, 18.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0436F));
		return TexturedModelData.of(modelData, 32, 32);
	}


	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
		spear.render(matrices, vertexConsumer, light, overlay, color);
	}

	@Override
	public void setAngles(WoodenSpearEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

	}
}