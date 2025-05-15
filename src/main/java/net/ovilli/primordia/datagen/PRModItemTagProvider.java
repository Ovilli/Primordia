package net.ovilli.primordia.datagen;

import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.ovilli.primordia.items.PRModItems;

import java.util.concurrent.CompletableFuture;

public class PRModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public PRModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        //getOrCreateTagBuilder(ModTags.Items.TRANSFORMABLE_ITEMS)
                //.add(PRModItems.WOODEN_CLUB);
    }
}
