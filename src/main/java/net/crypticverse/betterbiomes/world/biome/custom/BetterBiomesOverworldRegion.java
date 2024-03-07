package net.crypticverse.betterbiomes.world.biome.custom;

import java.util.function.Consumer;

import com.mojang.datafixers.util.Pair;
import terrablender.api.Region;
import terrablender.api.RegionType;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;

import net.crypticverse.betterbiomes.world.biome.BetterBiomesBiomes;

public class BetterBiomesOverworldRegion extends Region {
    public BetterBiomesOverworldRegion(ResourceLocation name, int weight) {
        super(name, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint,
            ResourceKey<Biome>>> mapper) {
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> {
            modifiedVanillaOverworldBuilder.replaceBiome(Biomes.FOREST, BetterBiomesBiomes.MAPLE_FOREST);
        });
    }
}