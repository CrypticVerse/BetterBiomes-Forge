/*
 * MIT License
 *
 * Copyright (c) 2023 CrypticVerse
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */
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
