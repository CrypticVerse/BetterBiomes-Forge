package net.crypticverse.betterbiomes.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BetterBiomeSignBlockEntity extends SignBlockEntity {
    public BetterBiomeSignBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(pPos, pBlockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return BetterBiomesBlockEntities.BETTER_BIOME_SIGN.get();
    }
}
