package com.ametrin.fancy_food.registry;

import com.ametrin.fancy_food.FancyFood;
import com.ametrin.fancy_food.world.FFFoods;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class FFItems {
    public static final DeferredRegister.Items REGISTER = DeferredRegister.createItems(FancyFood.MOD_ID);

    public static final DeferredItem<Item> CARROT_SALAD = REGISTER.registerSimpleItem("carrot_salad", new Item.Properties().food(FFFoods.CARROT_SALAD).stacksTo(4));
    public static final DeferredItem<Item> CHICKEN_SALAD = REGISTER.registerSimpleItem("chicken_salad", new Item.Properties().food(FFFoods.CHICKEN_SALAD).stacksTo(4));
}
