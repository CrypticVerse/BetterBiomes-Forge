package net.crypticverse.betterbiomes.compat.rei;

import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.crypticverse.betterbiomes.recipe.MapleSyrupRecipe;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MapleSyrupDisplay extends BasicDisplay {
    public MapleSyrupDisplay(List<EntryIngredient> inputs, List<EntryIngredient> outputs) {
        super(inputs, outputs);
    }

    public MapleSyrupDisplay(MapleSyrupRecipe recipe) {
        super (getInputList(recipe), List.of(EntryIngredient.of(EntryStacks.of(recipe.getResultItem(null)))));
    }
    private static List<EntryIngredient> getInputList(MapleSyrupRecipe recipe) {
        if(recipe == null) return Collections.emptyList();
        List<EntryIngredient> list = new ArrayList<>();
        list.add(EntryIngredients.ofIngredient(recipe.getIngredients().get(0)));
        return list;
    }

    @Override
    public CategoryIdentifier<?> getCategoryIdentifier() {
        return MapleSyrupCategory.MAPLE_SYRUP;
    }
}
