package net.ovilli.primordia.datagen;

import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.ovilli.primordia.items.PRModItems;
import net.ovilli.primordia.util.PRModTags;

import java.util.concurrent.CompletableFuture;

public class PRModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public PRModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(PRModTags.Items.STONE_AGE_ITEMS)
                .add(PRModItems.WOODEN_CLUB)
                .add(PRModItems.STONE_CLUB)
                .add(PRModItems.WOODEN_CHISEL)
                .add(PRModItems.SHARP_STONE);

        getOrCreateTagBuilder(PRModTags.Items.BONE_TOOLS)
                .add(PRModItems.BONE_KNIFE)
                .add(PRModItems.BONE_AXE)
                .add(PRModItems.BONE_SWORD)
                .add(PRModItems.BONE_PICKAXE)
                .add(PRModItems.BONE_CLUB);

        getOrCreateTagBuilder(PRModTags.Items.PRIMITIVE_RANGED)
                .add(PRModItems.SHORTBOW)
                .add(PRModItems.LONGBOW)
                .add(PRModItems.STONE_BOW)
                .add(PRModItems.BONE_BOW)
                .add(PRModItems.PRIMITIVE_CROSSBOW)
                .add(PRModItems.BLOWPIPE);

        getOrCreateTagBuilder(PRModTags.Items.SHARPENED_PROJECTILES)
                .add(PRModItems.SHARP_ARROWS)
                .add(PRModItems.STONE_ARROWS)
                .add(PRModItems.FIRE_ARROWS);

        getOrCreateTagBuilder(PRModTags.Items.THROWABLES)
                .add(PRModItems.THROWING_ROCK)
                .add(PRModItems.THROWING_STICK)
                .add(PRModItems.DART)
                .add(PRModItems.POISONED_DART);

        getOrCreateTagBuilder(PRModTags.Items.BONE_ARMOR)
                .add(PRModItems.MAMMOTH_LEATHER_HELMET)
                .add(PRModItems.MAMMOTH_LEATHER_CHESTPLATE)
                .add(PRModItems.MAMMOTH_LEATHER_LEGGINGS)
                .add(PRModItems.MAMMOTH_LEATHER_BOOTS)
                .add(PRModItems.LEOPARD_HELMET)
                .add(PRModItems.LEOPARD_CHESTPLATE)
                .add(PRModItems.LEOPARD_LEGGINGS)
                .add(PRModItems.LEOPARD_BOOTS)
                .add(PRModItems.FUR_CLOAK)
                .add(PRModItems.BONE_MASK)
                .add(PRModItems.FEATHERED_HEADDRESS);

        getOrCreateTagBuilder(PRModTags.Items.DARTS)
                .add(PRModItems.DART)
                .add(PRModItems.POISONED_DART);

        getOrCreateTagBuilder(PRModTags.Items.CHISELS)
                .add(PRModItems.WOODEN_CHISEL);
    }

}
