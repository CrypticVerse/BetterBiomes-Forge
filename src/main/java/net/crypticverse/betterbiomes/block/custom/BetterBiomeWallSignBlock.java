package net.crypticverse.betterbiomes.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

import net.crypticverse.betterbiomes.block.entity.BetterBiomeSignBlockEntity;

public class BetterBiomeWallSignBlock extends WallSignBlock {
    public BetterBiomeWallSignBlock(Properties pProperties, WoodType pType) {
        super(pType, pProperties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new BetterBiomeSignBlockEntity(pPos, pState);
    }
}
