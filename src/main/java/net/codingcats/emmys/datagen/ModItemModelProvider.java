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
        handheldItem(ModItems.EMERALD_AXE.get());
        handheldItem(ModItems.EMERALD_HOE.get());
        handheldItem(ModItems.EMERALD_PICKAXE.get());
        handheldItem(ModItems.EMERALD_SHOVEL.get());
        handheldItem(ModItems.EMERALD_SWORD.get());
        handheldItem(ModItems.OBSIDIAN_AXE.get());
        handheldItem(ModItems.OBSIDIAN_HOE.get());
        handheldItem(ModItems.OBSIDIAN_PICKAXE.get());
        handheldItem(ModItems.OBSIDIAN_SHOVEL.get());
        handheldItem(ModItems.OBSIDIAN_SWORD.get());
    }
}
