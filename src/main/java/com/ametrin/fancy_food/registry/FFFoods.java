package com.ametrin.fancy_food.registry;

import net.minecraft.world.food.FoodConstants;
import net.minecraft.world.food.FoodProperties;

// saturation = nutrition * saturationMod
public final class FFFoods {
//    public static final FoodProperties CARROT_SALAD = simple(6, 0.7f);
//    public static final FoodProperties CHICKEN_SALAD = simple(8, 0.8f);
//    public static final FoodProperties CHICKEN_WITH_POTATO = simple(8, 0.8f);
    public static final FoodProperties GRASS = builder(0, 0f).alwaysEdible().build();
    public static final FoodProperties WEAK = simple(4, FoodConstants.FOOD_SATURATION_LOW);
    public static final FoodProperties MEDIUM_LOW = simple(5, 0.4f);
    public static final FoodProperties MEDIUM = simple(6, FoodConstants.FOOD_SATURATION_NORMAL);
    public static final FoodProperties STRONG = simple(8, FoodConstants.FOOD_SATURATION_GOOD);
    public static final FoodProperties GOD = new FoodProperties(12, 16, false);
//    public static final FoodProperties SANDWICH = simple(4, 0.8f);
//    public static final FoodProperties SALAD = simple(4, 0.3f);
    public static final FoodProperties SUGAR_CANE = simple(2, 0.1f);

    private static FoodProperties simple(int nutrition, float saturationMod) { return builder(nutrition, saturationMod).build(); }
    private static FoodProperties.Builder builder(int nutrition, float saturationModifier) { return builder().nutrition(nutrition).saturationModifier(saturationModifier); }
    private static FoodProperties.Builder builder() { return new FoodProperties.Builder(); }
}
