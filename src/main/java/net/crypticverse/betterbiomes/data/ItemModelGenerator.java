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
package net.crypticverse.betterbiomes.data;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.BetterBiomeBlocks;
import net.crypticverse.betterbiomes.item.BetterBiomeItems;

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