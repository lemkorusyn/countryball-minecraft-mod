package lemko.countryballmod;

import lemko.countryballmod.entity.ModEntities;
import lemko.countryballmod.entity.client.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class CountryballModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.COUNTRYBALLBASE, CountryballbaseRenderer::new);
        EntityRendererRegistry.register(ModEntities.LEMKOBALL, LemkoballRenderer::new);
        EntityRendererRegistry.register(ModEntities.CHINABALL, ChinaballRenderer::new);
        EntityRendererRegistry.register(ModEntities.GERMANYBALL, GermanyballRenderer::new);
        EntityRendererRegistry.register(ModEntities.INDIABALL, IndiaballRenderer::new);
        EntityRendererRegistry.register(ModEntities.RUSSIABALL, RussiaballRenderer::new);
        EntityRendererRegistry.register(ModEntities.SPAINBALL, SpainballRenderer::new);
    }
}
