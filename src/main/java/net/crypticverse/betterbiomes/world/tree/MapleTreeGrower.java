package net.crypticverse.betterbiomes.world.tree;

import org.jetbrains.annotations.Nullable;

import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import net.crypticverse.betterbiomes.world.BetterBiomeConfiguredFeatures;

public class MapleTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
        return BetterBiomeConfiguredFeatures.MAPLE_KEY;
    }
}
