package com.ametrin.fancy_food.data.provider;

import com.ametrin.fancy_food.FancyFood;
import com.ametrin.fancy_food.registry.FFItems;
import com.ametrinstudios.ametrin.data.provider.ExtendedLanguageProvider;
import net.minecraft.data.PackOutput;

public final class FFLanguageProvider extends ExtendedLanguageProvider {
    public FFLanguageProvider(PackOutput output) {
        super(output, FancyFood.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(FFItems.CARROT_SALAD, "Carrot Salad");
        add(FFItems.CHICKEN_WITH_POTATO, "Chicken with Baked Potato");
        add(FFItems.POTATO_STEW, "Potato Stew");
        add(FFItems.SALAD, "Salad");
        add(FFItems.SANDWICH, "Sandwich");
    }
}
