package net.crypticverse.betterbiomes.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BetterBiomeHangingSignBlockEntity extends SignBlockEntity {
    public BetterBiomeHangingSignBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(pPos, pBlockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return BetterBiomesBlockEntities.BETTER_BIOME_HANGING_SIGN.get();
    }
}
