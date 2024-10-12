package lemko.countryballmod.entity.client;

import lemko.countryballmod.CountryballMod;
import lemko.countryballmod.entity.custom.CountryballbaseEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class CountryballbaseModel extends GeoModel<CountryballbaseEntity> {
    @Override
    public Identifier getModelResource(CountryballbaseEntity animatable) {
        return Identifier.of(CountryballMod.MOD_ID, "geo/countryball.geo.json");
    }

    @Override
    public Identifier getTextureResource(CountryballbaseEntity animatable) {
        return Identifier.of(CountryballMod.MOD_ID, "textures/entity/countryball.png");
    }

    @Override
    public Identifier getAnimationResource(CountryballbaseEntity animatable) {
        return Identifier.of(CountryballMod.MOD_ID, "animations/countryball.animation.json");
    }
}
