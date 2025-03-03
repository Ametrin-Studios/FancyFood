package com.ametrin.fancy_food;

import com.ametrin.fancy_food.registry.FFItems;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(FancyFood.MOD_ID)
public final class FancyFood {
    public static final String MOD_ID = "fancy_food";
    private static final Logger LOGGER = LogUtils.getLogger();


    public FancyFood(IEventBus modEventBus) {
//        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
        FFItems.REGISTER.register(modEventBus);
    }

    public static ResourceLocation locate(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
