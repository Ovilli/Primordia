package net.ovilli.primordia.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.ovilli.primordia.Primordia;

public class PRModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_BONE_TOOL = createTag("needs_bone_tool");
        public static final TagKey<Block> INCORRECT_FOR_BONE_TOOL = createTag("incorrect_for_bone_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Primordia.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> STONE_AGE_ITEMS = createTag("stone_age_items");

        public static final TagKey<Item> SHARPENED_PROJECTILES = createTag("sharpened_projectiles");
        public static final TagKey<Item> BONE_TOOLS = createTag("bone_tools");
        public static final TagKey<Item> PRIMITIVE_RANGED = createTag("primitive_ranged");
        public static final TagKey<Item> THROWABLES = createTag("throwables");
        public static final TagKey<Item> BONE_ARMOR = createTag("bone_armor");
        public static final TagKey<Item> DARTS = createTag("darts");
        public static final TagKey<Item> CHISELS = createTag("chisels");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Primordia.MOD_ID, name));
        }
    }
}
