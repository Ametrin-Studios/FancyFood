package com.ametrin.fancy_food.event;

import com.ametrin.fancy_food.FancyFood;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@Mod.EventBusSubscriber(modid = FancyFood.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class FFEvent {
    @SubscribeEvent
    private void modifyCreativeModeTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() != CreativeModeTabs.FOOD_AND_DRINKS) return;
    }
}
