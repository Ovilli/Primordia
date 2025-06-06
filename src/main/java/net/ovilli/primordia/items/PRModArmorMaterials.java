package net.ovilli.primordia.items;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.ovilli.primordia.Primordia;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class PRModArmorMaterials extends ArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> MAMMOTH_ARMOR_MATERIAL = registerArmorMaterial("mammoth",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(PRModItems.MAMMOTH_LEATHER),
                    List.of(new ArmorMaterial.Layer(Identifier.of(Primordia.MOD_ID, "mammoth"))), 0,0));
    public static final RegistryEntry<ArmorMaterial> LEOPARD_ARMOR_MATERIAL = registerArmorMaterial("leopard",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(PRModItems.LEOPARD_LEATHER),
                    List.of(new ArmorMaterial.Layer(Identifier.of(Primordia.MOD_ID, "leopard"))), 0,0));
    public static final RegistryEntry<ArmorMaterial> FUR_CLOAK_MATERIAL = registerArmorMaterial("fur_cloak_material",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(PRModItems.FUR_CLOAK),
                    List.of(new ArmorMaterial.Layer(Identifier.of(Primordia.MOD_ID, "fur_cloak"))), 0,0));
    public static final RegistryEntry<ArmorMaterial> BONE_MASK_MATERIAL = registerArmorMaterial("bone_mask_material",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(PRModItems.BONE_MASK),
                    List.of(new ArmorMaterial.Layer(Identifier.of(Primordia.MOD_ID, "bone_mask"))), 0,0));
    public static final RegistryEntry<ArmorMaterial> FEATHERED_HEADDRESS_MATERIAL = registerArmorMaterial("feathered_headdress_material",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(PRModItems.FEATHERED_HEADDRESS),
                    List.of(new ArmorMaterial.Layer(Identifier.of(Primordia.MOD_ID, "feathered_headdress"))), 0,0));


    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(Primordia.MOD_ID, name), material.get());
    }
}

