package lemko.countryballmod.entity.client;

import lemko.countryballmod.CountryballMod;
import lemko.countryballmod.entity.custom.CountryballbaseEntity;
import lemko.countryballmod.entity.custom.RussiaballEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class RussiaballModel extends GeoModel<RussiaballEntity> {
    @Override
    public Identifier getModelResource(RussiaballEntity animatable) {
        return Identifier.of(CountryballMod.MOD_ID, "geo/countryball.geo.json");
    }

    @Override
    public Identifier getTextureResource(RussiaballEntity animatable) {
        return Identifier.of(CountryballMod.MOD_ID, "textures/entity/russia.png");
    }

    @Override
    public Identifier getAnimationResource(RussiaballEntity animatable) {
        return Identifier.of(CountryballMod.MOD_ID, "animations/countryball.animation.json");
    }
}
