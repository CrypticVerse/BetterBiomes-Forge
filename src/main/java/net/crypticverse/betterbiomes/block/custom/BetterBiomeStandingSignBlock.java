package net.crypticverse.betterbiomes.block.custom;

import net.crypticverse.betterbiomes.block.entity.BetterBiomeSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class BetterBiomeStandingSignBlock extends StandingSignBlock {
    public BetterBiomeStandingSignBlock(Properties pProperties, WoodType pType) {
        super(pProperties, pType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new BetterBiomeSignBlockEntity(pPos, pState);
    }
}
