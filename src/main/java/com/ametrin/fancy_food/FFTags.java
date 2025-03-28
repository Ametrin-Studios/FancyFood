package com.ametrin.fancy_food;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public final class FFTags {
    public static final class Blocks {
        private static TagKey<Block> mod(String path) {
            return BlockTags.create(FancyFood.locate(path));
        }
    }

    public static final class Items {
        public static final TagKey<Item> COOKED_MEAT_OR_FISH = mod("cooked_meat_or_fish");
        public static final TagKey<Item> FRUIT_OR_BERRY = mod("fruit_or_berry");
        public static final TagKey<Item> HERBS = mod("herbs");
        public static final TagKey<Item> NETHER_HERBS = mod("herbs/nether");
        public static final TagKey<Item> OVERWORLD_HERBS = mod("herbs/overworld");
        public static final TagKey<Item> RAW_MEAT_OR_FISH = mod("raw_meat_or_fish");
        public static final TagKey<Item> GOLDEN_FOOD = mod("golden_food");
        private static TagKey<Item> mod(String path) {
            return ItemTags.create(FancyFood.locate(path));
        }
    }
}
