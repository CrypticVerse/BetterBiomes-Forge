package net.crypticverse.betterbiomes.compat.jei;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.recipe.MapleSyrupRecipe;
import net.crypticverse.betterbiomes.screen.MapleSyrupBoilerScreen;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;

@JeiPlugin
public class BetterBiomesJEIPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(BetterBiomes.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new MapleSyrupCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<MapleSyrupRecipe> boilingRecipes = recipeManager.getAllRecipesFor(MapleSyrupRecipe.Type.INSTANCE);
        registration.addRecipes(MapleSyrupCategory.MAPLE_SYRUP_TYPE, boilingRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(MapleSyrupBoilerScreen.class, 60, 30, 20, 30,
                MapleSyrupCategory.MAPLE_SYRUP_TYPE);
    }
}
