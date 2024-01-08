package net.crypticverse.betterbiomes.data;

import net.crypticverse.betterbiomes.block.BetterBiomeBlocks;
import net.crypticverse.betterbiomes.data.custom.MapleSyrupBoilerRecipeBuilder;
import net.crypticverse.betterbiomes.item.BetterBiomeItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class RecipeGenerator extends RecipeProvider implements IConditionBuilder {
    public RecipeGenerator(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BetterBiomeBlocks.MAPLE_STAIRS.get(), 4).pattern("P  ").pattern("PP ").pattern("PPP").define('P', BetterBiomeBlocks.MAPLE_PLANKS.get()).unlockedBy(getHasName(BetterBiomeBlocks.MAPLE_PLANKS.get()), has(BetterBiomeBlocks.MAPLE_PLANKS.get())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BetterBiomeBlocks.MAPLE_SLAB.get(), 6).pattern("PPP").define('P', BetterBiomeBlocks.MAPLE_PLANKS.get()).unlockedBy(getHasName(BetterBiomeBlocks.MAPLE_PLANKS.get()), has(BetterBiomeBlocks.MAPLE_PLANKS.get())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BetterBiomeBlocks.MAPLE_PRESSURE_PLATE.get(), 1).pattern(" PP").define('P', BetterBiomeBlocks.MAPLE_PLANKS.get()).unlockedBy(getHasName(BetterBiomeBlocks.MAPLE_PLANKS.get()), has(BetterBiomeBlocks.MAPLE_PLANKS.get())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BetterBiomeBlocks.MAPLE_FENCE.get(), 3).pattern("PSP").pattern("PSP").define('P', BetterBiomeBlocks.MAPLE_PLANKS.get()).define('S', Items.STICK).unlockedBy(getHasName(BetterBiomeBlocks.MAPLE_PLANKS.get()), has(BetterBiomeBlocks.MAPLE_PLANKS.get())).unlockedBy(getHasName(Items.STICK), has(Items.STICK)).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BetterBiomeBlocks.MAPLE_FENCE_GATE.get(), 1).pattern("SPS").pattern("SPS").define('P', BetterBiomeBlocks.MAPLE_PLANKS.get()).define('S', Items.STICK).unlockedBy(getHasName(BetterBiomeBlocks.MAPLE_PLANKS.get()), has(BetterBiomeBlocks.MAPLE_PLANKS.get())).unlockedBy(getHasName(Items.STICK), has(Items.STICK)).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BetterBiomeBlocks.MAPLE_DOOR.get(), 3).pattern("PP ").pattern("PP ").pattern("PP ").define('P', BetterBiomeBlocks.MAPLE_PLANKS.get()).unlockedBy(getHasName(BetterBiomeBlocks.MAPLE_PLANKS.get()), has(BetterBiomeBlocks.MAPLE_PLANKS.get())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BetterBiomeBlocks.MAPLE_TRAPDOOR.get(), 2).pattern("PPP").pattern("PPP").define('P', BetterBiomeBlocks.MAPLE_PLANKS.get()).unlockedBy(getHasName(BetterBiomeBlocks.MAPLE_PLANKS.get()), has(BetterBiomeBlocks.MAPLE_PLANKS.get())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TRANSPORTATION, BetterBiomeItems.MAPLE_BOAT.get(), 1).pattern("P P").pattern("PPP").define('P', BetterBiomeBlocks.MAPLE_PLANKS.get()).unlockedBy(getHasName(BetterBiomeBlocks.MAPLE_PLANKS.get()), has(BetterBiomeBlocks.MAPLE_PLANKS.get())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BetterBiomeBlocks.MAPLE_SIGN.get(), 3).pattern("PPP").pattern("PPP").pattern(" S ").define('P', BetterBiomeBlocks.MAPLE_PLANKS.get()).define('S', Items.STICK).unlockedBy(getHasName(BetterBiomeBlocks.MAPLE_PLANKS.get()), has(BetterBiomeBlocks.MAPLE_PLANKS.get())).unlockedBy(getHasName(Items.STICK), has(Items.STICK)).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BetterBiomeBlocks.MAPLE_HANGING_SIGN.get(), 6).pattern("C C").pattern("SSS").pattern("SSS").define('S', BetterBiomeBlocks.STRIPPED_MAPLE_LOG.get()).define('C', Blocks.CHAIN).unlockedBy(getHasName(BetterBiomeBlocks.STRIPPED_MAPLE_LOG.get()), has(BetterBiomeBlocks.STRIPPED_MAPLE_LOG.get())).unlockedBy(getHasName(Blocks.CHAIN), has(Blocks.CHAIN)).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BetterBiomeBlocks.MAPLE_SYRUP_BOILER.get(), 1).pattern("IGI").pattern("III").pattern("ILI").define('I', Items.IRON_INGOT).define('G', Items.GLASS).define('L', Items.LAVA_BUCKET).unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT)).unlockedBy(getHasName(Items.GLASS), has(Items.GLASS)).unlockedBy(getHasName(Items.LAVA_BUCKET), has(Items.LAVA_BUCKET)).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BetterBiomeItems.UNCURED_MAPLE_SYRUP.get(), 1).pattern(" G ").pattern("GBG").pattern(" G ").define('G', Items.GLASS).define('B', BetterBiomeItems.TAPPED_MAPLE_SAP_BUCKET.get()).unlockedBy(getHasName(Items.GLASS), has(Items.IRON_INGOT)).unlockedBy(getHasName(BetterBiomeItems.TAPPED_MAPLE_SAP_BUCKET.get()), has(BetterBiomeItems.TAPPED_MAPLE_SAP_BUCKET.get())).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, BetterBiomeItems.PANCAKE.get() ,3).pattern("WMW").pattern(" E ").pattern("WSW").define('W', Items.WHEAT).define('E', Items.EGG).define('S', Items.SUGAR).define('M', Items.MILK_BUCKET).unlockedBy(getHasName(Items.WHEAT), has(Items.WHEAT)).unlockedBy(getHasName(Items.EGG), has(Items.EGG)).unlockedBy(getHasName(Items.SUGAR), has(Items.SUGAR)).unlockedBy(getHasName(Items.MILK_BUCKET), has(Items.MILK_BUCKET)).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, BetterBiomeItems.PANCAKE_STACK.get(), 1).pattern("PPP").pattern("PPP").pattern("PPP").define('P', BetterBiomeItems.PANCAKE.get()).unlockedBy(getHasName(BetterBiomeItems.PANCAKE.get()), has(BetterBiomeItems.PANCAKE.get())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, BetterBiomeItems.MAPLE_PANCAKE_STACK.get(), 1).pattern("PPP").pattern("PPP").pattern("PPP").define('P', BetterBiomeItems.MAPLE_PANCAKE.get()).unlockedBy(getHasName(BetterBiomeItems.MAPLE_PANCAKE.get()), has(BetterBiomeItems.MAPLE_PANCAKE.get())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, BetterBiomeItems.CHOCOLATE_PANCAKE_STACK.get(), 1).pattern("PPP").pattern("PPP").pattern("PPP").define('P', BetterBiomeItems.CHOCOLATE_PANCAKE.get()).unlockedBy(getHasName(BetterBiomeItems.CHOCOLATE_PANCAKE.get()), has(BetterBiomeItems.CHOCOLATE_PANCAKE.get())).save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, BetterBiomeItems.MAPLE_PANCAKE.get(), 1).requires(BetterBiomeItems.PANCAKE.get()).requires(BetterBiomeItems.MAPLE_SYRUP_BOTTLE.get()).unlockedBy(getHasName(BetterBiomeItems.PANCAKE.get()), has(BetterBiomeItems.PANCAKE.get())).unlockedBy(getHasName(BetterBiomeItems.MAPLE_SYRUP_BOTTLE.get()), has(BetterBiomeItems.MAPLE_SYRUP_BOTTLE.get())).save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, BetterBiomeItems.CHOCOLATE_PANCAKE.get(), 1).requires(BetterBiomeItems.PANCAKE.get()).requires(Items.COCOA_BEANS).unlockedBy(getHasName(BetterBiomeItems.PANCAKE.get()), has(BetterBiomeItems.PANCAKE.get())).unlockedBy(getHasName(Items.COCOA_BEANS), has(Items.COCOA_BEANS)).save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BetterBiomeBlocks.MAPLE_WOOD.get(), 3).requires(BetterBiomeBlocks.MAPLE_LOG.get()).requires(BetterBiomeBlocks.MAPLE_LOG.get()).requires(BetterBiomeBlocks.MAPLE_LOG.get()).requires(BetterBiomeBlocks.MAPLE_LOG.get()).unlockedBy(getHasName(BetterBiomeBlocks.MAPLE_LOG.get()), has(BetterBiomeBlocks.MAPLE_LOG.get())).save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, BetterBiomeBlocks.MAPLE_BUTTON.get(), 1).requires(BetterBiomeBlocks.MAPLE_PLANKS.get()).unlockedBy(getHasName(BetterBiomeBlocks.MAPLE_PLANKS.get()), has(BetterBiomeBlocks.MAPLE_PLANKS.get())).save(pWriter);

        new MapleSyrupBoilerRecipeBuilder(BetterBiomeItems.UNCURED_MAPLE_SYRUP.get(), BetterBiomeItems.MAPLE_SYRUP_BOTTLE.get(), 1)
                .unlockedBy("has_maple_log", has(BetterBiomeBlocks.MAPLE_LOG.get())).save(pWriter);

    }
}
