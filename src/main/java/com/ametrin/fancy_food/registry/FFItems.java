package com.ametrin.fancy_food.registry;

import com.ametrin.fancy_food.FancyFood;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

// add Item:
// - define item (here)
// - define translation (FFLanguageProvider)
// - define item model (FFModelProvider)
// - define recipe (FFRecipeProvider)
// - add to tags (food tag!) (FFItemTagsProvider)
// - define creative tab position (FFModEvents)
// - texture (assets/fancy_food/textures/item)
// - run data

public final class FFItems {
    public static final DeferredRegister.Items REGISTER = DeferredRegister.createItems(FancyFood.MOD_ID);

    public static final DeferredItem<Item> CARROT_SALAD = REGISTER.registerSimpleItem("carrot_salad", new Item.Properties().food(FFFoods.MEDIUM).stacksTo(4));
//    public static final DeferredItem<Item> CHICKEN_SALAD = REGISTER.registerSimpleItem("chicken_salad", new Item.Properties().food(FFFoods.CHICKEN_SALAD).stacksTo(4));
    public static final DeferredItem<Item> CHICKEN_WITH_POTATO = REGISTER.registerSimpleItem("chicken_with_potato", new Item.Properties().food(FFFoods.STRONG_BOWL).craftRemainder(Items.BOWL).stacksTo(4));
    public static final DeferredItem<Item> DRAGONS_FEAST = REGISTER.registerSimpleItem("dragons_feast", new Item.Properties().food(FFFoods.GOD).stacksTo(16));
    public static final DeferredItem<Item> ENDER_PEARL_CAVIAR = REGISTER.registerSimpleItem("ender_pearl_caviar", new Item.Properties().food(FFFoods.MEDIUM_LOW_BOWL).craftRemainder(Items.BOWL).stacksTo(4));
    public static final DeferredItem<Item> FRUIT_SALAD = REGISTER.registerSimpleItem("fruit_salad", new Item.Properties().food(FFFoods.MEDIUM_BOWL).craftRemainder(Items.BOWL).stacksTo(4));
    public static final DeferredItem<Item> HELLISH_STEW = REGISTER.registerSimpleItem("hellish_stew", new Item.Properties().food(FFFoods.STRONG_BOWL).craftRemainder(Items.BOWL).stacksTo(4));
    public static final DeferredItem<Item> HONEY_APPLE = REGISTER.registerSimpleItem("honey_apple", new Item.Properties().food(FFFoods.MEDIUM_LOW).stacksTo(16));
    public static final DeferredItem<Item> POTATO_STEW = REGISTER.registerSimpleItem("potato_stew", new Item.Properties().food(FFFoods.MEDIUM_BOWL).craftRemainder(Items.BOWL).stacksTo(4));
    public static final DeferredItem<Item> SALAD = REGISTER.registerSimpleItem("salad", new Item.Properties().food(FFFoods.WEAK_BOWL).craftRemainder(Items.BOWL).stacksTo(4));
    public static final DeferredItem<Item> SANDWICH = REGISTER.registerSimpleItem("sandwich", new Item.Properties().food(FFFoods.STRONG).stacksTo(16));
    public static final DeferredItem<Item> TIRAMISU = REGISTER.registerSimpleItem("tiramisu", new Item.Properties().food(FFFoods.MEDIUM_LOW).stacksTo(16));
}
