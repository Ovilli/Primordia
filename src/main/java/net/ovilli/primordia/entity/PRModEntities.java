package net.ovilli.primordia.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;


import net.minecraft.util.Identifier;
import net.ovilli.primordia.Primordia;
import net.ovilli.primordia.entity.custom.StoneSpearEntity;
import net.ovilli.primordia.entity.custom.WoodenSpearEntity;


public class PRModEntities {

    public static final EntityType<WoodenSpearEntity> WOODEN_SPEAR_ENTITY = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Primordia.MOD_ID, "wooden_spear_entity"),
            EntityType.Builder.<WoodenSpearEntity>create(WoodenSpearEntity::new, SpawnGroup.MISC)
                    .dimensions(0.5f, 1.15f).build());
    public static final EntityType<StoneSpearEntity> STONE_SPEAR_ENTITY = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Primordia.MOD_ID, "stone_spear_entity"),
            EntityType.Builder.<StoneSpearEntity>create(StoneSpearEntity::new, SpawnGroup.MISC)
                    .dimensions(0.5f, 1.15f).build());

    public static void registerModEntities() {
        Primordia.LOGGER.info("Registering Mod Entities for " + Primordia.MOD_ID);
    }
}
