package net.crypticverse.betterbiomes.data;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.BetterBiomeBlocks;
import net.crypticverse.betterbiomes.util.BetterBiomesTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class BlockTagGenerator extends BlockTagsProvider {
    public BlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, BetterBiomes.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(BetterBiomeBlocks.MAPLE_LOG.get())
                .add(BetterBiomeBlocks.MAPLE_WOOD.get())
                .add(BetterBiomeBlocks.STRIPPED_MAPLE_LOG.get())
                .add(BetterBiomeBlocks.STRIPPED_MAPLE_WOOD.get());
        this.tag(BlockTags.LOGS)
                .add(BetterBiomeBlocks.MAPLE_LOG.get())
                .add(BetterBiomeBlocks.MAPLE_WOOD.get())
                .add(BetterBiomeBlocks.STRIPPED_MAPLE_LOG.get())
                .add(BetterBiomeBlocks.STRIPPED_MAPLE_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(BetterBiomeBlocks.MAPLE_PLANKS.get());

        this.tag(BlockTags.LEAVES)
                .add(BetterBiomeBlocks.MAPLE_LEAVES.get());

        this.tag(BetterBiomesTags.Blocks.MAPLE_LOGS)
                .add(BetterBiomeBlocks.MAPLE_LOG.get())
                .add(BetterBiomeBlocks.MAPLE_WOOD.get())
                .add(BetterBiomeBlocks.STRIPPED_MAPLE_LOG.get())
                .add(BetterBiomeBlocks.STRIPPED_MAPLE_WOOD.get());

        this.tag(BlockTags.FENCES)
                .add(BetterBiomeBlocks.MAPLE_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(BetterBiomeBlocks.MAPLE_FENCE_GATE.get());
        this.tag(BlockTags.WOODEN_TRAPDOORS)
                .add(BetterBiomeBlocks.MAPLE_TRAPDOOR.get());
        this.tag(BlockTags.WOODEN_DOORS)
                .add(BetterBiomeBlocks.MAPLE_DOOR.get());
        this.tag(BlockTags.WOODEN_STAIRS)
                .add(BetterBiomeBlocks.MAPLE_STAIRS.get());
        this.tag(BlockTags.WOODEN_SLABS)
                .add(BetterBiomeBlocks.MAPLE_SLAB.get());
        this.tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(BetterBiomeBlocks.MAPLE_PRESSURE_PLATE.get());
        this.tag(BlockTags.WOODEN_BUTTONS)
                .add(BetterBiomeBlocks.MAPLE_BUTTON.get());
        this.tag(BlockTags.WOODEN_FENCES)
                .add(BetterBiomeBlocks.MAPLE_FENCE.get())
                .add(BetterBiomeBlocks.MAPLE_FENCE_GATE.get());
        this.tag(BlockTags.STANDING_SIGNS)
                .add(BetterBiomeBlocks.MAPLE_SIGN.get());
        this.tag(BlockTags.WALL_SIGNS)
                .add(BetterBiomeBlocks.MAPLE_WALL_SIGN.get());
        this.tag(BlockTags.CEILING_HANGING_SIGNS)
                .add(BetterBiomeBlocks.MAPLE_HANGING_SIGN.get());
        this.tag(BlockTags.WALL_HANGING_SIGNS)
                .add(BetterBiomeBlocks.MAPLE_WALL_HANGING_SIGN.get());


    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
