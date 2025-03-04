package com.ametrin.fancy_food.data.provider;

import com.ametrin.fancy_food.FancyFood;
import com.ametrin.fancy_food.registry.FFItems;
import com.ametrinstudios.ametrin.data.provider.ExtendedModelProvider;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class FFModelProvider extends ExtendedModelProvider {
    public FFModelProvider(PackOutput output) {
        super(output, FancyFood.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(FFItems.CARROT_SALAD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(FFItems.CHICKEN_WITH_POTATO.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(FFItems.POTATO_STEW.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(FFItems.SALAD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(FFItems.SANDWICH.get(), ModelTemplates.FLAT_ITEM);
    }
}
