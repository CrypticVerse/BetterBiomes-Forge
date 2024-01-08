package net.crypticverse.betterbiomes.item;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.BetterBiomeBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

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
