package net.crypticverse.betterbiomes.data;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.BetterBiomeBlocks;
import net.crypticverse.betterbiomes.util.BetterBiomesTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

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
                .add(BetterBiomeBlocks.STRIPPED_MAPLE_WOOD.get().asItem());
        this.tag(ItemTags.PLANKS)
                .add(BetterBiomeBlocks.MAPLE_PLANKS.get().asItem());
        this.tag(BetterBiomesTags.Items.MAPLE_LOGS)
                .add(BetterBiomeBlocks.MAPLE_LOG.get().asItem())
                .add(BetterBiomeBlocks.MAPLE_WOOD.get().asItem())
                .add(BetterBiomeBlocks.STRIPPED_MAPLE_LOG.get().asItem())
                .add(BetterBiomeBlocks.STRIPPED_MAPLE_WOOD.get().asItem());


    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}