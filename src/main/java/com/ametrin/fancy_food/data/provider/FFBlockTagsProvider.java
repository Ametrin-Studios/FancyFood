package com.ametrin.fancy_food.data.provider;

import com.ametrin.fancy_food.FancyFood;
import com.ametrinstudios.ametrin.data.provider.ExtendedBlockTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public final class FFBlockTagsProvider extends ExtendedBlockTagsProvider {
    public FFBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, FancyFood.MOD_ID);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider provider) {

    }
}
