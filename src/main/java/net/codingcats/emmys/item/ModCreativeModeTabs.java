package net.codingcats.emmys.item;

import net.codingcats.emmys.Emmys;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Emmys.MOD_ID);

    public static final Supplier<CreativeModeTab> EMMYS_ARMOR_TAB = CREATIVE_MODE_TAB.register("emmys_armor_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CURSED_EMERALD.get()))
                    .title(Component.translatable("creativetab.emmys.emmys_armor"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CURSED_EMERALD);
                        output.accept(ModItems.EMERALD_SWORD);
                        output.accept(ModItems.EMERALD_PICKAXE);
                        output.accept(ModItems.EMERALD_AXE);
                        output.accept(ModItems.EMERALD_SHOVEL);
                        output.accept(ModItems.EMERALD_HOE);
                        output.accept(ModItems.OBSIDIAN_SWORD);
                        output.accept(ModItems.OBSIDIAN_PICKAXE);
                        output.accept(ModItems.OBSIDIAN_AXE);
                        output.accept(ModItems.OBSIDIAN_SHOVEL);
                        output.accept(ModItems.OBSIDIAN_HOE);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
