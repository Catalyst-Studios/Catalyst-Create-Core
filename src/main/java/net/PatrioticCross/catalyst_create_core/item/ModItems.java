package net.PatrioticCross.catalyst_create_core.item;

import net.PatrioticCross.catalyst_create_core.catalyst_create_core;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(catalyst_create_core.MOD_ID);

public static final DeferredItem<Item> INACTIVE_BLANK_PATTERN = ITEMS.registerSimpleItem( "inactive_blank_pattern");
public static final DeferredItem<Item> INACTIVE_INSCRIBER_CALCULATION_PRESS = ITEMS.registerSimpleItem( "inactive_inscriber_calculation_press");
public static final DeferredItem<Item> INACTIVE_INSCRIBER_LOGIC_PRESS = ITEMS.registerSimpleItem( "inactive_inscriber_logic_press");
public static final DeferredItem<Item> INACTIVE_INSCRIBER_ENGINEERING_PRESS = ITEMS.registerSimpleItem( "inactive_inscriber_engineering_press");
public static final DeferredItem<Item> INACTIVE_INSCRIBER_silicon_PRESS = ITEMS.registerSimpleItem( "inactive_inscriber_silicon_press");
public static final DeferredItem<Item> INACTIVE_PRINTED_CALCULATION_CIRCUIT = ITEMS.registerSimpleItem( "inactive_printed_calculation_circuit");
public static final DeferredItem<Item> INACTIVE_PRINTED_ENGINEERING_CIRCUIT = ITEMS.registerSimpleItem( "inactive_printed_engineering_circuit");
public static final DeferredItem<Item> INACTIVE_PRINTED_LOGIC_CIRCUIT = ITEMS.registerSimpleItem( "inactive_printed_logic_circuit");
public static final DeferredItem<Item> INACTIVE_PRINTED_SILICON_CIRCUIT = ITEMS.registerSimpleItem( "inactive_printed_silicon_circuit");
public static final DeferredItem<Item> INACTIVE_LOGIC_PROCESSOR = ITEMS.registerSimpleItem( "inactive_logic_processor");
public static final DeferredItem<Item> INACTIVE_CALCULATION_PROCESSOR = ITEMS.registerSimpleItem( "inactive_calculation_processor");
public static final DeferredItem<Item> INACTIVE_ENGINEERING_PROCESSOR = ITEMS.registerSimpleItem( "inactive_engineering_processor");
public static final DeferredItem<Item> INACTIVE_ENERGY_PROCESSOR = ITEMS.registerSimpleItem( "inactive_energy_processor");
public static final DeferredItem<Item> INACTIVE_INSCRIBER_ENERGY_PRESS = ITEMS.registerSimpleItem( "inactive_inscriber_energy_press");
public static final DeferredItem<Item> INACTIVE_PRINTED_ENERGY_PROCESSOR = ITEMS.registerSimpleItem( "inactive_printed_energy_processor");

public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
}

}
