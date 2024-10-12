package lemko.countryballmod.item;

import lemko.countryballmod.CountryballMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup COUNTRYBALL_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CountryballMod.MOD_ID, "countryball_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.COUNTRYBALL_BASE_SPAWN_EGG))
                    .displayName(Text.translatable("itemgroup.countryballmod.countryball_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.COUNTRYBALL_BASE_SPAWN_EGG);
                        entries.add(ModItems.LEMKOBALL_SPAWN_EGG);
                        entries.add(ModItems.GERMANYBALL_SPAWN_EGG);
                        entries.add(ModItems.CHINABALL_SPAWN_EGG);
                        entries.add(ModItems.INDIABALL_SPAWN_EGG);
                        entries.add(ModItems.RUSSIABALL_SPAWN_EGG);
                        entries.add(ModItems.SPAINBALL_SPAWN_EGG);

                    }).build());

    public static void registerItemGroups() {
        CountryballMod.LOGGER.info("Registering Item Groups for " + CountryballMod.MOD_ID);
    }
}