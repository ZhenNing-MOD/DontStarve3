package com.ginsway.dontstarve;

import com.ginsway.dontstarve.data.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DataGeneration implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.createPack().addProvider(ModelGenerator::new);
        fabricDataGenerator.createPack().addProvider(EnglishLangProvider::new);
        fabricDataGenerator.createPack().addProvider(RecipeGenerator::new);
    }
}
