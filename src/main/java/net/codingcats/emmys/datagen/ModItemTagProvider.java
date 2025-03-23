package net.codingcats.emmys.datagen;

import net.codingcats.emmys.Emmys;
import net.codingcats.emmys.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, Emmys.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.SWORDS)
                .add(ModItems.EMERALD_SWORD.get())
                .add((ModItems.OBSIDIAN_SWORD.get()));
        tag(ItemTags.PICKAXES)
                .add(ModItems.EMERALD_PICKAXE.get())
                .add(ModItems.OBSIDIAN_PICKAXE.get());
        tag(ItemTags.AXES)
                .add(ModItems.EMERALD_AXE.get())
                .add(ModItems.OBSIDIAN_AXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.EMERALD_SHOVEL.get())
                .add(ModItems.OBSIDIAN_SHOVEL.get());
        tag(ItemTags.HOES)
                .add(ModItems.EMERALD_HOE.get())
                .add(ModItems.OBSIDIAN_HOE.get());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.EMERALD_HELMET.get())
                .add(ModItems.EMERALD_CHESTPLATE.get())
                .add(ModItems.EMERALD_LEGGINGS.get())
                .add(ModItems.EMERALD_BOOTS.get())
                .add(ModItems.OBSIDIAN_HELMET.get())
                .add(ModItems.OBSIDIAN_CHESTPLATE.get())
                .add(ModItems.OBSIDIAN_LEGGINGS.get())
                .add(ModItems.OBSIDIAN_BOOTS.get());
    }
}
