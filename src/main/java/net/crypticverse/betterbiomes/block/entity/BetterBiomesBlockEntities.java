package net.crypticverse.betterbiomes.block.entity;


import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.BetterBiomeBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BetterBiomesBlockEntities {
        public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
                DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, BetterBiomes.MOD_ID);

        public static final RegistryObject<BlockEntityType<MapleSyrupBoilerBlockEntity>> MAPLE_SYRUP_BOILER_BE =
                BLOCK_ENTITIES.register("maple_syrup_be", () ->
                        BlockEntityType.Builder.of(MapleSyrupBoilerBlockEntity::new,
                                BetterBiomeBlocks.MAPLE_SYRUP_BOILER.get()).build(null));

    public static final RegistryObject<BlockEntityType<BetterBiomeSignBlockEntity>> BETTER_BIOME_SIGN =
            BLOCK_ENTITIES.register("better_biome_sign", () ->
                    BlockEntityType.Builder.of(BetterBiomeSignBlockEntity::new,
                            BetterBiomeBlocks.MAPLE_SIGN.get(), BetterBiomeBlocks.MAPLE_WALL_SIGN.get()).build(null));

        public static final RegistryObject<BlockEntityType<BetterBiomeHangingSignBlockEntity>> BETTER_BIOME_HANGING_SIGN =
                BLOCK_ENTITIES.register("better_biome_hanging_sign", () ->
                        BlockEntityType.Builder.of(BetterBiomeHangingSignBlockEntity::new,
                                BetterBiomeBlocks.MAPLE_HANGING_SIGN.get(), BetterBiomeBlocks.MAPLE_WALL_HANGING_SIGN.get()).build(null));




        public static void register(IEventBus eventBus) {
            BLOCK_ENTITIES.register(eventBus);
        }
    }

