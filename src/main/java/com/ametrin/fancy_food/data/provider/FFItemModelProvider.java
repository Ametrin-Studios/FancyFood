package com.ametrin.fancy_food.data.provider;

import com.ametrin.fancy_food.FancyFood;
import com.ametrin.fancy_food.registry.FFItems;
import com.ametrinstudios.ametrin.data.provider.ExtendedItemModelProvider;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public final class FFItemModelProvider extends ExtendedItemModelProvider {

    public FFItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, FancyFood.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        runProviderRules(FFItems.REGISTER);
    }
}
