package net.ovilli.primordia.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.ovilli.primordia.Primordia;
import net.ovilli.primordia.items.custom.*;

public class PRModItems {
    //public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));

    public static final Item WOODEN_CLUB         = registerItem("wooden_club", new Item(new Item.Settings().maxDamage(7)));
    public static final Item SHARP_WOOD          = registerItem("sharp_wood", new Item(new Item.Settings()));
    public static final Item FRUIT_BOWL          = registerItem("fruit_bowl", new Item(new Item.Settings().food(PRModFoodComponents.FRUIT_BOWL).rarity(Rarity.RARE)));
    public static final Item WOODEN_CHISEL       = registerItem("wooden_chisel",new Item(new Item.Settings().maxDamage(1)));
    public static final Item WOODEN_SPEAR        = registerItem("wooden_spear",new PRSpearItem(new Item.Settings()));
    public static final Item STONE_SPEAR         = registerItem("stone_spear",new PRSpearItem(new Item.Settings().maxDamage(255)));
    public static final Item SPEAR_QUIVER        = registerItem("spear_quiver",new Item(new Item.Settings()));
    public static final Item SHARP_STONE         = registerItem("sharp_stone", new Item(new Item.Settings()));
    public static final Item ROBUST_STICK        = registerItem("robust_stick", new Item(new Item.Settings()));
    public static final Item STONE_CLUB          = registerItem("stone_club", new Item(new Item.Settings().maxDamage(7)));
    public static final Item FIST_WEDGE          = registerItem("fist_wedge", new Item(new Item.Settings()));
    public static final Item MAMMOTH_TOOTH       = registerItem("mammoth_tooth", new Item(new Item.Settings()));
    public static final Item ANIMAL_FUR          = registerItem("animal_fur", new Item(new Item.Settings()));


    public static final Item SHARP_ARROWS        = registerItem("sharp_arrows", new PRArrowItem(new Item.Settings()));
    public static final Item STONE_ARROWS        = registerItem("stone_arrows", new PRArrowItem(new Item.Settings()));
    public static final Item FIRE_ARROWS         = registerItem("fire_arrows", new PRArrowItem(new Item.Settings()));
    public static final Item POISONED_DART       = registerItem("poisoned_dart", new PRDartItem(new Item.Settings()));
    public static final Item DART                = registerItem("dart", new PRDartItem(new Item.Settings()));
    public static final Item THROWING_ROCK       = registerItem("throwing_rock", new PRThrowableItem(new Item.Settings()));
    public static final Item THROWING_STICK      = registerItem("throwing_stick", new PRThrowableItem(new Item.Settings()));


    public static final Item SHORTBOW            = registerItem("shortbow", new PRBowItem(new Item.Settings().maxDamage(200)));
    public static final Item STONE_BOW           = registerItem("stone_bow", new PRBowItem(new Item.Settings().maxDamage(250)));
    public static final Item LONGBOW             = registerItem("longbow", new PRBowItem(new Item.Settings().maxDamage(300)));
    public static final Item PRIMITIVE_CROSSBOW  = registerItem("primitive_crossbow", new PRCrossbowItem(new Item.Settings().maxDamage(300)));
    public static final Item BLOWPIPE            = registerItem("blowpipe", new PRBlowpipeItem(new Item.Settings()));



    public static final Item LEOPARD_LEATHER     = registerItem("leopard_leather", new Item(new Item.Settings()));


    public static final Item MAMMOTH_LEATHER     = registerItem("mammoth_leather", new Item(new Item.Settings()));



    public static final Item DRIED_MEAT          = registerItem("dried_meat", new Item(new Item.Settings().food(PRModFoodComponents.DRIED_MAMMOTH_MEAT)));
    public static final Item COOKED_MAMMOTH_MEAT = registerItem("cooked_mammoth_meat", new Item(new Item.Settings().food(PRModFoodComponents.COOKED_MAMMOTH_MEAT)));
    public static final Item RAW_MAMMOTH_MEAT    = registerItem("raw_mammoth_meat", new Item(new Item.Settings().food(PRModFoodComponents.RAW_MAMMOTH_MEAT)));



    public static final Item STONE_BLADE         = registerItem("stone_blade", new Item(new Item.Settings()));
    public static final Item SLING_SHOT          = registerItem("sling_shot", new Item(new Item.Settings()));


    public static final Item BONE_CLUB           = registerItem("bone_club", new Item(new Item.Settings().maxDamage(7)));
    public static final Item BONE_BOW            = registerItem("bone_bow", new Item(new Item.Settings().maxDamage(250)));
    public static final Item BONE_SPEAR          = registerItem("bone_spear", new Item(new Item.Settings()));

    public static final Item BONE_SWORD = registerItem("bone_sword",
            new SwordItem(PRModToolMaterials.BONE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(PRModToolMaterials.BONE, 3, -2.4f))));
    public static final Item BONE_AXE = registerItem("bone_axe",
            new AxeItem(PRModToolMaterials.BONE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(PRModToolMaterials.BONE, 6, -2.3f))));
    public static final Item BONE_PICKAXE = registerItem("bone_pickaxe",
            new AxeItem(PRModToolMaterials.BONE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(PRModToolMaterials.BONE, 1, -2.8f))));
    public static final Item BONE_KNIFE = registerItem("bone_knife",
            new SwordItem(PRModToolMaterials.BONE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(PRModToolMaterials.BONE, 4, -1.4f))));

    public static final Item MAMMOTH_LEATHER_HELMET = registerItem("mammoth_leather_helmet",
            new ArmorItem(PRModArmorMaterials.MAMMOTH_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));

    public static final Item MAMMOTH_LEATHER_CHESTPLATE = registerItem("mammoth_leather_chestplate",
            new ArmorItem(PRModArmorMaterials.MAMMOTH_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));

    public static final Item MAMMOTH_LEATHER_LEGGINGS = registerItem("mammoth_leather_leggings",
            new ArmorItem(PRModArmorMaterials.MAMMOTH_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));

    public static final Item MAMMOTH_LEATHER_BOOTS = registerItem("mammoth_leather_boots",
            new ArmorItem(PRModArmorMaterials.MAMMOTH_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    public static final Item LEOPARD_HELMET = registerItem("leopard_helmet",
            new ArmorItem(PRModArmorMaterials.LEOPARD_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));

    public static final Item LEOPARD_CHESTPLATE = registerItem("leopard_chestplate",
            new ArmorItem(PRModArmorMaterials.LEOPARD_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));

    public static final Item LEOPARD_LEGGINGS = registerItem("leopard_leggings",
            new ArmorItem(PRModArmorMaterials.LEOPARD_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));

    public static final Item LEOPARD_BOOTS = registerItem("leopard_boots",
            new ArmorItem(PRModArmorMaterials.LEOPARD_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    public static final Item FUR_CLOAK = registerItem("fur_cloak",
            new ArmorItem(PRModArmorMaterials.FUR_CLOAK_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));

    public static final Item BONE_MASK = registerItem("bone_mask",
            new ArmorItem(PRModArmorMaterials.BONE_MASK_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));

    public static final Item FEATHERED_HEADDRESS = registerItem("feathered_headdress",
            new ArmorItem(PRModArmorMaterials.FEATHERED_HEADDRESS_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));


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