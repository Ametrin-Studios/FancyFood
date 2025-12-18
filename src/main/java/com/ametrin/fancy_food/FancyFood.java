package com.ametrin.fancy_food;

import com.ametrin.fancy_food.registry.FFItems;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.Identifier;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(FancyFood.MOD_ID)
public final class FancyFood {
    public static final String MOD_ID = "fancy_food";
    private static final Logger LOGGER = LogUtils.getLogger();


    public FancyFood(IEventBus modEventBus) {
        FFItems.REGISTER.register(modEventBus);
    }

    public static Identifier locate(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}
