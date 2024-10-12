package lemko.countryballmod.entity.client;

import lemko.countryballmod.CountryballMod;
import lemko.countryballmod.entity.custom.CountryballbaseEntity;
import lemko.countryballmod.entity.custom.RussiaballEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class RussiaballRenderer extends GeoEntityRenderer<RussiaballEntity> {
    public RussiaballRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new RussiaballModel());
    }

    @Override
    public Identifier getTextureLocation(RussiaballEntity animatable) {
        return Identifier.of(CountryballMod.MOD_ID, "textures/entity/russia.png");
    }

    @Override
    public void render(RussiaballEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }


}
