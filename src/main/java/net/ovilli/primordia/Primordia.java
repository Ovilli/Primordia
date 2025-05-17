package net.ovilli.primordia;

import net.fabricmc.api.ModInitializer;
import net.ovilli.primordia.blocks.PRModBlocks;
import net.ovilli.primordia.entity.PRModEntities;
import net.ovilli.primordia.items.PRModItemGroups;
import net.ovilli.primordia.items.PRModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Primordia implements ModInitializer {
    public static final String MOD_ID = "primordia";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        PRModBlocks.registerModBlocks();
        PRModItems.registerModItems();
        PRModItemGroups.registerItemGroups();
        PRModEntities.registerModEntities();
    }
}
