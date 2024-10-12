package lemko.countryballmod.entity.client;

import lemko.countryballmod.CountryballMod;
import lemko.countryballmod.entity.custom.CountryballbaseEntity;
import lemko.countryballmod.entity.custom.IndiaballEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class IndiaballModel extends GeoModel<IndiaballEntity> {
    @Override
    public Identifier getModelResource(IndiaballEntity animatable) {
        return Identifier.of(CountryballMod.MOD_ID, "geo/countryball.geo.json");
    }

    @Override
    public Identifier getTextureResource(IndiaballEntity animatable) {
        return Identifier.of(CountryballMod.MOD_ID, "textures/entity/india.png");
    }

    @Override
    public Identifier getAnimationResource(IndiaballEntity animatable) {
        return Identifier.of(CountryballMod.MOD_ID, "animations/countryball.animation.json");
    }
}
