package com.ametrin.fancy_food.world;

import net.minecraft.world.food.FoodProperties;

public final class FFFoods {
    public static final FoodProperties SUGAR_CANE = simple(2, 0.1f);
    public static final FoodProperties CARROT_SALAD = simple(6, 0.7f);
    public static final FoodProperties CHICKEN_SALAD = simple(8, 0.8f);
    public static final FoodProperties SALAD = simple(4, 0.3f);
    public static final FoodProperties GRASS = builder(0, 0f).alwaysEdible().build();

    private static FoodProperties simple(int nutrition, float saturationMod) { return builder(nutrition, saturationMod).build(); }
    private static FoodProperties.Builder builder(int nutrition, float saturationModifier) { return builder().nutrition(nutrition).saturationModifier(saturationModifier); }
    private static FoodProperties.Builder builder() { return new FoodProperties.Builder(); }
}
