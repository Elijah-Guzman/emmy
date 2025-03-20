package net.codingcats.emmys.datagen;

import net.codingcats.emmys.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CURSED_EMERALD.get())
                .pattern("ERE")
                .pattern("RSR")
                .pattern("ERE")
                .define('E', Items.EMERALD)
                .define('R', Items.REDSTONE)
                .define('S', Items.SOUL_SAND)
                .unlockedBy("has_emerald", has(Items.EMERALD)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CRYING_OBSIDIAN)
                .pattern("G")
                .pattern("O")
                .define('G', Items.GHAST_TEAR)
                .define('O', Items.OBSIDIAN)
                .unlockedBy("has_ghast_tear", has(Items.GHAST_TEAR)).save(recipeOutput);
    }
}
