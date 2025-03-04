package com.ametrin.fancy_food.data.provider;

import com.ametrin.fancy_food.FFTags;
import com.ametrin.fancy_food.FancyFood;
import com.ametrin.fancy_food.registry.FFItems;
import com.ametrinstudios.ametrin.data.provider.ExtendedItemTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public final class FFItemTagsProvider extends ExtendedItemTagsProvider {
    public FFItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTagProvider) {
        super(packOutput, lookupProvider, blockTagProvider, FancyFood.MOD_ID);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider provider) {
        tag(FFTags.Items.HERBS)
                .addTag(FFTags.Items.OVERWORLD_HERBS)
                .addTag(FFTags.Items.NETHER_HERBS)
        ;

        // green stuff that has no or a positive effect in suspicious stews: https://minecraft.wiki/w/Flower#Suspicious_stew
        tag(FFTags.Items.OVERWORLD_HERBS).add(
                Items.POPPY,
                Items.TORCHFLOWER,
                Items.DANDELION,
                Items.BLUE_ORCHID,
                Items.OXEYE_DAISY,
                Items.ALLIUM,
                Items.CORNFLOWER,
                Items.LILAC,
                Items.SHORT_GRASS,
                Items.TALL_GRASS,
                Items.FERN,
                Items.LARGE_FERN,
                Items.PITCHER_PLANT,
                Items.GLOW_LICHEN,
                Items.SEAGRASS,
                Items.KELP,
                Items.DRIED_KELP,
                Items.BEETROOT,
                Items.BROWN_MUSHROOM,
                Items.RED_MUSHROOM
        );

        tag(FFTags.Items.NETHER_HERBS).add(
                Items.BLAZE_POWDER,
                Items.CRIMSON_FUNGUS,
                Items.CRIMSON_ROOTS,
                Items.WEEPING_VINES,
                Items.WARPED_FUNGUS,
                Items.WARPED_ROOTS,
                Items.TWISTING_VINES,
                Items.NETHER_SPROUTS
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

        tag(Tags.Items.FOODS).add(
                FFItems.CARROT_SALAD.get(),
                FFItems.CHICKEN_WITH_POTATO.get(),
                FFItems.ENDER_PEARL_CAVIAR.get(),
                FFItems.HELLISH_STEW.get(),
                FFItems.HONEY_APPLE.get(),
                FFItems.POTATO_STEW.get(),
                FFItems.SALAD.get(),
                FFItems.SANDWICH.get()
        );
    }
}
