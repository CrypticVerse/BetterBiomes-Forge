package net.crypticverse.betterbiomes.data;

import net.crypticverse.betterbiomes.data.loot.BlockLootTablesGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public class LootTableGenerator {
    public static LootTableProvider create(PackOutput packOutput) {
        return new LootTableProvider(packOutput, Set.of(),
                List.of(new LootTableProvider.SubProviderEntry(BlockLootTablesGenerator::new, LootContextParamSets.BLOCK)));
    }
}
