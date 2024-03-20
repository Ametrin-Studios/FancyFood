package com.ametrin.fancy_food.event;

import com.ametrin.fancy_food.FancyFood;
import com.ametrin.fancy_food.data.provider.*;
import com.ametrin.fancy_food.registry.FFItems;
import com.ametrin.fancy_food.world.FFFoods;
import com.ametrinstudios.ametrin.data.DataProviderHelper;
import com.ametrinstudios.ametrin.util.VanillaHack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@Mod.EventBusSubscriber(modid = FancyFood.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class FFEvent {
    @SubscribeEvent
    private static void commonSetup(FMLCommonSetupEvent event){
        VanillaHack.overrideFoodProperties(Items.SUGAR_CANE, FFFoods.SUGAR_CANE);
        VanillaHack.overrideFoodProperties(Items.SHORT_GRASS, FFFoods.GRASS);
        VanillaHack.overrideFoodProperties(Items.TALL_GRASS, FFFoods.GRASS);
        VanillaHack.overrideFoodProperties(Items.FERN, FFFoods.GRASS);
        VanillaHack.overrideFoodProperties(Items.LARGE_FERN, FFFoods.GRASS);
    }

    @SubscribeEvent
    private static void modifyCreativeModeTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() != CreativeModeTabs.FOOD_AND_DRINKS) return;

        event.accept(FFItems.CARROT_SALAD);
        event.accept(FFItems.CHICKEN_SALAD);
    }

    @SubscribeEvent
    private static void gatherData(GatherDataEvent event){
        var providers = new DataProviderHelper(event);

        providers.add(FFItemModelProvider::new);
        providers.add(FFLanguageProvider::new);
        providers.add(FFRecipeProvider::new);
        providers.addBlockAndItemTags(FFBlockTagsProvider::new, FFItemTagsProvider::new);
    }
}
