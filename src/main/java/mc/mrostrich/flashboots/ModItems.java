package mc.mrostrich.flashboots;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.*;
import net.minecraft.resources.Registry.*;
import net.minecraft.resources.Identifier;

import java.util.function.Function;

public class ModItems {

    public static final Item FLASH_CORE = registerItem("flash_core", Item::new);

    public static final Item FLASH_BOOTS = registerItem("flash_boots", 
        settings -> new net.minecraft.world.item.ArmorItem(ArmorMaterials.TURTLE, EquipmentType.BOOTS, settings));

    private static Item registerItem(String name, Function<Item.Settings, Item> factory) {
        Identifier id = Identifier.of("flashboots", name); //
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        
        Item.Settings settings = new Item.Settings().registryKey(key);
        Item item = factory.apply(settings);
        
        return Registry.register(Registries.ITEM, key, item);
    }

    public static void registerModItems() {
        // Triggers static initialization
    }
}