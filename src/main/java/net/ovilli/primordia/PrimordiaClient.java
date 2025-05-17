package net.ovilli.primordia;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.ovilli.primordia.entity.PRModEntities;
import net.ovilli.primordia.entity.client.SpearModel;
import net.ovilli.primordia.entity.client.SpearRenderer;

@Environment(EnvType.CLIENT)
public class PrimordiaClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(SpearModel.SPEAR, SpearModel::getTexturedModelData);
        EntityRendererRegistry.register(PRModEntities.SPEAR_ENTITY, SpearRenderer::new);
    }
}
