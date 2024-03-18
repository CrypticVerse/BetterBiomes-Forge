package net.crypticverse.betterbiomes.data;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.world.BetterBiomeConfiguredFeatures;
import net.crypticverse.betterbiomes.world.BetterBiomeModifiers;
import net.crypticverse.betterbiomes.world.BetterBiomePlacedFeatures;
import net.crypticverse.betterbiomes.world.biome.BetterBiomesBiomes;

public class WorldGenerator extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, BetterBiomeConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, BetterBiomePlacedFeatures::bootstrap)
            .add(Registries.BIOME, BetterBiomesBiomes::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, BetterBiomeModifiers::bootstrap);

    public WorldGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(BetterBiomes.MOD_ID));
    }
}
