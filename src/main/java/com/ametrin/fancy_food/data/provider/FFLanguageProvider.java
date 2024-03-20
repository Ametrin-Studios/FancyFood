package com.ametrin.fancy_food.data.provider;

import com.ametrin.fancy_food.FancyFood;
import com.ametrin.fancy_food.registry.FFItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.registries.DeferredItem;

public class FFLanguageProvider extends LanguageProvider {
    public FFLanguageProvider(PackOutput output) {
        super(output, FancyFood.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(FFItems.CARROT_SALAD, "Carrot Salad");
        add(FFItems.CHICKEN_SALAD, "Chicken Salad");
    }

    private void add(DeferredItem<Item> deferredItem, String name){
        add(deferredItem.asItem(), name);
    }
}
