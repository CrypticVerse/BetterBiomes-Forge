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
package net.crypticverse.betterbiomes.block.entity;


import net.minecraft.world.level.block.entity.BlockEntityType;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.BetterBiomeBlocks;

public class BetterBiomesBlockEntities {
        public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
                DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, BetterBiomes.MOD_ID);

        public static final RegistryObject<BlockEntityType<MapleSyrupBoilerBlockEntity>> MAPLE_SYRUP_BOILER_BE =
                BLOCK_ENTITIES.register("maple_syrup_be", () ->
                        BlockEntityType.Builder.of(MapleSyrupBoilerBlockEntity::new,
                                BetterBiomeBlocks.MAPLE_SYRUP_BOILER.get()).build(null));

    public static final RegistryObject<BlockEntityType<BetterBiomeSignBlockEntity>> BETTER_BIOME_SIGN =
            BLOCK_ENTITIES.register("better_biome_sign", () ->
                    BlockEntityType.Builder.of(BetterBiomeSignBlockEntity::new,
                            BetterBiomeBlocks.MAPLE_SIGN.get(), BetterBiomeBlocks.MAPLE_WALL_SIGN.get()).build(null));

        public static final RegistryObject<BlockEntityType<BetterBiomeHangingSignBlockEntity>> BETTER_BIOME_HANGING_SIGN =
                BLOCK_ENTITIES.register("better_biome_hanging_sign", () ->
                        BlockEntityType.Builder.of(BetterBiomeHangingSignBlockEntity::new,
                                BetterBiomeBlocks.MAPLE_HANGING_SIGN.get(), BetterBiomeBlocks.MAPLE_WALL_HANGING_SIGN.get()).build(null));




        public static void register(IEventBus eventBus) {
            BLOCK_ENTITIES.register(eventBus);
        }
    }
