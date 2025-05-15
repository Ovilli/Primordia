package net.ovilli.primordia;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.ovilli.primordia.datagen.*;

public class PrimordiaDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(PRModBlockTagProvider::new);
        pack.addProvider(PRModItemTagProvider::new);
        pack.addProvider(PRModLootTableProvider::new);
        pack.addProvider(PRModModelProvider::new);
        pack.addProvider(PRModRecipeProvider::new);
    }
}
