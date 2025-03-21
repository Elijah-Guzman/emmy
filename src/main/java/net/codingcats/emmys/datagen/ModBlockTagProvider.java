package net.codingcats.emmys.datagen;

import net.codingcats.emmys.Emmys;
import net.codingcats.emmys.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Emmys.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Blocks.NEEDS_EMERALD_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_EMERALD_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .remove(ModTags.Blocks.NEEDS_EMERALD_TOOL);

        tag(ModTags.Blocks.NEEDS_OBSIDIAN_TOOL)
                .addTag(BlockTags.NEEDS_STONE_TOOL)
                .add(Blocks.OBSIDIAN)
                .add(Blocks.CRYING_OBSIDIAN)
                .add(Blocks.RESPAWN_ANCHOR)
                .add(Blocks.ENCHANTING_TABLE)
                .add(Blocks.ENDER_CHEST)
                .add(Blocks.BEACON);

        tag(ModTags.Blocks.INCORRECT_FOR_OBSIDIAN_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_STONE_TOOL)
                .remove(ModTags.Blocks.NEEDS_OBSIDIAN_TOOL);
    }
}
