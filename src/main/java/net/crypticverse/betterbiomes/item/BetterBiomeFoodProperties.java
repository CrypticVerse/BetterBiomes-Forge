package net.crypticverse.betterbiomes.item;

import net.minecraft.world.food.FoodProperties;

public class BetterBiomeFoodProperties {
    public static final FoodProperties PANCAKE = new FoodProperties.Builder().nutrition(3).saturationMod(0.25f).build();
    public static final FoodProperties MAPLE_PANCAKE = new FoodProperties.Builder().nutrition(4).saturationMod(0.3f).build();
    public static final FoodProperties CHOCOLATE_PANCAKE = new FoodProperties.Builder().nutrition(4).saturationMod(0.3f).build();

    public static final FoodProperties PANCAKE_STACK = new FoodProperties.Builder().nutrition(20).saturationMod(0.7f).build();
    public static final FoodProperties MAPLE_PANCAKE_STACK = new FoodProperties.Builder().nutrition(20).saturationMod(1f).build();
    public static final FoodProperties CHOCOLATE_PANCAKE_STACK = new FoodProperties.Builder().nutrition(20).saturationMod(1f).build();
}
