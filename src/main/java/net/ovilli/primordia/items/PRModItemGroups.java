package net.ovilli.primordia.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.ovilli.primordia.Primordia;
import net.ovilli.primordia.blocks.PRModBlocks;

public class PRModItemGroups {
    public static final ItemGroup PRIMORIDA_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Primordia.MOD_ID, "primordia_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(PRModItems.WOODEN_CLUB))
                    .displayName(Text.translatable("itemgroup.primordia.primordia_item"))
                    .entries((displayContext, entries) -> {
                        entries.add(PRModItems.WOODEN_CLUB);
                        entries.add(PRModItems.SHARP_WOOD);
                        entries.add(PRModItems.FRUIT_BOWL);
                        entries.add(PRModItems.WOODEN_CHISEL);
                        entries.add(PRModItems.WOODEN_SPEAR);
                        entries.add(PRModItems.STONE_SPEAR);
                        entries.add(PRModItems.SPEAR_QUIVER);
                        entries.add(PRModItems.SHARP_STONE);
                        entries.add(PRModItems.ROBUST_STICK);
                        entries.add(PRModItems.STONE_CLUB);
                        entries.add(PRModItems.FIST_WEDGE);
                        entries.add(PRModItems.MAMMOTH_TOOTH);
                        entries.add(PRModItems.ANIMAL_FUR);
                        entries.add(PRModItems.BONE_KNIFE);
                        entries.add(PRModItems.SHARP_ARROWS);
                        entries.add(PRModItems.STONE_ARROWS);
                        entries.add(PRModItems.BONE_SPEAR);
                        entries.add(PRModItems.STONE_CHISEL);

                        entries.add(PRModItems.LEOPARD_CHESTPLATE);
                        entries.add(PRModItems.LEOPARD_LEGGINGS);
                        entries.add(PRModItems.LEOPARD_HELMET);
                        entries.add(PRModItems.LEOPARD_BOOTS);

                        entries.add(PRModItems.MAMMOTH_LEATHER_CHESTPLATE);
                        entries.add(PRModItems.MAMMOTH_LEATHER_LEGGINGS);
                        entries.add(PRModItems.MAMMOTH_LEATHER_HELMET);
                        entries.add(PRModItems.MAMMOTH_LEATHER_BOOTS);
                        entries.add(PRModItems.MAMMOTH_LEATHER);

                        entries.add(PRModItems.STONE_BOW);
                        entries.add(PRModItems.BONE_BOW);
                        entries.add(PRModItems.SHORTBOW);
                        entries.add(PRModItems.LONGBOW);
                        entries.add(PRModItems.PRIMITIVE_CROSSBOW);
                        entries.add(PRModItems.FIRE_ARROWS);
                        entries.add(PRModItems.DART);
                        entries.add(PRModItems.BLOWPIPE);
                        entries.add(PRModItems.POISONED_DART);
                        entries.add(PRModItems.THROWING_ROCK);
                        entries.add(PRModItems.THROWING_STICK);

                        entries.add(PRModItems.FUR_CLOAK);
                        entries.add(PRModItems.BONE_MASK);
                        entries.add(PRModItems.FEATHERED_HEADDRESS);

                        entries.add(PRModItems.DRIED_MEAT);
                        entries.add(PRModItems.COOKED_MAMMOTH_MEAT);
                        entries.add(PRModItems.RAW_MAMMOTH_MEAT);

                        entries.add(PRModItems.BONE_CLUB);
                        entries.add(PRModItems.FLINT_KNIFE);
                        entries.add(PRModItems.OBSIDIAN_KNIFE);
                        entries.add(PRModItems.BONE_HAMMER);
                        entries.add(PRModItems.STONE_HAMMER);
                        entries.add(PRModItems.STONE_AXE);
                        entries.add(PRModItems.BONE_AXE);
                        entries.add(PRModItems.STONE_BLADE);
                        entries.add(PRModItems.SLING_SHOT);
                        entries.add(PRModItems.BONE_PICKAXE);
                        entries.add(PRModItems.BONE_SWORD);
                        entries.add(PRModItems.LEOPARD_LEATHER);
                    }).build());

    public static final ItemGroup PRIMORIDA_BLOCK_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Primordia.MOD_ID, "primordia_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(PRModBlocks.PRIMITIVE_STONE_BLOCK))
                    .displayName(Text.translatable("itemgroup.primordia.primordia_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(PRModBlocks.PRIMITIVE_STONE_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        Primordia.LOGGER.info("Registering Item Groups for " + Primordia.MOD_ID);
    }
}
