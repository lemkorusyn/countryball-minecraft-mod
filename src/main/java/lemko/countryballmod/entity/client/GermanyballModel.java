package lemko.countryballmod.entity.client;

import lemko.countryballmod.CountryballMod;
import lemko.countryballmod.entity.custom.CountryballbaseEntity;
import lemko.countryballmod.entity.custom.GermanyballEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class GermanyballModel extends GeoModel<GermanyballEntity> {
    @Override
    public Identifier getModelResource(GermanyballEntity animatable) {
        return Identifier.of(CountryballMod.MOD_ID, "geo/countryball.geo.json");
    }

    @Override
    public Identifier getTextureResource(GermanyballEntity animatable) {
        return Identifier.of(CountryballMod.MOD_ID, "textures/entity/germany.png");
    }

    @Override
    public Identifier getAnimationResource(GermanyballEntity animatable) {
        return Identifier.of(CountryballMod.MOD_ID, "animations/countryball.animation.json");
    }
}
