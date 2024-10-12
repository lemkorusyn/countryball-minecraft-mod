package lemko.countryballmod.entity.client;

import lemko.countryballmod.CountryballMod;
import lemko.countryballmod.entity.custom.CountryballbaseEntity;
import lemko.countryballmod.entity.custom.SpainballEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class SpainballRenderer extends GeoEntityRenderer<SpainballEntity> {
    public SpainballRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new SpainballModel());
    }

    @Override
    public Identifier getTextureLocation(SpainballEntity animatable) {
        return Identifier.of(CountryballMod.MOD_ID, "textures/entity/spain.png");
    }

    @Override
    public void render(SpainballEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }


}
