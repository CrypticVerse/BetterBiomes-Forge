package net.crypticverse.betterbiomes.fluid;

import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.BetterBiomeBlocks;
import net.crypticverse.betterbiomes.item.BetterBiomeItems;

public class BetterBiomeFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, BetterBiomes.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_MAPLE_SYRUP = FLUIDS.register("maple_syrup_fluid",
            () -> new ForgeFlowingFluid.Source(BetterBiomeFluids.MAPLE_SYRUP_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MAPLE_SYRUP = FLUIDS.register("flowing_maple_syrup_fluid",
            () -> new ForgeFlowingFluid.Flowing(BetterBiomeFluids.MAPLE_SYRUP_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MAPLE_SYRUP_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            BetterBiomeFluidTypes.MAPLE_SYRUP_FLUID_TYPE, SOURCE_MAPLE_SYRUP, FLOWING_MAPLE_SYRUP)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(BetterBiomeBlocks.MAPLE_SYRUP_BLOCK)
            .bucket(BetterBiomeItems.MAPLE_SYRUP_BUCKET);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
