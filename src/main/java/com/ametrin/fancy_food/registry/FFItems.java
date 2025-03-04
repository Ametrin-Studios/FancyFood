package com.ametrin.fancy_food.registry;

import com.ametrin.fancy_food.FancyFood;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

// add Item:
// - define item (here)
// - define item model (FFModelProvider)
// - define translation (FFLanguageProvider)
// - define recipe (FFRecipeProvider)
// - add to tags (food tag!) (FFItemTagsProvider)
// - define creative tab position (FFModEvents)
// - texture (assets/fancy_food/textures/item)
// - run data

public final class FFItems {
    public static final DeferredRegister.Items REGISTER = DeferredRegister.createItems(FancyFood.MOD_ID);

    public static final DeferredItem<Item> CARROT_SALAD = REGISTER.registerSimpleItem("carrot_salad", new Item.Properties().food(FFFoods.MEDIUM).stacksTo(4));
//    public static final DeferredItem<Item> CHICKEN_SALAD = REGISTER.registerSimpleItem("chicken_salad", new Item.Properties().food(FFFoods.CHICKEN_SALAD).stacksTo(4));
    public static final DeferredItem<Item> CHICKEN_WITH_POTATO = REGISTER.registerSimpleItem("chicken_with_potato", new Item.Properties().food(FFFoods.STRONG).stacksTo(4));
    public static final DeferredItem<Item> POTATO_STEW = REGISTER.registerSimpleItem("potato_stew", new Item.Properties().food(FFFoods.MEDIUM).stacksTo(4));
    public static final DeferredItem<Item> SALAD = REGISTER.registerSimpleItem("salad", new Item.Properties().food(FFFoods.WEAK).stacksTo(4));
    public static final DeferredItem<Item> SANDWICH = REGISTER.registerSimpleItem("sandwich", new Item.Properties().food(FFFoods.STRONG).stacksTo(16));
}
