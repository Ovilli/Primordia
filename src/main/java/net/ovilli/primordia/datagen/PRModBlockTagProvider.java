package net.ovilli.primordia.datagen;

import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;

import net.minecraft.registry.tag.BlockTags;
import net.ovilli.primordia.blocks.PRModBlocks;

import java.util.concurrent.CompletableFuture;

public class PRModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public PRModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(PRModBlocks.PRIMITIVE_STONE_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL);
               // .add(PRModBlocks.PINK_GARNET_DEEPSLATE_ORE);
    }
}