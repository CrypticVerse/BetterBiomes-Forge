package net.crypticverse.betterbiomes.entity.custom;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.entity.vehicle.ChestBoat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

import net.crypticverse.betterbiomes.entity.BetterBiomeEntities;
import net.crypticverse.betterbiomes.item.BetterBiomeItems;

public class BetterBiomeChestBoatEntity extends ChestBoat {
    private static final EntityDataAccessor<Integer> DATA_ID_TYPE = SynchedEntityData.defineId(Boat.class, EntityDataSerializers.INT);

    public BetterBiomeChestBoatEntity(EntityType<? extends ChestBoat> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public BetterBiomeChestBoatEntity(Level pLevel, double pX, double pY, double pZ) {
        this(BetterBiomeEntities.MOD_CHEST_BOAT.get(), pLevel);
        this.setPos(pX, pY, pZ);
        this.xo = pX;
        this.yo = pY;
        this.zo = pZ;
    }

    @Override
    public Item getDropItem() {
        switch (getModVariant()) {
            case MAPLE -> {
                return BetterBiomeItems.MAPLE_CHEST_BOAT.get();
            }
        }
        return super.getDropItem();
    }

    public void setVariant(BetterBiomeBoatEntity.Type pVariant) {
        this.entityData.set(DATA_ID_TYPE, pVariant.ordinal());
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_ID_TYPE, BetterBiomeBoatEntity.Type.MAPLE.ordinal());
    }

    protected void addAdditionalSaveData(CompoundTag pCompound) {
        pCompound.putString("Type", this.getModVariant().getSerializedName());
    }

    protected void readAdditionalSaveData(CompoundTag pCompound) {
        if (pCompound.contains("Type", 8)) {
            this.setVariant(BetterBiomeBoatEntity.Type.byName(pCompound.getString("Type")));
        }
    }

    public BetterBiomeBoatEntity.Type getModVariant() {
        return BetterBiomeBoatEntity.Type.byId(this.entityData.get(DATA_ID_TYPE));
    }
}
