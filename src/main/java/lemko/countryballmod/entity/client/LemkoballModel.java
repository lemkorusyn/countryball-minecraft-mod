package lemko.countryballmod.entity.client;

import lemko.countryballmod.CountryballMod;
import lemko.countryballmod.entity.custom.CountryballbaseEntity;
import lemko.countryballmod.entity.custom.LemkoballEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class LemkoballModel extends GeoModel<LemkoballEntity> {
    @Override
    public Identifier getModelResource(LemkoballEntity animatable) {
        return Identifier.of(CountryballMod.MOD_ID, "geo/countryball.geo.json");
    }

    @Override
    public Identifier getTextureResource(LemkoballEntity animatable) {
        return Identifier.of(CountryballMod.MOD_ID, "textures/entity/lemko.png");
    }

    @Override
    public Identifier getAnimationResource(LemkoballEntity animatable) {
        return Identifier.of(CountryballMod.MOD_ID, "animations/countryball.animation.json");
    }
}
