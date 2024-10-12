package lemko.countryballmod;

import lemko.countryballmod.entity.ModEntities;
import lemko.countryballmod.entity.custom.*;
import lemko.countryballmod.item.ModItemGroups;
import lemko.countryballmod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CountryballMod implements ModInitializer {
	public static final String MOD_ID = "countryballmod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		FabricDefaultAttributeRegistry.register(ModEntities.COUNTRYBALLBASE, CountryballbaseEntity.setAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.LEMKOBALL, LemkoballEntity.setAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.CHINABALL, ChinaballEntity.setAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.GERMANYBALL, GermanyballEntity.setAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.INDIABALL, IndiaballEntity.setAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.RUSSIABALL, RussiaballEntity.setAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.SPAINBALL, SpainballEntity.setAttributes());


		ModEntities.registerModEntities();
		ModItems.registerModItems();
	}
}