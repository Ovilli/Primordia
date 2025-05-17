package net.ovilli.primordia;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.ovilli.primordia.entity.PRModEntities;
import net.ovilli.primordia.entity.client.StoneSpearModel;
import net.ovilli.primordia.entity.client.StoneSpearRenderer;
import net.ovilli.primordia.entity.client.WoodenSpearModel;
import net.ovilli.primordia.entity.client.WoodenSpearRenderer;

@Environment(EnvType.CLIENT)
public class PrimordiaClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(WoodenSpearModel.SPEAR, WoodenSpearModel::getTexturedModelData);
        EntityRendererRegistry.register(PRModEntities.WOODEN_SPEAR_ENTITY, WoodenSpearRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(StoneSpearModel.SPEAR, StoneSpearModel::getTexturedModelData);
        EntityRendererRegistry.register(PRModEntities.STONE_SPEAR_ENTITY, StoneSpearRenderer::new);
    }
}
