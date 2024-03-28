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
package net.crypticverse.betterbiomes;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;
import terrablender.api.SurfaceRuleManager;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderers;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import net.crypticverse.betterbiomes.block.BetterBiomeBlocks;
import net.crypticverse.betterbiomes.block.entity.BetterBiomesBlockEntities;
import net.crypticverse.betterbiomes.entity.BetterBiomeEntities;
import net.crypticverse.betterbiomes.entity.client.BetterBiomeBoatRenderer;
import net.crypticverse.betterbiomes.fluid.BetterBiomeFluidTypes;
import net.crypticverse.betterbiomes.fluid.BetterBiomeFluids;
import net.crypticverse.betterbiomes.item.BetterBiomeGroup;
import net.crypticverse.betterbiomes.item.BetterBiomeItems;
import net.crypticverse.betterbiomes.recipe.BetterBiomesRecipes;
import net.crypticverse.betterbiomes.screen.BetterBiomesMenuTypes;
import net.crypticverse.betterbiomes.screen.MapleSyrupBoilerScreen;
import net.crypticverse.betterbiomes.util.BetterBiomeWoodTypes;
import net.crypticverse.betterbiomes.world.BiomeModifications;
import net.crypticverse.betterbiomes.world.biome.TerraBlenderAPIPlugin;
import net.crypticverse.betterbiomes.world.biome.surface.BetterBiomesSurfaceRules;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BetterBiomes.MOD_ID)
public class BetterBiomes
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "betterbiomes";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public BetterBiomes() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        BetterBiomeItems.register(modEventBus);
        BetterBiomeBlocks.register(modEventBus);
        BetterBiomesBlockEntities.register(modEventBus);
        BetterBiomesMenuTypes.register(modEventBus);
        BetterBiomesRecipes.register(modEventBus);
        BetterBiomeEntities.register(modEventBus);
        TerraBlenderAPIPlugin.registerRegions();
        BiomeModifications.registerGeneration();
        BetterBiomeGroup.register(modEventBus);
        BetterBiomeFluidTypes.register(modEventBus);
        BetterBiomeFluids.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
        LOGGER.info("Core registries loaded successfully");
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            Sheets.addWoodType(BetterBiomeWoodTypes.MAPLE);
            MenuScreens.register(BetterBiomesMenuTypes.MAPLE_SYRUP_MENU.get(), MapleSyrupBoilerScreen::new);
            SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MOD_ID, BetterBiomesSurfaceRules.makeRules());
            EntityRenderers.register(BetterBiomeEntities.MOD_BOAT.get(), pContext -> new BetterBiomeBoatRenderer(pContext, false));
            EntityRenderers.register(BetterBiomeEntities.MOD_CHEST_BOAT.get(), pContext -> new BetterBiomeBoatRenderer(pContext, true));

            ItemBlockRenderTypes.setRenderLayer(BetterBiomeFluids.SOURCE_MAPLE_SYRUP.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BetterBiomeFluids.FLOWING_MAPLE_SYRUP.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BetterBiomeBlocks.REED.get(), RenderType.cutout());

            LOGGER.info("Better Biomes Loaded Successfully!");
        }
    }
}
