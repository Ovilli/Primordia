package net.ovilli.primordia.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.ovilli.primordia.Primordia;

public class PRModItems {
    //public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));

    public static final Item WOODEN_CLUB = registerItem("wooden_club", new Item(new Item.Settings().maxDamage(7)));
    public static final Item SHARP_WOOD = registerItem("sharp_wood", new Item(new Item.Settings()));
    public static final Item FRUIT_BOWL = registerItem("fruit_bowl", new Item(new Item.Settings().food(PRModFoodComponents.FRUIT_BOWL).rarity(Rarity.RARE)));
    public static final Item WOODEN_CHISEL = registerItem("wooden_chisel",new Item(new Item.Settings().maxDamage(1)));
    public static final Item WOODEN_SPEAR = registerItem("wooden_spear",new Item(new Item.Settings()));
    public static final Item STONE_SPEAR = registerItem("stone_spear",new Item(new Item.Settings()));
    public static final Item SPEAR_QUIVER = registerItem("spear_quiver",new Item(new Item.Settings()));
    public static final Item SHARP_STONE = registerItem("sharp_stone", new Item(new Item.Settings()));
    public static final Item ROBUST_STICK = registerItem("robust_stick", new Item(new Item.Settings()));
    public static final Item STONE_CLUB = registerItem("stone_club", new Item(new Item.Settings().maxDamage(7)));
    public static final Item FIST_WEDGE = registerItem("fist_wedge", new Item(new Item.Settings()));
    public static final Item MAMMOTH_TOOTH = registerItem("mammoth_tooth", new Item(new Item.Settings()));
    public static final Item ANIMAL_FUR = registerItem("animal_fur", new Item(new Item.Settings()));
    public static final Item BONE_KNIFE = registerItem("bone_knife", new Item(new Item.Settings()));
    public static final Item SHARP_ARROWS = registerItem("sharped_arrows", new Item(new Item.Settings()));
    public static final Item STONE_ARROWS = registerItem("stone_arrows", new Item(new Item.Settings()));
    public static final Item BONE_SPEAR = registerItem("bone_spear", new Item(new Item.Settings()));
    public static final Item STONE_CHISEL = registerItem("stone_chisel", new Item(new Item.Settings()));

    public static final Item LEOPARD_CHESTPLATE = registerItem("leopard_chestplate", new Item(new Item.Settings()));
    public static final Item LEOPARD_LEGGINGS = registerItem("leopard_leggings", new Item(new Item.Settings()));
    public static final Item LEOPARD_HELMET = registerItem("leopard_helmet", new Item(new Item.Settings()));
    public static final Item LEOPARD_BOOTS = registerItem("leopard_boots", new Item(new Item.Settings()));

    public static final Item MAMMOTH_LEATHER_CHESTPLATE = registerItem("mammoth_leather_chestplate", new Item(new Item.Settings()));
    public static final Item MAMMOTH_LEATHER_LEGGINGS = registerItem("mammoth_leather_leggings", new Item(new Item.Settings()));
    public static final Item MAMMOTH_LEATHER_HELMET = registerItem("mammoth_leather_helmet", new Item(new Item.Settings()));
    public static final Item MAMMOTH_LEATHER_BOOTS = registerItem("mammoth_leather_boots", new Item(new Item.Settings()));
    public static final Item MAMMOTH_LEATHER = registerItem("mammoth_leather", new Item(new Item.Settings()));

    public static final Item STONE_BOW = registerItem("stone_bow", new Item(new Item.Settings().maxDamage(250)));
    public static final Item BONE_BOW = registerItem("bone_bow", new Item(new Item.Settings().maxDamage(250)));
    public static final Item SHORTBOW = registerItem("shortbow", new Item(new Item.Settings().maxDamage(200)));
    public static final Item LONGBOW = registerItem("longbow", new Item(new Item.Settings().maxDamage(300)));
    public static final Item PRIMITIVE_CROSSBOW = registerItem("primitive_crossbow", new Item(new Item.Settings().maxDamage(300)));
    public static final Item FIRE_ARROWS = registerItem("fire_arrows", new Item(new Item.Settings()));
    public static final Item DART = registerItem("dart", new Item(new Item.Settings()));
    public static final Item BLOWPIPE = registerItem("blowpipe", new Item(new Item.Settings()));
    public static final Item POISONED_DART = registerItem("poisoned_dart", new Item(new Item.Settings()));
    public static final Item THROWING_ROCK = registerItem("throwing_rock", new Item(new Item.Settings()));
    public static final Item THROWING_STICK = registerItem("throwing_stick", new Item(new Item.Settings()));

    public static final Item FUR_CLOAK = registerItem("fur_cloak", new Item(new Item.Settings()));
    public static final Item BONE_MASK = registerItem("bone_mask", new Item(new Item.Settings()));
    public static final Item FEATHERED_HEADDRESS = registerItem("feathered_headdress", new Item(new Item.Settings()));

    public static final Item DRIED_MEAT = registerItem("dried_meat", new Item(new Item.Settings().food(PRModFoodComponents.DRIED_MAMMOTH_MEAT)));
    public static final Item COOKED_MAMMOTH_MEAT = registerItem("cooked_mammoth_meat", new Item(new Item.Settings().food(PRModFoodComponents.COOKED_MAMMOTH_MEAT)));
    public static final Item RAW_MAMMOTH_MEAT = registerItem("raw_mammoth_meat", new Item(new Item.Settings().food(PRModFoodComponents.RAW_MAMMOTH_MEAT)));

    public static final Item BONE_CLUB = registerItem("bone_club", new Item(new Item.Settings().maxDamage(7)));
    public static final Item FLINT_KNIFE = registerItem("flint_knife", new Item(new Item.Settings()));
    public static final Item OBSIDIAN_KNIFE = registerItem("obsidian_knife", new Item(new Item.Settings()));
    public static final Item BONE_HAMMER = registerItem("bone_hammer", new Item(new Item.Settings()));
    public static final Item STONE_HAMMER = registerItem("stone_hammer", new Item(new Item.Settings()));
    public static final Item STONE_AXE = registerItem("stone_axe", new Item(new Item.Settings()));
    public static final Item BONE_AXE = registerItem("bone_axe", new Item(new Item.Settings()));
    public static final Item STONE_BLADE = registerItem("stone_blade", new Item(new Item.Settings()));
    public static final Item SLING_SHOT = registerItem("sling_shot", new Item(new Item.Settings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Primordia.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Primordia.LOGGER.info("Registering Mod Items for " + Primordia.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(WOODEN_CLUB);
        });
    }
}