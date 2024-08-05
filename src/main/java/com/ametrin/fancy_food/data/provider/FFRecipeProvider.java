package com.ametrin.fancy_food.data.provider;

import com.ametrin.fancy_food.FFTags;
import com.ametrin.fancy_food.FancyFood;
import com.ametrin.fancy_food.registry.FFItems;
import com.ametrinstudios.ametrin.data.provider.ExtendedRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public final class FFRecipeProvider extends ExtendedRecipeProvider {

    public FFRecipeProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
        super(packOutput, FancyFood.MOD_ID, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, FFItems.CARROT_SALAD).requires(Items.CARROT, 2).requires(Items.BOWL).requires(FFTags.Items.HERBS).unlockedBy(getHasName(Items.CARROT), has(Items.CARROT)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, FFItems.CHICKEN_SALAD).requires(Items.COOKED_CHICKEN).requires(Items.BOWL).requires(Ingredient.of(FFTags.Items.HERBS), 2).unlockedBy(getHasName(Items.COOKED_CHICKEN), has(Items.COOKED_CHICKEN)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, FFItems.SALAD).requires(Items.BOWL).requires(Ingredient.of(FFTags.Items.HERBS), 5).unlockedBy(getHasName(FFTags.Items.HERBS), has(FFTags.Items.HERBS)).save(recipeOutput);
    }
}
