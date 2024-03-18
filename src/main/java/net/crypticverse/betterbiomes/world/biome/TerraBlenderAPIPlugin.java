package net.crypticverse.betterbiomes.world.biome;

import terrablender.api.Regions;

import net.minecraft.resources.ResourceLocation;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.world.biome.custom.BetterBiomesOverworldRegion;

public class TerraBlenderAPIPlugin {
    public static void registerRegions() {
        Regions.register(new BetterBiomesOverworldRegion(new ResourceLocation(BetterBiomes.MOD_ID, "overworld"), 5));
    }
}
