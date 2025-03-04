package com.ametrin.fancy_food.data.provider;

import com.ametrin.fancy_food.FFTags;
import com.ametrin.fancy_food.FancyFood;
import com.ametrin.fancy_food.registry.FFItems;
import com.ametrinstudios.ametrin.data.provider.ExtendedRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.Tags;
import org.jetbrains.annotations.NotNull;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public final class FFRecipeProvider extends ExtendedRecipeProvider {


    public FFRecipeProvider(HolderLookup.Provider registries, RecipeOutput output, Set<ResourceLocation> recipeSet) {
        super(FancyFood.MOD_ID, registries, output, recipeSet);
    }

    @Override
    protected void buildRecipes() {
        shapeless(RecipeCategory.FOOD, FFItems.CARROT_SALAD).requires(Items.CARROT, 2).requires(Items.BOWL).requires(FFTags.Items.OVERWORLD_HERBS).unlockedBy(getHasName(Items.CARROT), has(Items.CARROT)).save(output);
//        shapeless(RecipeCategory.FOOD, FFItems.CHICKEN_SALAD).requires(Items.COOKED_CHICKEN).requires(Items.BOWL).requires(tag(FFTags.Items.HERBS), 2).unlockedBy(getHasName(Items.COOKED_CHICKEN), has(Items.COOKED_CHICKEN)).save(output);
        shapeless(RecipeCategory.FOOD, FFItems.CHICKEN_WITH_POTATO).requires(Items.COOKED_CHICKEN).requires(Items.BOWL).requires(Items.BAKED_POTATO).requires(tag(FFTags.Items.HERBS), 1).unlockedBy(getHasName(Items.COOKED_CHICKEN), has(Items.COOKED_CHICKEN)).save(output);
        shapeless(RecipeCategory.FOOD, FFItems.HELLISH_STEW).requires(Items.COOKED_PORKCHOP).requires(Items.BOWL).requires(tag(FFTags.Items.NETHER_HERBS), 3).unlockedBy(getHasName(FFTags.Items.NETHER_HERBS), has(FFTags.Items.NETHER_HERBS)).save(output);
        shapeless(RecipeCategory.FOOD, FFItems.POTATO_STEW).requires(Items.BOWL).requires(Items.BAKED_POTATO).requires(tag(FFTags.Items.HERBS), 2).unlockedBy(getHasName(Items.BAKED_POTATO), has(Items.BAKED_POTATO)).save(output);
        shapeless(RecipeCategory.FOOD, FFItems.SALAD).requires(Items.BOWL).requires(tag(FFTags.Items.OVERWORLD_HERBS), 5).unlockedBy(getHasName(FFTags.Items.HERBS), has(FFTags.Items.HERBS)).save(output);
        shapeless(RecipeCategory.FOOD, FFItems.SANDWICH, 2).requires(Tags.Items.FOODS_BREAD).requires(tag(FFTags.Items.COOKED_MEAT_OR_FISH)).requires(tag(FFTags.Items.OVERWORLD_HERBS), 2).unlockedBy(getHasName(FFTags.Items.COOKED_MEAT_OR_FISH), has(FFTags.Items.COOKED_MEAT_OR_FISH)).save(output);
    }

    public static class Runner extends ExtendedRecipeProvider.Runner {
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> providerCompletableFuture) {
            super(output, providerCompletableFuture);
        }

        @Override
        protected ExtendedRecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput output, Set<ResourceLocation> recipeSet) {
            return new FFRecipeProvider(provider, output, recipeSet);
        }

        @Override
        public @NotNull String getName() {
            return "Fancy Food recipes";
        }
    }
}
