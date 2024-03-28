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
package net.crypticverse.betterbiomes.block;

import java.util.function.Supplier;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.custom.*;
import net.crypticverse.betterbiomes.fluid.BetterBiomeFluids;
import net.crypticverse.betterbiomes.item.BetterBiomeItems;
import net.crypticverse.betterbiomes.util.BetterBiomeWoodTypes;
import net.crypticverse.betterbiomes.world.tree.BetterBiomesSaplingGen;

public class BetterBiomeBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BetterBiomes.MOD_ID);

    // Maple Wood
    public static final RegistryObject<Block> MAPLE_SYRUP_BOILER = registerBlock("maple_syrup_boiler", () -> new MapleSyrupBoilerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> MAPLE_LOG = registerBlock("maple_log", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> MAPLE_WOOD = registerBlock("maple_wood", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> MAPLE_PLANKS = registerBlock("maple_planks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)) {@Override public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {return true;}@Override public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {return 20;}@Override public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {return 5;}});
    public static final RegistryObject<Block> MAPLE_LEAVES = registerBlock("maple_leaves", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)) {@Override public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {return true;}@Override public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {return 60;}@Override public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {return 30;}});
    public static final RegistryObject<Block> MAPLE_SAPLING = registerBlock("maple_sapling", () -> new SaplingBlock(BetterBiomesSaplingGen.MAPLE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> MAPLE_SIGN = BLOCKS.register("maple_sign", () -> new BetterBiomeStandingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN), BetterBiomeWoodTypes.MAPLE));
    public static final RegistryObject<Block> MAPLE_WALL_SIGN = BLOCKS.register("maple_wall_sign", () -> new BetterBiomeWallSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN), BetterBiomeWoodTypes.MAPLE));
    public static final RegistryObject<Block> MAPLE_HANGING_SIGN = BLOCKS.register("maple_hanging_sign", () -> new BetterBiomeHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN), BetterBiomeWoodTypes.MAPLE));
    public static final RegistryObject<Block> MAPLE_WALL_HANGING_SIGN = BLOCKS.register("maple_wall_hanging_sign", () -> new BetterBiomeWalHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN), BetterBiomeWoodTypes.MAPLE));
    public static final RegistryObject<Block> MAPLE_STAIRS = registerBlock("maple_stairs", () -> new StairBlock(BetterBiomeBlocks.MAPLE_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> MAPLE_SLAB = registerBlock("maple_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> MAPLE_BUTTON = registerBlock("maple_button", () -> new ButtonBlock(BlockSetType.OAK, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));
    public static final RegistryObject<Block> MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate", () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final RegistryObject<Block> MAPLE_FENCE = registerBlock("maple_fence", () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> MAPLE_FENCE_GATE = registerBlock("maple_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, WoodType.OAK));
    public static final RegistryObject<Block> MAPLE_DOOR = registerBlock("maple_door", () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion()));
    public static final RegistryObject<Block> MAPLE_TRAPDOOR = registerBlock("maple_trapdoor", () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion()));

    public static final RegistryObject<Block> TAPPED_BUCKET = registerWithoutBlockItem("tapped_bucket_block",
            () -> new TappedBucketBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COCOA).noOcclusion().noCollission()));

    public static final RegistryObject<LiquidBlock> MAPLE_SYRUP_BLOCK = BLOCKS.register("maple_syrup_block",
            () -> new LiquidBlock(BetterBiomeFluids.SOURCE_MAPLE_SYRUP, BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noLootTable()));


    // Thin Logs
    public static final RegistryObject<Block> THIN_ACACIA_LOG = registerBlock("thin_acacia_log", () -> new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_LOG)));
    public static final RegistryObject<Block> THIN_BIRCH_LOG = registerBlock("thin_birch_log", () -> new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_LOG)));
    public static final RegistryObject<Block> THIN_CHERRY_LOG = registerBlock("thin_cherry_log", () -> new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_LOG)));
    public static final RegistryObject<Block> THIN_DARK_OAK_LOG = registerBlock("thin_dark_oak_log", () -> new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_LOG)));
    public static final RegistryObject<Block> THIN_JUNGLE_LOG = registerBlock("thin_jungle_log", () -> new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_LOG)));
    public static final RegistryObject<Block> THIN_MANGROVE_LOG = registerBlock("thin_mangrove_log", () -> new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_LOG)));
    public static final RegistryObject<Block> THIN_OAK_LOG = registerBlock("thin_oak_log", () -> new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> THIN_SPRUCE_LOG = registerBlock("thin_spruce_log", () -> new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_LOG)));

    // Stripped Thin Logs
    public static final RegistryObject<Block> STRIPPED_THIN_ACACIA_LOG = registerBlock("stripped_thin_acacia_log", () -> new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_ACACIA_LOG)));
    public static final RegistryObject<Block> STRIPPED_THIN_BIRCH_LOG = registerBlock("stripped_thin_birch_log", () -> new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_BIRCH_LOG)));
    public static final RegistryObject<Block> STRIPPED_THIN_CHERRY_LOG = registerBlock("stripped_thin_cherry_log", () -> new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_CHERRY_LOG)));
    public static final RegistryObject<Block> STRIPPED_THIN_DARK_OAK_LOG = registerBlock("stripped_thin_dark_oak_log", () -> new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_DARK_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_THIN_JUNGLE_LOG = registerBlock("stripped_thin_jungle_log", () -> new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_JUNGLE_LOG)));
    public static final RegistryObject<Block> STRIPPED_THIN_MANGROVE_LOG = registerBlock("stripped_thin_mangrove_log", () -> new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_MANGROVE_LOG)));
    public static final RegistryObject<Block> STRIPPED_THIN_OAK_LOG = registerBlock("stripped_thin_oak_log", () -> new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_THIN_SPRUCE_LOG = registerBlock("stripped_thin_spruce_log", () -> new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_SPRUCE_LOG)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerWithoutBlockItem(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return BetterBiomeItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
