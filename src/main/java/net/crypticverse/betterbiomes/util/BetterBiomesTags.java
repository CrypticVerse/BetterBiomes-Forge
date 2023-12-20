package net.crypticverse.betterbiomes.util;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class BetterBiomesTags {
    public static class Items {
        public static final TagKey<Item> MAPLE_LOGS = tag("maple_logs");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(BetterBiomes.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Blocks {
        public static final TagKey<Block> MAPLE_LOGS = tag("maple_logs");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(BetterBiomes.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }

    }
}