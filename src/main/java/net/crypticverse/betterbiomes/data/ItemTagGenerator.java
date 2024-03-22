package net.crypticverse.betterbiomes.data;

import java.util.concurrent.CompletableFuture;

import net.minecraft.tags.ItemTags;
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