package net.codingcats.emmys.item;

import net.codingcats.emmys.Emmys;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Emmys.MOD_ID);

    public static final DeferredItem<Item> CURSED_EMERALD = ITEMS.register("cursed_emerald",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
