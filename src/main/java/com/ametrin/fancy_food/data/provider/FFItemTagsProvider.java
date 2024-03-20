package com.ametrin.fancy_food.data.provider;

import com.ametrin.fancy_food.FFTags;
import com.ametrin.fancy_food.FancyFood;
import com.ametrinstudios.ametrin.data.provider.ExtendedItemTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class FFItemTagsProvider extends ExtendedItemTagsProvider {
    public FFItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTagProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, lookupProvider, blockTagProvider, FancyFood.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider provider) {
        tag(FFTags.Items.HERBS).add(
                Items.POPPY,
                Items.DANDELION,
                Items.BLUE_ORCHID,
                Items.OXEYE_DAISY,
                Items.ALLIUM,
                Items.CORNFLOWER,
                Items.LILAC,
                Items.SHORT_GRASS,
                Items.SHORT_GRASS,
                Items.TALL_GRASS,
                Items.FERN,
                Items.LARGE_FERN,
                Items.BROWN_MUSHROOM,
                Items.RED_MUSHROOM);

        tag(FFTags.Items.RAW_FLESH).add(
                Items.BEEF,
                Items.CHICKEN,
                Items.MUTTON,
                Items.PORKCHOP,
                Items.RABBIT,
                Items.SALMON,
                Items.COD
        );

        tag(FFTags.Items.COOKED_FLESH).add(
                Items.COOKED_BEEF,
                Items.COOKED_CHICKEN,
                Items.COOKED_MUTTON,
                Items.COOKED_PORKCHOP,
                Items.COOKED_RABBIT,
                Items.COOKED_SALMON,
                Items.COOKED_COD
        );
    }
}
