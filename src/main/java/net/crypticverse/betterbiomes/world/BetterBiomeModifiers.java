package net.crypticverse.betterbiomes.world;

import com.bookkeepersmc.notebook.common.world.BiomeRegistry;
import com.bookkeepersmc.notebook.common.world.SelectBiomes;
import dev.architectury.registry.level.biome.BiomeModifications;
import net.crypticverse.betterbiomes.util.BetterBiomesTags;
import net.crypticverse.betterbiomes.world.biome.BetterBiomesBiomes;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;

import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

import net.crypticverse.betterbiomes.BetterBiomes;

public class BetterBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_TREE_MAPLE = registerKey("add_tree_maple");
    public static final ResourceKey<BiomeModifier> ADD_TREE_THIN = registerKey("add_tree_thin");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_TREE_MAPLE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_DENSE_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(BetterBiomePlacedFeatures.MAPLE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

    }



    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(BetterBiomes.MOD_ID, name));
    }
}
