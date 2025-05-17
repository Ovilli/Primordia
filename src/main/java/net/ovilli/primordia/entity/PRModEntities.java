package net.ovilli.primordia.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;


import net.minecraft.util.Identifier;
import net.ovilli.primordia.Primordia;
import net.ovilli.primordia.entity.custom.SpearEntity;


public class PRModEntities {

    public static final EntityType<SpearEntity> SPEAR_ENTITY = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Primordia.MOD_ID, "spear_entity"),
            EntityType.Builder.<SpearEntity>create(SpearEntity::new, SpawnGroup.MISC)
                    .dimensions(0.5f, 1.15f).build());


    public static void registerModEntities() {
        Primordia.LOGGER.info("Registering Mod Entities for " + Primordia.MOD_ID);
    }
}
