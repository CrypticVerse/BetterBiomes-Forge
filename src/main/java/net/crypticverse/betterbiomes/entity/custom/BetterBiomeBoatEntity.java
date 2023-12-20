package net.crypticverse.betterbiomes.entity.custom;

import net.crypticverse.betterbiomes.block.BetterBiomeBlocks;
import net.crypticverse.betterbiomes.entity.BetterBiomeEntities;
import net.crypticverse.betterbiomes.item.BetterBiomeItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.util.ByIdMap;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import java.util.function.IntFunction;

public class BetterBiomeBoatEntity extends Boat {
    private static final EntityDataAccessor<Integer> DATA_ID_TYPE = SynchedEntityData.defineId(Boat.class, EntityDataSerializers.INT);

    public BetterBiomeBoatEntity(EntityType<? extends Boat> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

public BetterBiomeBoatEntity(Level level, double pX, double pY, double pZ) {
        this(BetterBiomeEntities.MOD_BOAT.get(), level);
        this.setPos(pX, pY, pZ);
        this.xo = pX;
        this.yo = pY;
        this.zo = pZ;
}

    @Override
    public Item getDropItem() {
        return switch (getModVariant()) {
            case MAPLE -> BetterBiomeItems.MAPLE_BOAT.get();
        };
    }

    public void setVariant(Type pVariant) {
        this.entityData.set(DATA_ID_TYPE, pVariant.ordinal());
    }

    public Type getModVariant() {
        return Type.byId(this.entityData.get(DATA_ID_TYPE));
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_ID_TYPE, Type.MAPLE.ordinal());
    }

    protected void addAdditionalSaveData(CompoundTag pCompound) {
        pCompound.putString("Type", this.getModVariant().getSerializedName());
    }

    protected void readAdditionalSaveData(CompoundTag pCompound) {
        if (pCompound.contains("Type", 8)) {
            this.setVariant(Type.byName(pCompound.getString("Type")));
        }
    }


    public static enum Type implements StringRepresentable {
        MAPLE(BetterBiomeBlocks.MAPLE_PLANKS.get(), "maple");

        private final String name;
        private final Block planks;
        public static final StringRepresentable.EnumCodec<BetterBiomeBoatEntity.Type> CODEC = StringRepresentable.fromEnum(BetterBiomeBoatEntity.Type::values);
        private static final IntFunction<BetterBiomeBoatEntity.Type> BY_ID = ByIdMap.continuous(Enum::ordinal, values(), ByIdMap.OutOfBoundsStrategy.ZERO);

        private Type(Block pPlanks, String pName) {
            this.name = pName;
            this.planks = pPlanks;
        }

        public String getSerializedName() {
            return this.name;
        }

        public String getName() {
            return this.name;
        }

        public Block getPlanks() {
            return this.planks;
        }

        public String toString() {
            return this.name;
        }

        public static BetterBiomeBoatEntity.Type byId(int pId) {
            return BY_ID.apply(pId);
        }

        public static BetterBiomeBoatEntity.Type byName(String pName) {
            return CODEC.byName(pName, MAPLE);
        }
    }
}
