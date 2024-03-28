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
package net.crypticverse.betterbiomes.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.BetterBiomeBlocks;

public class BetterBiomeGroup {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterBiomes.MOD_ID);
    public static final RegistryObject<CreativeModeTab> BIOME_TAB = CREATIVE_MODE_TABS.register("biome_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(BetterBiomeBlocks.MAPLE_LOG.get()))
                    .title(Component.translatable("creativetab.biome_group"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(BetterBiomeBlocks.MAPLE_LOG.get());
                        output.accept(BetterBiomeBlocks.MAPLE_WOOD.get());
                        output.accept(BetterBiomeBlocks.STRIPPED_MAPLE_LOG.get());
                        output.accept(BetterBiomeBlocks.STRIPPED_MAPLE_WOOD.get());
                        output.accept(BetterBiomeBlocks.MAPLE_PLANKS.get());
                        output.accept(BetterBiomeItems.MAPLE_BOAT.get());
                        output.accept(BetterBiomeItems.MAPLE_CHEST_BOAT.get());
                        output.accept(BetterBiomeBlocks.MAPLE_STAIRS.get());
                        output.accept(BetterBiomeBlocks.MAPLE_SLAB.get());
                        output.accept(BetterBiomeBlocks.MAPLE_BUTTON.get());
                        output.accept(BetterBiomeBlocks.MAPLE_PRESSURE_PLATE.get());
                        output.accept(BetterBiomeBlocks.MAPLE_FENCE.get());
                        output.accept(BetterBiomeBlocks.MAPLE_FENCE_GATE.get());
                        output.accept(BetterBiomeBlocks.MAPLE_DOOR.get());
                        output.accept(BetterBiomeBlocks.MAPLE_TRAPDOOR.get());
                        output.accept(BetterBiomeItems.PANCAKE.get());
                        output.accept(BetterBiomeItems.PANCAKE_STACK.get());
                        output.accept(BetterBiomeItems.MAPLE_PANCAKE.get());
                        output.accept(BetterBiomeItems.MAPLE_PANCAKE_STACK.get());
                        output.accept(BetterBiomeItems.CHOCOLATE_PANCAKE.get());
                        output.accept(BetterBiomeItems.CHOCOLATE_PANCAKE_STACK.get());
                        output.accept(BetterBiomeItems.MAPLE_SYRUP_BOTTLE.get());

                    }).build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
