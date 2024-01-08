package net.crypticverse.betterbiomes.data;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.BetterBiomeBlocks;
import net.crypticverse.betterbiomes.item.BetterBiomeItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemModelGenerator extends ItemModelProvider {
    public ItemModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BetterBiomes.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        saplingItem(BetterBiomeBlocks.MAPLE_SAPLING);
        simpleItem(BetterBiomeItems.MAPLE_SIGN);
        simpleItem(BetterBiomeItems.MAPLE_HANGING_SIGN);
        simpleItem(BetterBiomeItems.MAPLE_CHEST_BOAT);
        simpleItem(BetterBiomeItems.MAPLE_BOAT);
        simpleItem(BetterBiomeItems.MAPLE_SYRUP_BUCKET);
        simpleItem(BetterBiomeItems.UNCURED_MAPLE_SYRUP);
        simpleItem(BetterBiomeItems.PANCAKE);
        simpleItem(BetterBiomeItems.MAPLE_PANCAKE);
        simpleItem(BetterBiomeItems.CHOCOLATE_PANCAKE);
        simpleItem(BetterBiomeItems.PANCAKE_STACK);
        simpleItem(BetterBiomeItems.MAPLE_PANCAKE_STACK);
        simpleItem(BetterBiomeItems.CHOCOLATE_PANCAKE_STACK);

        buttonItem(BetterBiomeBlocks.MAPLE_BUTTON, BetterBiomeBlocks.MAPLE_PLANKS);
        fenceItem(BetterBiomeBlocks.MAPLE_FENCE, BetterBiomeBlocks.MAPLE_PLANKS);
        simpleBlockItem(BetterBiomeBlocks.MAPLE_DOOR);

    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BetterBiomes.MOD_ID, "block/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BetterBiomes.MOD_ID,"item/" + item.getId().getPath()));
    }


    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation( BetterBiomes.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation( BetterBiomes.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation( BetterBiomes.MOD_ID,"item/" + item.getId().getPath()));
    }
}