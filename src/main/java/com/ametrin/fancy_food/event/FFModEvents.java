package com.ametrin.fancy_food.event;

import com.ametrin.fancy_food.FancyFood;
import com.ametrin.fancy_food.data.provider.*;
import com.ametrin.fancy_food.registry.FFFoods;
import com.ametrin.fancy_food.registry.FFItems;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;

@SuppressWarnings("unused")
@EventBusSubscriber(modid = FancyFood.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public final class FFModEvents {

    @SubscribeEvent
    private static void modifyComponents(ModifyDefaultComponentsEvent event) {
        event.modify(Items.SUGAR_CANE, builder -> builder.set(DataComponents.FOOD, FFFoods.SUGAR_CANE));
    }

    @SubscribeEvent
    private static void modifyCreativeModeTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() != CreativeModeTabs.FOOD_AND_DRINKS) return;

        event.insertAfter(Items.APPLE.getDefaultInstance(), FFItems.HONEY_APPLE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(Items.CHORUS_FRUIT.getDefaultInstance(), FFItems.ENDER_PEARL_CAVIAR.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(Items.BREAD.getDefaultInstance(), FFItems.SANDWICH.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.COOKIE.getDefaultInstance(), FFItems.TIRAMISU.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.BEETROOT_SOUP.getDefaultInstance(), FFItems.FRUIT_SALAD.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(Items.BEETROOT_SOUP.getDefaultInstance(), FFItems.CARROT_SALAD.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(Items.BEETROOT_SOUP.getDefaultInstance(), FFItems.SALAD.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.RABBIT_STEW.getDefaultInstance(), FFItems.HELLISH_STEW.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(Items.RABBIT_STEW.getDefaultInstance(), FFItems.CHICKEN_WITH_POTATO.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(Items.RABBIT_STEW.getDefaultInstance(), FFItems.POTATO_STEW.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    @SubscribeEvent
    private static void gatherData(GatherDataEvent.Client event) {
        event.createProvider(FFModelProvider::new);
        event.createProvider(FFLanguageProvider::new);
        event.createProvider(FFRecipeProvider.Runner::new);
        event.createBlockAndItemTags(FFBlockTagsProvider::new, FFItemTagsProvider::new);
    }
}
