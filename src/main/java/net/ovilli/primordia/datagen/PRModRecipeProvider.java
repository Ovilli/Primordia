package net.ovilli.primordia.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import net.ovilli.primordia.items.PRModItems;
import net.ovilli.primordia.blocks.PRModBlocks;

public class PRModRecipeProvider extends FabricRecipeProvider {
    public PRModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        // Basic wood and stone tools/weapons

        // Wooden Club
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, PRModItems.WOODEN_CLUB)
                .pattern(" S ")
                .pattern(" S ")
                .pattern(" W ")
                .input('S', Items.STICK)
                .input('W', Items.OAK_PLANKS)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        // Sharp Wood (stick + flint)
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, PRModItems.SHARP_WOOD)
                .input(Items.STICK)
                .input(Items.FLINT)
                .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                .offerTo(exporter);

        // Wooden Chisel (sharp wood + stick)
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, PRModItems.WOODEN_CHISEL)
                .pattern(" S ")
                .pattern(" W ")
                .pattern("   ")
                .input('S', PRModItems.SHARP_WOOD)
                .input('W', Items.STICK)
                .criterion(hasItem(PRModItems.SHARP_WOOD), conditionsFromItem(PRModItems.SHARP_WOOD))
                .offerTo(exporter);

        // Wooden Spear (sharp wood + sticks)
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, PRModItems.WOODEN_SPEAR)
                .pattern("  W")
                .pattern(" S ")
                .pattern("S  ")
                .input('W', PRModItems.SHARP_WOOD)
                .input('S', Items.STICK)
                .criterion(hasItem(PRModItems.SHARP_WOOD), conditionsFromItem(PRModItems.SHARP_WOOD))
                .offerTo(exporter);

        // Stone Spear (cobblestone + sticks)
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, PRModItems.STONE_SPEAR)
                .pattern("  S")
                .pattern(" S ")
                .pattern("S  ")
                .input('S', Items.COBBLESTONE)
                .criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE))
                .offerTo(exporter);

        // Spear Quiver (sticks + leather)
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, PRModItems.SPEAR_QUIVER)
                .pattern("S S")
                .pattern("S S")
                .pattern(" S ")
                .input('S', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        // Sharp Stone (cobblestone + flint)
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, PRModItems.SHARP_STONE)
                .input(Items.COBBLESTONE)
                .input(Items.FLINT)
                .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                .offerTo(exporter);

        // Robust Stick (stick + bone)
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, PRModItems.ROBUST_STICK)
                .input(Items.STICK)
                .input(Items.BONE)
                .criterion(hasItem(Items.BONE), conditionsFromItem(Items.BONE))
                .offerTo(exporter);

        // Stone Club (cobblestone + stick)
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, PRModItems.STONE_CLUB)
                .pattern("  S")
                .pattern(" S ")
                .pattern("W  ")
                .input('S', Items.COBBLESTONE)
                .input('W', Items.STICK)
                .criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE))
                .offerTo(exporter);

        // Fist Wedge (stone + stick)
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, PRModItems.FIST_WEDGE)
                .pattern(" S ")
                .pattern("W  ")
                .pattern("   ")
                .input('S', Items.COBBLESTONE)
                .input('W', Items.STICK)
                .criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE))
                .offerTo(exporter);

        // Bone Knife (bone + stick)
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, PRModItems.BONE_KNIFE)
                .pattern(" S ")
                .pattern("W  ")
                .pattern("   ")
                .input('S', Items.BONE)
                .input('W', Items.STICK)
                .criterion(hasItem(Items.BONE), conditionsFromItem(Items.BONE))
                .offerTo(exporter);

        // Sharp Arrows (flint + sticks)
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, PRModItems.SHARP_ARROWS)
                .pattern("F")
                .pattern("S")
                .pattern("S")
                .input('F', Items.FLINT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                .offerTo(exporter);

        // Stone Arrows (cobblestone + sticks)
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, PRModItems.STONE_ARROWS)
                .pattern("C")
                .pattern("S")
                .pattern("S")
                .input('C', Items.COBBLESTONE)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE))
                .offerTo(exporter);

        // Bone Spear (bone + sticks)
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, PRModItems.BONE_SPEAR)
                .pattern("  B")
                .pattern(" S ")
                .pattern("S  ")
                .input('B', Items.BONE)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.BONE), conditionsFromItem(Items.BONE))
                .offerTo(exporter);

        // Stone Chisel (sharp stone + stick)
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, PRModItems.STONE_CHISEL)
                .pattern(" S ")
                .pattern(" W ")
                .pattern("   ")
                .input('S', PRModItems.SHARP_STONE)
                .input('W', Items.STICK)
                .criterion(hasItem(PRModItems.SHARP_STONE), conditionsFromItem(PRModItems.SHARP_STONE))
                .offerTo(exporter);

        // Animal Fur (obtained from animals, can be crafted into a bundle)
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, PRModItems.ANIMAL_FUR)
                .input(Items.LEATHER)
                .criterion(hasItem(Items.LEATHER), conditionsFromItem(Items.LEATHER))
                .offerTo(exporter);

        // Mammoth Tooth (no crafting, dropped from mobs or maybe smelting bones)

        // Add Mammoth Leather item (new) for armor crafting
        // You would need to add PRModItems.MAMMOTH_LEATHER item in your mod's item class as well

        // Mammoth Leather Crafting from Mammoth Tooth (simulate tanning)
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, PRModItems.MAMMOTH_LEATHER)
                .input(PRModItems.MAMMOTH_TOOTH)
                .input(PRModItems.ANIMAL_FUR)
                .criterion(hasItem(PRModItems.MAMMOTH_TOOTH), conditionsFromItem(PRModItems.MAMMOTH_TOOTH))
                .offerTo(exporter);

        // Mammoth Leather Chestplate (armor)
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, PRModItems.MAMMOTH_LEATHER_CHESTPLATE)
                .pattern("M M")
                .pattern("MMM")
                .pattern("MMM")
                .input('M', PRModItems.MAMMOTH_LEATHER)
                .criterion(hasItem(PRModItems.MAMMOTH_LEATHER), conditionsFromItem(PRModItems.MAMMOTH_LEATHER))
                .offerTo(exporter);

        // Leopard Chestplate (armor) - use animal fur
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, PRModItems.LEOPARD_CHESTPLATE)
                .pattern("L L")
                .pattern("LLL")
                .pattern("LLL")
                .input('L', PRModItems.ANIMAL_FUR)
                .criterion(hasItem(PRModItems.ANIMAL_FUR), conditionsFromItem(PRModItems.ANIMAL_FUR))
                .offerTo(exporter);

        // Fruit Bowl (food)
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, PRModItems.FRUIT_BOWL)
                .input(Items.APPLE)
                .input(Items.SWEET_BERRIES)
                .input(Items.MELON_SLICE)
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                .offerTo(exporter);

        // Add more food recipes or cooking if you want!

        // Primitive Stone Block (craft from cobblestone)
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, PRModBlocks.PRIMITIVE_STONE_BLOCK)
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', Items.COBBLESTONE)
                .criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE))
                .offerTo(exporter);

        // You can add smelting and blasting recipes similarly if needed
    }
}
