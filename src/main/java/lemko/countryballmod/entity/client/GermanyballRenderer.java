package lemko.countryballmod.entity.client;

import lemko.countryballmod.CountryballMod;
import lemko.countryballmod.entity.custom.CountryballbaseEntity;
import lemko.countryballmod.entity.custom.GermanyballEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class GermanyballRenderer extends GeoEntityRenderer<GermanyballEntity> {
    public GermanyballRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new GermanyballModel());
    }

    @Override
    public Identifier getTextureLocation(GermanyballEntity animatable) {
        return Identifier.of(CountryballMod.MOD_ID, "textures/entity/germany.png");
    }

    @Override
    public void render(GermanyballEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }


}
