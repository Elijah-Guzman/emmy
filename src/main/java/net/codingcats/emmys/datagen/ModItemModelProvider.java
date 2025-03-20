package net.codingcats.emmys.datagen;

import net.codingcats.emmys.Emmys;
import net.codingcats.emmys.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Emmys.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.CURSED_EMERALD.get());
        basicItem(ModItems.EMERALD_AXE.get());
        basicItem(ModItems.EMERALD_HOE.get());
        basicItem(ModItems.EMERALD_PICKAXE.get());
        basicItem(ModItems.EMERALD_SHOVEL.get());
        basicItem(ModItems.EMERALD_SWORD.get());
        basicItem(ModItems.OBSIDIAN_AXE.get());
        basicItem(ModItems.OBSIDIAN_HOE.get());
        basicItem(ModItems.OBSIDIAN_PICKAXE.get());
        basicItem(ModItems.OBSIDIAN_SHOVEL.get());
        basicItem(ModItems.OBSIDIAN_SWORD.get());
    }
}
