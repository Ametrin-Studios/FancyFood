package com.ametrin.fancy_food.data.provider;

import com.ametrin.fancy_food.FFTags;
import com.ametrin.fancy_food.FancyFood;
import com.ametrin.fancy_food.registry.FFItems;
import com.ametrinstudios.ametrin.data.provider.ExtendedItemTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.references.BlockItemIds;
import net.minecraft.references.ItemIds;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

public final class FFItemTagsProvider extends ExtendedItemTagsProvider {
    public FFItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider, FancyFood.MOD_ID);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(FFTags.Items.HERBS)
                .addTag(FFTags.Items.OVERWORLD_HERBS)
                .addTag(FFTags.Items.NETHER_HERBS)
        ;

        // green stuff that has no or a positive effect in suspicious stews: https://minecraft.wiki/w/Flower#Suspicious_stew
        tag(FFTags.Items.OVERWORLD_HERBS).add(
                BlockItemIds.POPPY.item(),
                BlockItemIds.TORCHFLOWER.item(),
                BlockItemIds.DANDELION.item(),
                BlockItemIds.BLUE_ORCHID.item(),
                BlockItemIds.OXEYE_DAISY.item(),
                BlockItemIds.ALLIUM.item(),
                BlockItemIds.CORNFLOWER.item(),
                BlockItemIds.LILAC.item(),
                BlockItemIds.SHORT_GRASS.item(),
                BlockItemIds.TALL_GRASS.item(),
                BlockItemIds.FERN.item(),
                BlockItemIds.LARGE_FERN.item(),
                BlockItemIds.PITCHER_PLANT.item(),
                BlockItemIds.GLOW_LICHEN.item(),
                BlockItemIds.SEAGRASS.item(),
                BlockItemIds.KELP.item(),
                ItemIds.DRIED_KELP,
                ItemIds.BEETROOT,
                BlockItemIds.BROWN_MUSHROOM.item(),
                BlockItemIds.RED_MUSHROOM.item()
        );

        tag(FFTags.Items.NETHER_HERBS).add(
                ItemIds.BLAZE_POWDER,
                BlockItemIds.CRIMSON_FUNGUS.item(),
                BlockItemIds.CRIMSON_ROOTS.item(),
                BlockItemIds.WEEPING_VINES.item(),
                BlockItemIds.WARPED_FUNGUS.item(),
                BlockItemIds.WARPED_ROOTS.item(),
                BlockItemIds.TWISTING_VINES.item(),
                BlockItemIds.NETHER_SPROUTS.item()
        );

        tag(FFTags.Items.RAW_MEAT_OR_FISH)
                .addTag(Tags.Items.FOODS_RAW_MEAT)
                .addTag(Tags.Items.FOODS_RAW_FISH);

        tag(FFTags.Items.COOKED_MEAT_OR_FISH)
                .addTag(Tags.Items.FOODS_COOKED_MEAT)
                .addTag(Tags.Items.FOODS_COOKED_FISH);

        tag(FFTags.Items.FRUIT_OR_BERRY)
                .addTag(Tags.Items.FOODS_FRUIT)
                .addTag(Tags.Items.FOODS_BERRY);

        tag(FFTags.Items.GOLDEN_FOOD)
                .addTag(Tags.Items.FOODS_GOLDEN)
                .add(ItemIds.GLISTERING_MELON_SLICE)
                .remove(ItemIds.ENCHANTED_GOLDEN_APPLE)
        ;

        tag(Tags.Items.FOODS).add(
                FFItems.CARROT_SALAD.getKey(),
                FFItems.CHICKEN_WITH_POTATO.getKey(),
                FFItems.DRAGONS_FEAST.getKey(),
                FFItems.ENDER_PEARL_CAVIAR.getKey(),
                FFItems.FRUIT_SALAD.getKey(),
                FFItems.HELLISH_STEW.getKey(),
                FFItems.HONEY_APPLE.getKey(),
                FFItems.POTATO_STEW.getKey(),
                FFItems.SALAD.getKey(),
                FFItems.SANDWICH.getKey(),
                FFItems.TIRAMISU.getKey()
        );
    }
}
