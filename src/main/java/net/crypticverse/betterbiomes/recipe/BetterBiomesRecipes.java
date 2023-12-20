package net.crypticverse.betterbiomes.recipe;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BetterBiomesRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, BetterBiomes.MOD_ID);

    public static final RegistryObject<RecipeSerializer<MapleSyrupRecipe>> MAPLE_SYRUP_SERIALIZER =
            SERIALIZERS.register("gem_polishing", () -> MapleSyrupRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
