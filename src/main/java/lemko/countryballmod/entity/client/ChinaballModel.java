package lemko.countryballmod.entity.client;

import lemko.countryballmod.CountryballMod;
import lemko.countryballmod.entity.custom.CountryballbaseEntity;
import lemko.countryballmod.entity.custom.ChinaballEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class ChinaballModel extends GeoModel<ChinaballEntity> {
    @Override
    public Identifier getModelResource(ChinaballEntity animatable) {
        return Identifier.of(CountryballMod.MOD_ID, "geo/countryball.geo.json");
    }

    @Override
    public Identifier getTextureResource(ChinaballEntity animatable) {
        return Identifier.of(CountryballMod.MOD_ID, "textures/entity/china.png");
    }

    @Override
    public Identifier getAnimationResource(ChinaballEntity animatable) {
        return Identifier.of(CountryballMod.MOD_ID, "animations/countryball.animation.json");
    }
}
