package lemko.countryballmod.item;

import lemko.countryballmod.CountryballMod;
import lemko.countryballmod.entity.ModEntities;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item COUNTRYBALL_BASE_SPAWN_EGG = registerItem("countryball_base_spawn_egg",
            new SpawnEggItem(ModEntities.COUNTRYBALLBASE, 0xa86518, 0x3b260f, new Item.Settings()));
    public static final Item LEMKOBALL_SPAWN_EGG = registerItem("lemkoball_spawn_egg",
            new SpawnEggItem(ModEntities.LEMKOBALL, 0xa86518, 0x3b260f, new Item.Settings()));
    public static final Item GERMANYBALL_SPAWN_EGG = registerItem("germanyball_spawn_egg",
            new SpawnEggItem(ModEntities.GERMANYBALL, 0xa86518, 0x3b260f, new Item.Settings()));
    public static final Item SPAINBALL_SPAWN_EGG = registerItem("spainball_spawn_egg",
            new SpawnEggItem(ModEntities.SPAINBALL, 0xa86518, 0x3b260f, new Item.Settings()));
    public static final Item INDIABALL_SPAWN_EGG = registerItem("indiaball_spawn_egg",
            new SpawnEggItem(ModEntities.INDIABALL, 0xa86518, 0x3b260f, new Item.Settings()));
    public static final Item CHINABALL_SPAWN_EGG = registerItem("chinaball_spawn_egg",
            new SpawnEggItem(ModEntities.CHINABALL, 0xa86518, 0x3b260f, new Item.Settings()));
    public static final Item RUSSIABALL_SPAWN_EGG = registerItem("russiaball_spawn_egg",
            new SpawnEggItem(ModEntities.RUSSIABALL, 0xa86518, 0x3b260f, new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CountryballMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CountryballMod.LOGGER.info("Registering Mod Items for " + CountryballMod.MOD_ID);
    }
}
