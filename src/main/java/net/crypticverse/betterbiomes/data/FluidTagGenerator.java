package net.crypticverse.betterbiomes.data;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.FluidTagsProvider;
import net.minecraft.tags.FluidTags;

import net.minecraftforge.common.data.ExistingFileHelper;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.fluid.BetterBiomeFluids;

public class FluidTagGenerator extends FluidTagsProvider {
    public FluidTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pProvider, BetterBiomes.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(FluidTags.WATER)
                .add(BetterBiomeFluids.SOURCE_MAPLE_SYRUP.get())
                .add(BetterBiomeFluids.FLOWING_MAPLE_SYRUP.get());
    }
}
