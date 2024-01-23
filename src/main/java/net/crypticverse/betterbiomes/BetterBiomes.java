package net.crypticverse.betterbiomes;

import com.mojang.logging.LogUtils;
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
import net.crypticverse.betterbiomes.world.biome.TerraBlenderAPIPlugin;
import net.crypticverse.betterbiomes.world.biome.surface.BetterBiomesSurfaceRules;
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
import org.slf4j.Logger;
import terrablender.api.SurfaceRuleManager;

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
        Sheets.addWoodType(BetterBiomeWoodTypes.MAPLE);
        TerraBlenderAPIPlugin.registerRegions();
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
            MenuScreens.register(BetterBiomesMenuTypes.MAPLE_SYRUP_MENU.get(), MapleSyrupBoilerScreen::new);
            SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MOD_ID, BetterBiomesSurfaceRules.makeRules());
            EntityRenderers.register(BetterBiomeEntities.MOD_BOAT.get(), pContext -> new BetterBiomeBoatRenderer(pContext, false));
            EntityRenderers.register(BetterBiomeEntities.MOD_CHEST_BOAT.get(), pContext -> new BetterBiomeBoatRenderer(pContext, true));

            ItemBlockRenderTypes.setRenderLayer(BetterBiomeFluids.SOURCE_MAPLE_SYRUP.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(BetterBiomeFluids.FLOWING_MAPLE_SYRUP.get(), RenderType.translucent());

            LOGGER.info("Better Biomes Loaded Successfully!");
        }
    }
}
