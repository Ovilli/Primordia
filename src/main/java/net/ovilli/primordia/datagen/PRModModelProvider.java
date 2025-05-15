package net.ovilli.primordia.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.ovilli.primordia.blocks.PRModBlocks;
import net.ovilli.primordia.items.PRModItems;

public class PRModModelProvider extends FabricModelProvider {
    public PRModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(PRModBlocks.PRIMITIVE_STONE_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(PRModItems.WOODEN_CLUB, Models.GENERATED);
        itemModelGenerator.register(PRModItems.SHARP_WOOD, Models.GENERATED);
        itemModelGenerator.register(PRModItems.FRUIT_BOWL, Models.GENERATED);
        itemModelGenerator.register(PRModItems.WOODEN_CHISEL, Models.GENERATED);
        itemModelGenerator.register(PRModItems.WOODEN_SPEAR, Models.GENERATED);
        itemModelGenerator.register(PRModItems.STONE_SPEAR, Models.GENERATED);
        itemModelGenerator.register(PRModItems.SPEAR_QUIVER, Models.GENERATED);
        itemModelGenerator.register(PRModItems.SHARP_STONE, Models.GENERATED);
        itemModelGenerator.register(PRModItems.ROBUST_STICK, Models.GENERATED);
        itemModelGenerator.register(PRModItems.STONE_CLUB, Models.GENERATED);
        itemModelGenerator.register(PRModItems.FIST_WEDGE, Models.GENERATED);
        itemModelGenerator.register(PRModItems.MAMMOTH_TOOTH, Models.GENERATED);
        itemModelGenerator.register(PRModItems.ANIMAL_FUR, Models.GENERATED);
        itemModelGenerator.register(PRModItems.BONE_KNIFE, Models.GENERATED);
        itemModelGenerator.register(PRModItems.SHARP_ARROWS, Models.GENERATED);
        itemModelGenerator.register(PRModItems.STONE_ARROWS, Models.GENERATED);
        itemModelGenerator.register(PRModItems.BONE_SPEAR, Models.GENERATED);
        itemModelGenerator.register(PRModItems.STONE_CHISEL, Models.GENERATED);

        itemModelGenerator.register(PRModItems.LEOPARD_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(PRModItems.LEOPARD_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(PRModItems.LEOPARD_HELMET, Models.GENERATED);
        itemModelGenerator.register(PRModItems.LEOPARD_BOOTS, Models.GENERATED);

        itemModelGenerator.register(PRModItems.MAMMOTH_LEATHER_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(PRModItems.MAMMOTH_LEATHER_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(PRModItems.MAMMOTH_LEATHER_HELMET, Models.GENERATED);
        itemModelGenerator.register(PRModItems.MAMMOTH_LEATHER_BOOTS, Models.GENERATED);
        itemModelGenerator.register(PRModItems.MAMMOTH_LEATHER,Models.GENERATED);

        itemModelGenerator.register(PRModItems.STONE_BOW, Models.GENERATED);
        itemModelGenerator.register(PRModItems.BONE_BOW, Models.GENERATED);
        itemModelGenerator.register(PRModItems.SHORTBOW, Models.GENERATED);
        itemModelGenerator.register(PRModItems.LONGBOW, Models.GENERATED);
        itemModelGenerator.register(PRModItems.PRIMITIVE_CROSSBOW, Models.GENERATED);
        itemModelGenerator.register(PRModItems.FIRE_ARROWS, Models.GENERATED);
        itemModelGenerator.register(PRModItems.DART, Models.GENERATED);
        itemModelGenerator.register(PRModItems.BLOWPIPE, Models.GENERATED);
        itemModelGenerator.register(PRModItems.POISONED_DART, Models.GENERATED);
        itemModelGenerator.register(PRModItems.THROWING_ROCK, Models.GENERATED);
        itemModelGenerator.register(PRModItems.THROWING_STICK, Models.GENERATED);

        itemModelGenerator.register(PRModItems.FUR_CLOAK, Models.GENERATED);
        itemModelGenerator.register(PRModItems.BONE_MASK, Models.GENERATED);
        itemModelGenerator.register(PRModItems.FEATHERED_HEADDRESS, Models.GENERATED);

        itemModelGenerator.register(PRModItems.DRIED_MEAT, Models.GENERATED);
        itemModelGenerator.register(PRModItems.COOKED_MAMMOTH_MEAT, Models.GENERATED);
        itemModelGenerator.register(PRModItems.RAW_MAMMOTH_MEAT, Models.GENERATED);

        itemModelGenerator.register(PRModItems.BONE_CLUB, Models.GENERATED);
        itemModelGenerator.register(PRModItems.FLINT_KNIFE, Models.GENERATED);
        itemModelGenerator.register(PRModItems.OBSIDIAN_KNIFE, Models.GENERATED);
        itemModelGenerator.register(PRModItems.BONE_HAMMER, Models.GENERATED);
        itemModelGenerator.register(PRModItems.STONE_HAMMER, Models.GENERATED);
        itemModelGenerator.register(PRModItems.STONE_AXE, Models.GENERATED);
        itemModelGenerator.register(PRModItems.BONE_AXE, Models.GENERATED);
        itemModelGenerator.register(PRModItems.STONE_BLADE, Models.GENERATED);
        itemModelGenerator.register(PRModItems.SLING_SHOT, Models.GENERATED);
    }

}
