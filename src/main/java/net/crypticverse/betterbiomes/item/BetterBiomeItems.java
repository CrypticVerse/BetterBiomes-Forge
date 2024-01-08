package net.crypticverse.betterbiomes.item;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.BetterBiomeBlocks;
import net.crypticverse.betterbiomes.entity.custom.BetterBiomeBoatEntity;
import net.crypticverse.betterbiomes.fluid.BetterBiomeFluids;
import net.crypticverse.betterbiomes.item.custom.BetterBiomeBoatItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BetterBiomeItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BetterBiomes.MOD_ID);

    public static final RegistryObject<Item> MAPLE_SIGN = ITEMS.register("maple_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), BetterBiomeBlocks.MAPLE_SIGN.get(), BetterBiomeBlocks.MAPLE_WALL_SIGN.get()));
    public static final RegistryObject<Item> MAPLE_HANGING_SIGN = ITEMS.register("maple_hanging_sign",
            () -> new HangingSignItem(BetterBiomeBlocks.MAPLE_HANGING_SIGN.get(), BetterBiomeBlocks.MAPLE_WALL_HANGING_SIGN.get(),
                    new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> MAPLE_BOAT = ITEMS.register("maple_boat",
            () -> new BetterBiomeBoatItem(false, BetterBiomeBoatEntity.Type.MAPLE, new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_CHEST_BOAT = ITEMS.register("maple_chest_boat",
            () -> new BetterBiomeBoatItem(true, BetterBiomeBoatEntity.Type.MAPLE, new Item.Properties()));

    public static final RegistryObject<Item> MAPLE_SYRUP_BOTTLE = ITEMS.register("maple_syrup_bottle",
            () -> new Item(new Item.Properties().craftRemainder(Items.GLASS_BOTTLE)));

    public static final RegistryObject<Item> MAPLE_SYRUP_BUCKET = ITEMS.register("maple_syrup_bucket",
            () -> new BucketItem(BetterBiomeFluids.SOURCE_MAPLE_SYRUP, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> TAPPED_MAPLE_SAP_BUCKET = ITEMS.register("tapped_maple_sap_bucket",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> UNCURED_MAPLE_SYRUP = ITEMS.register("uncured_maple_syrup",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TAPPED_BUCKET = ITEMS.register("tapped_bucket",
            () -> new ItemNameBlockItem(BetterBiomeBlocks.TAPPED_BUCKET.get(), new Item.Properties()));


    public static final RegistryObject<Item> PANCAKE = ITEMS.register("pancake", () -> new Item(new Item.Properties().food(BetterBiomeFoodProperties.PANCAKE)));
    public static final RegistryObject<Item> MAPLE_PANCAKE = ITEMS.register("maple_pancake",() -> new Item(new Item.Properties().food(BetterBiomeFoodProperties.MAPLE_PANCAKE)));
    public static final RegistryObject<Item> CHOCOLATE_PANCAKE = ITEMS.register("chocolate_pancake", () -> new Item(new Item.Properties().food(BetterBiomeFoodProperties.CHOCOLATE_PANCAKE)));
    public static final RegistryObject<Item> PANCAKE_STACK = ITEMS.register("pancake_stack", () -> new Item(new Item.Properties().food(BetterBiomeFoodProperties.PANCAKE_STACK)));
    public static final RegistryObject<Item> MAPLE_PANCAKE_STACK = ITEMS.register("maple_pancake_stack", () -> new Item(new Item.Properties().food(BetterBiomeFoodProperties.MAPLE_PANCAKE_STACK)));
    public static final RegistryObject<Item> CHOCOLATE_PANCAKE_STACK = ITEMS.register("chocolate_pancake_stack", () -> new Item(new Item.Properties().food(BetterBiomeFoodProperties.CHOCOLATE_PANCAKE_STACK)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
