package lemko.countryballmod.entity;

import lemko.countryballmod.CountryballMod;
import lemko.countryballmod.entity.custom.*;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<CountryballbaseEntity> COUNTRYBALLBASE = Registry.register(
            Registries.ENTITY_TYPE, Identifier.of(CountryballMod.MOD_ID, "countryballbase"),
            EntityType.Builder.<CountryballbaseEntity>create((type, world) -> new CountryballbaseEntity(type, world), SpawnGroup.MISC)
                    .dimensions(0.3f, 0.3f)
                    .maxTrackingRange(4)
                    .trackingTickInterval(1)
                    .build()
    );
    public static final EntityType<LemkoballEntity> LEMKOBALL = Registry.register(
            Registries.ENTITY_TYPE, Identifier.of(CountryballMod.MOD_ID, "lemkoball"),
            EntityType.Builder.<LemkoballEntity>create(LemkoballEntity::new, SpawnGroup.MISC)
                    .dimensions(0.3f, 0.3f)
                    .maxTrackingRange(4)
                    .trackingTickInterval(1)
                    .build()
    );
    public static final EntityType<ChinaballEntity> CHINABALL = Registry.register(
            Registries.ENTITY_TYPE, Identifier.of(CountryballMod.MOD_ID, "chinaball"),
            EntityType.Builder.<ChinaballEntity>create(ChinaballEntity::new, SpawnGroup.MISC)
                    .dimensions(0.3f, 0.3f)
                    .maxTrackingRange(4)
                    .trackingTickInterval(1)
                    .build()
    );
    public static final EntityType<GermanyballEntity> GERMANYBALL = Registry.register(
            Registries.ENTITY_TYPE, Identifier.of(CountryballMod.MOD_ID, "germanyball"),
            EntityType.Builder.<GermanyballEntity>create(GermanyballEntity::new, SpawnGroup.MISC)
                    .dimensions(0.3f, 0.3f)
                    .maxTrackingRange(4)
                    .trackingTickInterval(1)
                    .build()
    );
    public static final EntityType<IndiaballEntity> INDIABALL = Registry.register(
            Registries.ENTITY_TYPE, Identifier.of(CountryballMod.MOD_ID, "indiaball"),
            EntityType.Builder.<IndiaballEntity>create(IndiaballEntity::new, SpawnGroup.MISC)
                    .dimensions(0.3f, 0.3f)
                    .maxTrackingRange(4)
                    .trackingTickInterval(1)
                    .build()
    );
    public static final EntityType<RussiaballEntity> RUSSIABALL = Registry.register(
            Registries.ENTITY_TYPE, Identifier.of(CountryballMod.MOD_ID, "russiaball"),
            EntityType.Builder.<RussiaballEntity>create(RussiaballEntity::new, SpawnGroup.MISC)
                    .dimensions(0.3f, 0.3f)
                    .maxTrackingRange(4)
                    .trackingTickInterval(1)
                    .build()
    );
    public static final EntityType<SpainballEntity> SPAINBALL = Registry.register(
            Registries.ENTITY_TYPE, Identifier.of(CountryballMod.MOD_ID, "spainball"),
            EntityType.Builder.<SpainballEntity>create(SpainballEntity::new, SpawnGroup.MISC)
                    .dimensions(0.3f, 0.3f)
                    .maxTrackingRange(4)
                    .trackingTickInterval(1)
                    .build()
    );

    public static void registerModEntities() {
        CountryballMod.LOGGER.info("Registering Entities for " + CountryballMod.MOD_ID);
    }
}
