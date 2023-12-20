package net.crypticverse.betterbiomes.util;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class BetterBiomeWoodTypes {
    public static final WoodType MAPLE = WoodType.register(new WoodType(BetterBiomes.MOD_ID + ":maple", BlockSetType.OAK));
}
