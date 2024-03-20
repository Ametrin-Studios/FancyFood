package com.ametrin.fancy_food.data.provider;

import com.ametrin.fancy_food.FFTags;
import com.ametrin.fancy_food.FancyFood;
import com.ametrin.fancy_food.registry.FFItems;
import com.ametrinstudios.ametrin.data.provider.ExtendedRecipeProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

public final class FFRecipeProvider extends ExtendedRecipeProvider {
    public FFRecipeProvider(PackOutput packOutput) {
        super(packOutput, FancyFood.MOD_ID);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, FFItems.CARROT_SALAD).requires(Items.CARROT, 2).requires(Items.BOWL).requires(FFTags.Items.HERBS).unlockedBy("has_carrot", has(Items.CARROT)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, FFItems.CHICKEN_SALAD).requires(Items.COOKED_CHICKEN).requires(Items.BOWL).requires(Ingredient.of(FFTags.Items.HERBS), 2).unlockedBy("has_cooked_chicken", has(Items.COOKED_CHICKEN)).save(recipeOutput);
    }
}
