package net.crypticverse.betterbiomes.data;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;

import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.BetterBiomeBlocks;

public class BlockStateGenerator extends BlockStateProvider {
    public BlockStateGenerator(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BetterBiomes.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(BetterBiomeBlocks.MAPLE_SYRUP_BOILER.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/maple_syrup_boiler")));

        // hahaha I LOVE forge. If anyone has got a better way to this, feel free to make a PR!
        simpleBlockWithItem(BetterBiomeBlocks.THIN_ACACIA_LOG.get(), new ModelFile.UncheckedModelFile(modLoc("block/thin_acacia_log")));
        simpleBlockWithItem(BetterBiomeBlocks.THIN_BIRCH_LOG.get(), new ModelFile.UncheckedModelFile(modLoc("block/thin_birch_log")));
        simpleBlockWithItem(BetterBiomeBlocks.THIN_CHERRY_LOG.get(), new ModelFile.UncheckedModelFile(modLoc("block/thin_cherry_log")));
        simpleBlockWithItem(BetterBiomeBlocks.THIN_DARK_OAK_LOG.get(), new ModelFile.UncheckedModelFile(modLoc("block/thin_dark_oak_log")));
        simpleBlockWithItem(BetterBiomeBlocks.THIN_JUNGLE_LOG.get(), new ModelFile.UncheckedModelFile(modLoc("block/thin_jungle_log")));
        simpleBlockWithItem(BetterBiomeBlocks.THIN_MANGROVE_LOG.get(), new ModelFile.UncheckedModelFile(modLoc("block/thin_mangrove_log")));
        simpleBlockWithItem(BetterBiomeBlocks.THIN_OAK_LOG.get(), new ModelFile.UncheckedModelFile(modLoc("block/thin_oak_log")));
        simpleBlockWithItem(BetterBiomeBlocks.THIN_SPRUCE_LOG.get(), new ModelFile.UncheckedModelFile(modLoc("block/thin_spruce_log")));

        // Stripped
        simpleBlockWithItem(BetterBiomeBlocks.STRIPPED_THIN_ACACIA_LOG.get(), new ModelFile.UncheckedModelFile(modLoc("block/stripped_thin_acacia_log")));
        simpleBlockWithItem(BetterBiomeBlocks.STRIPPED_THIN_BIRCH_LOG.get(), new ModelFile.UncheckedModelFile(modLoc("block/stripped_thin_birch_log")));
        simpleBlockWithItem(BetterBiomeBlocks.STRIPPED_THIN_CHERRY_LOG.get(), new ModelFile.UncheckedModelFile(modLoc("block/stripped_thin_cherry_log")));
        simpleBlockWithItem(BetterBiomeBlocks.STRIPPED_THIN_DARK_OAK_LOG.get(), new ModelFile.UncheckedModelFile(modLoc("block/stripped_thin_dark_oak_log")));
        simpleBlockWithItem(BetterBiomeBlocks.STRIPPED_THIN_JUNGLE_LOG.get(), new ModelFile.UncheckedModelFile(modLoc("block/stripped_thin_jungle_log")));
        simpleBlockWithItem(BetterBiomeBlocks.STRIPPED_THIN_MANGROVE_LOG.get(), new ModelFile.UncheckedModelFile(modLoc("block/stripped_thin_mangrove_log")));
        simpleBlockWithItem(BetterBiomeBlocks.STRIPPED_THIN_OAK_LOG.get(), new ModelFile.UncheckedModelFile(modLoc("block/stripped_thin_oak_log")));
        simpleBlockWithItem(BetterBiomeBlocks.STRIPPED_THIN_SPRUCE_LOG.get(), new ModelFile.UncheckedModelFile(modLoc("block/stripped_thin_spruce_log")));

        logBlock(((RotatedPillarBlock) BetterBiomeBlocks.MAPLE_LOG.get()));
        axisBlock(((RotatedPillarBlock) BetterBiomeBlocks.MAPLE_WOOD.get()), blockTexture(BetterBiomeBlocks.MAPLE_LOG.get()), blockTexture(BetterBiomeBlocks.MAPLE_LOG.get()));
        axisBlock((RotatedPillarBlock) BetterBiomeBlocks.STRIPPED_MAPLE_LOG.get(), new ResourceLocation(BetterBiomes.MOD_ID, "block/stripped_maple_log"),
                new ResourceLocation(BetterBiomes.MOD_ID, "block/stripped_maple_log_top"));
        axisBlock((RotatedPillarBlock) BetterBiomeBlocks.STRIPPED_MAPLE_WOOD.get(), new ResourceLocation(BetterBiomes.MOD_ID, "block/stripped_maple_log"),
                new ResourceLocation(BetterBiomes.MOD_ID, "block/stripped_maple_log"));

        blockItem(BetterBiomeBlocks.MAPLE_LOG);
        blockItem(BetterBiomeBlocks.MAPLE_WOOD);
        blockItem(BetterBiomeBlocks.STRIPPED_MAPLE_LOG);
        blockItem(BetterBiomeBlocks.STRIPPED_MAPLE_WOOD);
        blockWithItem(BetterBiomeBlocks.MAPLE_PLANKS);
        leavesBlock(BetterBiomeBlocks.MAPLE_LEAVES);
        saplingBlock(BetterBiomeBlocks.MAPLE_SAPLING);

        blockItem(BetterBiomeBlocks.MAPLE_SLAB);
        blockItem(BetterBiomeBlocks.MAPLE_STAIRS);
        blockItem(BetterBiomeBlocks.MAPLE_PRESSURE_PLATE);
        blockItem(BetterBiomeBlocks.MAPLE_FENCE_GATE);
        blockItem(BetterBiomeBlocks.MAPLE_TRAPDOOR, "_bottom");

        stairsBlock(((StairBlock) BetterBiomeBlocks.MAPLE_STAIRS.get()), blockTexture(BetterBiomeBlocks.MAPLE_PLANKS.get()));
        slabBlock(((SlabBlock) BetterBiomeBlocks.MAPLE_SLAB.get()), blockTexture(BetterBiomeBlocks.MAPLE_PLANKS.get()), blockTexture(BetterBiomeBlocks.MAPLE_PLANKS.get()));
        buttonBlock(((ButtonBlock) BetterBiomeBlocks.MAPLE_BUTTON.get()), blockTexture(BetterBiomeBlocks.MAPLE_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) BetterBiomeBlocks.MAPLE_PRESSURE_PLATE.get()), blockTexture(BetterBiomeBlocks.MAPLE_PLANKS.get()));
        fenceBlock(((FenceBlock) BetterBiomeBlocks.MAPLE_FENCE.get()), blockTexture(BetterBiomeBlocks.MAPLE_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) BetterBiomeBlocks.MAPLE_FENCE_GATE.get()), blockTexture(BetterBiomeBlocks.MAPLE_PLANKS.get()));
        doorBlockWithRenderType(((DoorBlock) BetterBiomeBlocks.MAPLE_DOOR.get()), modLoc("block/maple_door_bottom"), modLoc("block/maple_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) BetterBiomeBlocks.MAPLE_TRAPDOOR.get()), modLoc("block/maple_trapdoor"), true, "cutout");


        signBlock(((StandingSignBlock) BetterBiomeBlocks.MAPLE_SIGN.get()), ((WallSignBlock) BetterBiomeBlocks.MAPLE_WALL_SIGN.get()),
                blockTexture(BetterBiomeBlocks.MAPLE_PLANKS.get()));
        hangingSignBlock(BetterBiomeBlocks.MAPLE_HANGING_SIGN.get(), BetterBiomeBlocks.MAPLE_WALL_HANGING_SIGN.get(),
                blockTexture(BetterBiomeBlocks.MAPLE_PLANKS.get()));

    }

    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("betterbiomes:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().cubeAll(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("betterbiomes:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
