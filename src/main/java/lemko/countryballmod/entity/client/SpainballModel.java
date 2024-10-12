package lemko.countryballmod.entity.client;

import lemko.countryballmod.CountryballMod;
import lemko.countryballmod.entity.custom.CountryballbaseEntity;
import lemko.countryballmod.entity.custom.SpainballEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class SpainballModel extends GeoModel<SpainballEntity> {
    @Override
    public Identifier getModelResource(SpainballEntity animatable) {
        return Identifier.of(CountryballMod.MOD_ID, "geo/countryball.geo.json");
    }

    @Override
    public Identifier getTextureResource(SpainballEntity animatable) {
        return Identifier.of(CountryballMod.MOD_ID, "textures/entity/spain.png");
    }

    @Override
    public Identifier getAnimationResource(SpainballEntity animatable) {
        return Identifier.of(CountryballMod.MOD_ID, "animations/countryball.animation.json");
    }
}
