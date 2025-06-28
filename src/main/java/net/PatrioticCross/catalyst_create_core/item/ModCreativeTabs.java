package net.PatrioticCross.catalyst_create_core.item;


import net.PatrioticCross.catalyst_create_core.catalyst_create_core;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import javax.swing.*;
import java.util.function.Supplier;


public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, catalyst_create_core.MOD_ID);

        public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TAB_1 = TABS.register("catalyst_create_core",
                () -> CreativeModeTab.builder()
                        .title(Component.translatable("itemgroup.catalyst_core_main"))
                        .icon(ModItems.INACTIVE_BLANK_PATTERN.get()::getDefaultInstance)
                        .displayItems((itemDisplayParameters, output) ->
                        {
                            for (DeferredHolder<Item, ? extends Item> item: ModItems.ITEMS.getEntries())
                            {
                                output.accept(item.get().getDefaultInstance());
                            }
                        })
                        .build());


    public static void register(IEventBus eventBus)
    {
        TABS.register(eventBus);
        //eventBus.register(TABS);
    }
}
