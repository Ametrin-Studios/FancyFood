package com.ametrin.fancy_food;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public final class FFTags {
    public static final class Blocks{
        private static TagKey<Block> mod(String path){
            return BlockTags.create(new ResourceLocation(FancyFood.MOD_ID, path));
        }
    }

    public static final class Items{
        public static final TagKey<Item> HERBS = mod("herbs");
        public static final TagKey<Item> RAW_FLESH = mod("raw_flesh");
        public static final TagKey<Item> COOKED_FLESH = mod("cooked_flesh");
        private static TagKey<Item> mod(String path){
            return ItemTags.create(new ResourceLocation(FancyFood.MOD_ID, path));
        }
    }
}
