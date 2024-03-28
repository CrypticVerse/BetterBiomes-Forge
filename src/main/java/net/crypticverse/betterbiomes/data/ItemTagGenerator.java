/*
 * MIT License
 *
 * Copyright (c) 2023 CrypticVerse
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */
package net.crypticverse.betterbiomes.data;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;

import net.minecraftforge.common.data.ExistingFileHelper;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.BetterBiomeBlocks;
import net.crypticverse.betterbiomes.util.BetterBiomesTags;

public class ItemTagGenerator extends ItemTagsProvider {
    public ItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future,
                            CompletableFuture<TagLookup<Block>> completableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, completableFuture, BetterBiomes.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(BetterBiomeBlocks.MAPLE_LOG.get().asItem())
                .add(BetterBiomeBlocks.MAPLE_WOOD.get().asItem())
                .add(BetterBiomeBlocks.STRIPPED_MAPLE_LOG.get().asItem())
                .add(BetterBiomeBlocks.STRIPPED_MAPLE_WOOD.get().asItem())
                .add(BetterBiomeBlocks.THIN_ACACIA_LOG.get().asItem())
                .add(BetterBiomeBlocks.THIN_BIRCH_LOG.get().asItem())
                .add(BetterBiomeBlocks.THIN_CHERRY_LOG.get().asItem())
                .add(BetterBiomeBlocks.THIN_DARK_OAK_LOG.get().asItem())
                .add(BetterBiomeBlocks.THIN_JUNGLE_LOG.get().asItem())
                .add(BetterBiomeBlocks.THIN_MANGROVE_LOG.get().asItem())
                .add(BetterBiomeBlocks.THIN_OAK_LOG.get().asItem())
                .add(BetterBiomeBlocks.THIN_SPRUCE_LOG.get().asItem())
                .add(BetterBiomeBlocks.STRIPPED_THIN_ACACIA_LOG.get().asItem())
                .add(BetterBiomeBlocks.STRIPPED_THIN_BIRCH_LOG.get().asItem())
                .add(BetterBiomeBlocks.STRIPPED_THIN_CHERRY_LOG.get().asItem())
                .add(BetterBiomeBlocks.STRIPPED_THIN_DARK_OAK_LOG.get().asItem())
                .add(BetterBiomeBlocks.STRIPPED_THIN_JUNGLE_LOG.get().asItem())
                .add(BetterBiomeBlocks.STRIPPED_THIN_MANGROVE_LOG.get().asItem())
                .add(BetterBiomeBlocks.STRIPPED_THIN_OAK_LOG.get().asItem())
                .add(BetterBiomeBlocks.STRIPPED_THIN_SPRUCE_LOG.get().asItem());
        this.tag(ItemTags.PLANKS)
                .add(BetterBiomeBlocks.MAPLE_PLANKS.get().asItem());
        this.tag(BetterBiomesTags.Items.MAPLE_LOGS)
                .add(BetterBiomeBlocks.MAPLE_LOG.get().asItem())
                .add(BetterBiomeBlocks.MAPLE_WOOD.get().asItem())
                .add(BetterBiomeBlocks.STRIPPED_MAPLE_LOG.get().asItem())
                .add(BetterBiomeBlocks.STRIPPED_MAPLE_WOOD.get().asItem());

        this.tag(ItemTags.ACACIA_LOGS).add(BetterBiomeBlocks.THIN_ACACIA_LOG.get().asItem()).add(BetterBiomeBlocks.STRIPPED_THIN_ACACIA_LOG.get().asItem());
        this.tag(ItemTags.BIRCH_LOGS).add(BetterBiomeBlocks.THIN_BIRCH_LOG.get().asItem()).add(BetterBiomeBlocks.STRIPPED_THIN_BIRCH_LOG.get().asItem());
        this.tag(ItemTags.CHERRY_LOGS).add(BetterBiomeBlocks.THIN_CHERRY_LOG.get().asItem()).add(BetterBiomeBlocks.STRIPPED_THIN_CHERRY_LOG.get().asItem());
        this.tag(ItemTags.DARK_OAK_LOGS).add(BetterBiomeBlocks.THIN_DARK_OAK_LOG.get().asItem()).add(BetterBiomeBlocks.STRIPPED_THIN_ACACIA_LOG.get().asItem());
        this.tag(ItemTags.JUNGLE_LOGS).add(BetterBiomeBlocks.THIN_JUNGLE_LOG.get().asItem()).add(BetterBiomeBlocks.STRIPPED_THIN_ACACIA_LOG.get().asItem());
        this.tag(ItemTags.MANGROVE_LOGS).add(BetterBiomeBlocks.THIN_MANGROVE_LOG.get().asItem()).add(BetterBiomeBlocks.STRIPPED_THIN_ACACIA_LOG.get().asItem());
        this.tag(ItemTags.OAK_LOGS).add(BetterBiomeBlocks.THIN_OAK_LOG.get().asItem()).add(BetterBiomeBlocks.STRIPPED_THIN_ACACIA_LOG.get().asItem());
        this.tag(ItemTags.SPRUCE_LOGS).add(BetterBiomeBlocks.THIN_SPRUCE_LOG.get().asItem()).add(BetterBiomeBlocks.STRIPPED_THIN_ACACIA_LOG.get().asItem());


    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}