package net.codingcats.emmys.item;

import net.codingcats.emmys.util.ModTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier EMERALD = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_EMERALD_TOOL,
            1700, 7f, 1f, 30, () -> Ingredient.of(ModItems.CURSED_EMERALD));
    public static final Tier OBSIDIAN = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_OBSIDIAN_TOOL,
            900, 10f, 6f, 30, () -> Ingredient.of(Items.OBSIDIAN));
}
