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

import java.util.Set;
import java.util.concurrent.CompletableFuture;

import net.crypticverse.betterbiomes.util.BBDamageTypes;
import net.crypticverse.betterbiomes.world.BiomeModifications;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;

import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.world.BetterBiomeConfiguredFeatures;
import net.crypticverse.betterbiomes.world.BetterBiomePlacedFeatures;
import net.crypticverse.betterbiomes.world.biome.BetterBiomesBiomes;
import net.minecraftforge.registries.ForgeRegistries;

public class WorldGenerator extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, BetterBiomeConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, BetterBiomePlacedFeatures::bootstrap)
            .add(Registries.BIOME, BetterBiomesBiomes::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, BiomeModifications::bootstrap)
            .add(Registries.DAMAGE_TYPE, BBDamageTypes::bootstrap);

    public WorldGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(BetterBiomes.MOD_ID));
    }
}
