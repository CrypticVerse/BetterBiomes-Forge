package net.crypticverse.betterbiomes.entity.client;

import java.util.Map;
import java.util.stream.Stream;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;

import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.model.ListModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.vehicle.Boat;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.entity.custom.BetterBiomeBoatEntity;
import net.crypticverse.betterbiomes.entity.custom.BetterBiomeChestBoatEntity;

public class BetterBiomeBoatRenderer extends BoatRenderer {
    private final Map<BetterBiomeBoatEntity.Type, Pair<ResourceLocation, ListModel<Boat>>> boatResources;

    public BetterBiomeBoatRenderer(EntityRendererProvider.Context pContext, boolean pChestBoat) {
        super(pContext, pChestBoat);
        this.boatResources = Stream.of(BetterBiomeBoatEntity.Type.values()).collect(ImmutableMap.toImmutableMap(type -> type,
                type -> Pair.of(new ResourceLocation(BetterBiomes.MOD_ID, getTextureLocation(type, pChestBoat)), this.createBoatModel(pContext, type, pChestBoat))));
    }

    private static String getTextureLocation(BetterBiomeBoatEntity.Type pType, boolean pChestBoat) {
        return pChestBoat ? "textures/entity/chest_boat/" + pType.getName() + ".png" : "textures/entity/boat/" + pType.getName() + ".png";
    }
    private ListModel<Boat> createBoatModel(EntityRendererProvider.Context pContext, BetterBiomeBoatEntity.Type pType, boolean pChestBoat) {
        ModelLayerLocation modelLayerLocation = pChestBoat ? BetterBiomeBoatRenderer.createChestBoatModelName(pType) : BetterBiomeBoatRenderer.createBoatModelName(pType);
        ModelPart modelPart = pContext.bakeLayer(modelLayerLocation);
        return pChestBoat ? new ChestBoatModel(modelPart) : new BoatModel(modelPart);
    }
    public static ModelLayerLocation createBoatModelName(BetterBiomeBoatEntity.Type pType) {
        return createLocation("boat/" + pType.getName(), "main");

    }    public static ModelLayerLocation createChestBoatModelName(BetterBiomeBoatEntity.Type pType) {
        return createLocation("chest_boat/" + pType.getName(), "main");
    }
    private static ModelLayerLocation createLocation(String pPath, String pModel) {
        return new ModelLayerLocation(new ResourceLocation(BetterBiomes.MOD_ID, pPath), pModel);
    }

    public Pair<ResourceLocation, ListModel<Boat>> getModelWithLocation(Boat boat) {
        if(boat instanceof BetterBiomeBoatEntity modBoat) {
            return this.boatResources.get(modBoat.getModVariant());
        } else if(boat instanceof BetterBiomeChestBoatEntity modChestBoatEntity) {
            return this.boatResources.get(modChestBoatEntity.getModVariant());
        } else {
            return null;
        }
    }
}
