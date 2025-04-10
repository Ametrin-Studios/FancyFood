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
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.Tags;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public final class FFRecipeProvider extends ExtendedRecipeProvider {


    public FFRecipeProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
        super(packOutput, FancyFood.MOD_ID, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, FFItems.CARROT_SALAD).requires(Items.CARROT, 2).requires(Items.BOWL).requires(FFTags.Items.OVERWORLD_HERBS).unlockedBy(getHasName(Items.CARROT), has(Items.CARROT)).save(output);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, FFItems.CHICKEN_WITH_POTATO).requires(Items.COOKED_CHICKEN).requires(Items.BOWL).requires(Items.BAKED_POTATO).requires(FFTags.Items.HERBS).unlockedBy(getHasName(Items.COOKED_CHICKEN), has(Items.COOKED_CHICKEN)).save(output);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, FFItems.DRAGONS_FEAST).requires(FFTags.Items.COOKED_MEAT_OR_FISH).requires(Items.POPPED_CHORUS_FRUIT).requires(FFTags.Items.GOLDEN_FOOD).unlockedBy(getHasName(Items.CHORUS_FRUIT), has(Items.CHORUS_FRUIT)).save(output); // intentionally not unlocked by popped chorus fruit because most people will never have this in their inventory
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, FFItems.ENDER_PEARL_CAVIAR, 2).requires(Items.ENDER_PEARL, 3).requires(Items.BOWL, 2).requires(Items.CHORUS_FRUIT).unlockedBy(getHasName(Items.CHORUS_FRUIT), has(Items.CHORUS_FRUIT)).save(output);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, FFItems.FRUIT_SALAD, 2).requires(Items.BOWL).requires(Ingredient.of(FFTags.Items.FRUIT_OR_BERRY), 3).unlockedBy(getHasName(FFTags.Items.FRUIT_OR_BERRY), has(FFTags.Items.FRUIT_OR_BERRY)).save(output);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, FFItems.HELLISH_STEW).requires(Items.COOKED_PORKCHOP).requires(Items.BOWL).requires(tag(FFTags.Items.NETHER_HERBS), 3).unlockedBy(getHasName(FFTags.Items.NETHER_HERBS), has(FFTags.Items.NETHER_HERBS)).save(output);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, FFItems.HONEY_APPLE).requires(Items.APPLE).requires(Items.HONEY_BOTTLE).unlockedBy(getHasName(Items.HONEY_BOTTLE), has(Items.HONEY_BOTTLE)).save(output);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, FFItems.POTATO_STEW).requires(Items.BOWL).requires(Items.BAKED_POTATO).requires(tag(FFTags.Items.HERBS), 2).unlockedBy(getHasName(Items.BAKED_POTATO), has(Items.BAKED_POTATO)).save(output);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, FFItems.SALAD).requires(Items.BOWL).requires(tag(FFTags.Items.OVERWORLD_HERBS), 4).unlockedBy(getHasName(FFTags.Items.HERBS), has(FFTags.Items.HERBS)).save(output);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, FFItems.SANDWICH, 2).requires(Tags.Items.FOODS_BREAD).requires(FFTags.Items.COOKED_MEAT_OR_FISH).requires(tag(FFTags.Items.OVERWORLD_HERBS), 2).unlockedBy(getHasName(FFTags.Items.COOKED_MEAT_OR_FISH), has(FFTags.Items.COOKED_MEAT_OR_FISH)).save(output);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, FFItems.TIRAMISU, 2).requires(Tags.Items.EGGS).requires(Items.SUGAR).requires(Tags.Items.CROPS_WHEAT).requires(Tags.Items.CROPS_COCOA_BEAN).unlockedBy(getHasName(Tags.Items.CROPS_COCOA_BEAN), has(Tags.Items.CROPS_COCOA_BEAN)).save(output);
    }

    private static Ingredient tag(TagKey<Item> tag){
        return Ingredient.of(tag);
    }
}
