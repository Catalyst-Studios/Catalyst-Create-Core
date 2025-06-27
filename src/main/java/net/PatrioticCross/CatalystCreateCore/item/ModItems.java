package net.PatrioticCross.CatalystCreateCore.item;

import net.PatrioticCross.CatalystCreateCore.CatalystCreateCore;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CatalystCreateCore.MOD_ID);


public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
}

}
