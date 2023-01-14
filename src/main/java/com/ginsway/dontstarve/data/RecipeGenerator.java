package com.ginsway.dontstarve.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;

import java.util.function.Consumer;

import static com.ginsway.dontstarve.init.ItemInit.*;
import static net.minecraft.item.Items.*;

public class RecipeGenerator extends FabricRecipeProvider {

    public RecipeGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
        //ShapedRecipeJsonBuilder.create(COPPER_KNIFE).input(COPPER_INGOT,AIR)
    }
}