package net.crypticverse.betterbiomes.data.loot;

import java.util.Set;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import net.minecraftforge.registries.RegistryObject;

import net.crypticverse.betterbiomes.block.BetterBiomeBlocks;
import net.crypticverse.betterbiomes.item.BetterBiomeItems;

public class BlockLootTablesGenerator extends BlockLootSubProvider {
    public BlockLootTablesGenerator() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropOther(BetterBiomeBlocks.TAPPED_BUCKET.get(), BetterBiomeItems.TAPPED_MAPLE_SAP_BUCKET.get());
        this.dropSelf(BetterBiomeBlocks.MAPLE_SYRUP_BOILER.get());
        this.dropSelf(BetterBiomeBlocks.MAPLE_LOG.get());
        this.dropSelf(BetterBiomeBlocks.MAPLE_WOOD.get());
        this.dropSelf(BetterBiomeBlocks.STRIPPED_MAPLE_LOG.get());
        this.dropSelf(BetterBiomeBlocks.STRIPPED_MAPLE_WOOD.get());
        this.dropSelf(BetterBiomeBlocks.MAPLE_PLANKS.get());
        this.dropSelf(BetterBiomeBlocks.MAPLE_SAPLING.get());
        this.add(BetterBiomeBlocks.MAPLE_LEAVES.get(), block ->
                createLeavesDrops(block, BetterBiomeBlocks.MAPLE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(BetterBiomeBlocks.MAPLE_SIGN.get(), block ->
                createSingleItemTable(BetterBiomeItems.MAPLE_SIGN.get()));
        this.add(BetterBiomeBlocks.MAPLE_WALL_SIGN.get(), block ->
                createSingleItemTable(BetterBiomeItems.MAPLE_SIGN.get()));
        this.add(BetterBiomeBlocks.MAPLE_HANGING_SIGN.get(), block ->
                createSingleItemTable(BetterBiomeItems.MAPLE_HANGING_SIGN.get()));
        this.add(BetterBiomeBlocks.MAPLE_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(BetterBiomeItems.MAPLE_HANGING_SIGN.get()));
        this.dropSelf(BetterBiomeBlocks.MAPLE_STAIRS.get());
        this.dropSelf(BetterBiomeBlocks.MAPLE_BUTTON.get());
        this.dropSelf(BetterBiomeBlocks.MAPLE_PRESSURE_PLATE.get());
        this.dropSelf(BetterBiomeBlocks.MAPLE_TRAPDOOR.get());
        this.dropSelf(BetterBiomeBlocks.MAPLE_FENCE.get());
        this.dropSelf(BetterBiomeBlocks.MAPLE_FENCE_GATE.get());
        this.dropSelf(BetterBiomeBlocks.MAPLE_SYRUP_BOILER.get());
        this.add( BetterBiomeBlocks.MAPLE_SLAB.get(),
                block -> createSlabItemTable( BetterBiomeBlocks.MAPLE_SLAB.get()));
        this.add( BetterBiomeBlocks.MAPLE_DOOR.get(),
                block -> createDoorTable( BetterBiomeBlocks.MAPLE_DOOR.get()));

        // Thin Logs
        dropSelf(BetterBiomeBlocks.THIN_ACACIA_LOG.get());
        dropSelf(BetterBiomeBlocks.THIN_BIRCH_LOG.get());
        dropSelf(BetterBiomeBlocks.THIN_CHERRY_LOG.get());
        dropSelf(BetterBiomeBlocks.THIN_DARK_OAK_LOG.get());
        dropSelf(BetterBiomeBlocks.THIN_JUNGLE_LOG.get());
        dropSelf(BetterBiomeBlocks.THIN_MANGROVE_LOG.get());
        dropSelf(BetterBiomeBlocks.THIN_OAK_LOG.get());
        dropSelf(BetterBiomeBlocks.THIN_SPRUCE_LOG.get());
        dropSelf(BetterBiomeBlocks.STRIPPED_THIN_ACACIA_LOG.get());
        dropSelf(BetterBiomeBlocks.STRIPPED_THIN_BIRCH_LOG.get());
        dropSelf(BetterBiomeBlocks.STRIPPED_THIN_CHERRY_LOG.get());
        dropSelf(BetterBiomeBlocks.STRIPPED_THIN_DARK_OAK_LOG.get());
        dropSelf(BetterBiomeBlocks.STRIPPED_THIN_JUNGLE_LOG.get());
        dropSelf(BetterBiomeBlocks.STRIPPED_THIN_MANGROVE_LOG.get());
        dropSelf(BetterBiomeBlocks.STRIPPED_THIN_OAK_LOG.get());
        dropSelf(BetterBiomeBlocks.STRIPPED_THIN_SPRUCE_LOG.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BetterBiomeBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}