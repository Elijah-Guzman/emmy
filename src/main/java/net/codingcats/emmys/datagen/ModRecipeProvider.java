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
        //Swords
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EMERALD_SWORD)
                .pattern("E")
                .pattern("E")
                .pattern("S")
                .define('E', ModItems.CURSED_EMERALD.get())
                .define('S', Items.STICK)
                .unlockedBy("has_cursed_emerald", has(ModItems.CURSED_EMERALD)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OBSIDIAN_SWORD)
                .pattern("O")
                .pattern("C")
                .pattern("B")
                .define('O', Items.OBSIDIAN)
                .define('C', Items.CRYING_OBSIDIAN)
                .define('B', Items.BLAZE_ROD)
                .unlockedBy("has_crying_obsidian", has(Items.CRYING_OBSIDIAN)).save(recipeOutput);
        //Pickaxes
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.EMERALD_PICKAXE)
                .pattern("EEE")
                .pattern(" S ")
                .pattern(" S ")
                .define('E', ModItems.CURSED_EMERALD.get())
                .define('S', Items.STICK)
                .unlockedBy("has_cursed_emerald", has(ModItems.CURSED_EMERALD)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OBSIDIAN_PICKAXE)
                .pattern("OCO")
                .pattern(" B ")
                .pattern(" B ")
                .define('O', Items.OBSIDIAN)
                .define('C', Items.CRYING_OBSIDIAN)
                .define('B', Items.BLAZE_ROD)
                .unlockedBy("has_crying_obsidian", has(Items.CRYING_OBSIDIAN)).save(recipeOutput);
        //Axes
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.EMERALD_AXE)
                .pattern("EE")
                .pattern("ES")
                .pattern(" S")
                .define('E', ModItems.CURSED_EMERALD.get())
                .define('S', Items.STICK)
                .unlockedBy("has_cursed_emerald", has(ModItems.CURSED_EMERALD)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OBSIDIAN_AXE)
                .pattern("CO")
                .pattern("OB")
                .pattern(" B")
                .define('O', Items.OBSIDIAN)
                .define('C', Items.CRYING_OBSIDIAN)
                .define('B', Items.BLAZE_ROD)
                .unlockedBy("has_crying_obsidian", has(Items.CRYING_OBSIDIAN)).save(recipeOutput);
        //Shovels
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.EMERALD_SHOVEL)
                .pattern("E")
                .pattern("S")
                .pattern("S")
                .define('E', ModItems.CURSED_EMERALD.get())
                .define('S', Items.STICK)
                .unlockedBy("has_cursed_emerald", has(ModItems.CURSED_EMERALD)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OBSIDIAN_SHOVEL)
                .pattern("C")
                .pattern("B")
                .pattern("B")
                .define('C', Items.CRYING_OBSIDIAN)
                .define('B', Items.BLAZE_ROD)
                .unlockedBy("has_crying_obsidian", has(Items.CRYING_OBSIDIAN)).save(recipeOutput);
        //hoes
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.EMERALD_HOE)
                .pattern("EE")
                .pattern("S ")
                .pattern("S ")
                .define('E', ModItems.CURSED_EMERALD.get())
                .define('S', Items.STICK)
                .unlockedBy("has_cursed_emerald", has(ModItems.CURSED_EMERALD)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OBSIDIAN_HOE)
                .pattern("CO")
                .pattern("B ")
                .pattern("B ")
                .define('O', Items.OBSIDIAN)
                .define('C', Items.CRYING_OBSIDIAN)
                .define('B', Items.BLAZE_ROD)
                .unlockedBy("has_crying_obsidian", has(Items.CRYING_OBSIDIAN)).save(recipeOutput);
        //Armor
        //Helmets
//        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EMERALD_HELMET)
//                .pattern("EEE")
//                .pattern("E E")
//                .define('E', ModItems.CURSED_EMERALD.get())
//                .unlockedBy("has_cursed_emerald", has(ModItems.CURSED_EMERALD)).save(recipeOutput);
//        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OBSIDIAN_HELMET)
//                .pattern("OCO")
//                .pattern("O O")
//                .define('O', Items.OBSIDIAN)
//                .define('C', Items.CRYING_OBSIDIAN)
//                .unlockedBy("has_crying_obsidian", has(Items.CRYING_OBSIDIAN)).save(recipeOutput);
//        //Chestplates
//        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EMERALD_CHESTPLATE)
//                .pattern("E E")
//                .pattern("EEE")
//                .pattern("EEE")
//                .define('E', ModItems.CURSED_EMERALD.get())
//                .unlockedBy("has_cursed_emerald", has(ModItems.CURSED_EMERALD)).save(recipeOutput);
//        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OBSIDIAN_CHESTPLATE)
//                .pattern("O O")
//                .pattern("CCC")
//                .pattern("OOO")
//                .define('O', Items.OBSIDIAN)
//                .define('C', Items.CRYING_OBSIDIAN)
//                .unlockedBy("has_crying_obsidian", has(Items.CRYING_OBSIDIAN)).save(recipeOutput);
//        //Leggings
//        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EMERALD_LEGGINGS)
//                .pattern("EEE")
//                .pattern("E E")
//                .pattern("E E")
//                .define('E', ModItems.CURSED_EMERALD.get())
//                .unlockedBy("has_cursed_emerald", has(ModItems.CURSED_EMERALD)).save(recipeOutput);
//        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OBSIDIAN_LEGGINGS)
//                .pattern("CCC")
//                .pattern("O O")
//                .pattern("O O")
//                .define('O', Items.OBSIDIAN)
//                .define('C', Items.CRYING_OBSIDIAN)
//                .unlockedBy("has_crying_obsidian", has(Items.CRYING_OBSIDIAN)).save(recipeOutput);
//        //Boots
//        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EMERALD_BOOTS)
//                .pattern("E E")
//                .pattern("E E")
//                .define('E', ModItems.CURSED_EMERALD.get())
//                .unlockedBy("has_cursed_emerald", has(ModItems.CURSED_EMERALD)).save(recipeOutput);
//        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OBSIDIAN_BOOTS)
//                .pattern("O O")
//                .pattern("C C")
//                .define('O', Items.OBSIDIAN)
//                .define('C', Items.CRYING_OBSIDIAN)
//                .unlockedBy("has_crying_obsidian", has(Items.CRYING_OBSIDIAN)).save(recipeOutput);
    }
}
