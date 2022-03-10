package losokos.client.renderer.entity;

import losokos.vce.vce;
import losokos.vce.world.entity.projectile.CopperArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


@OnlyIn(Dist.CLIENT)
public class CopperArrowRenderer extends ArrowRenderer<CopperArrow> {
    public CopperArrowRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(CopperArrow pEntity) {
        Item referenceItem = pEntity.getPickResult().getItem();
        return new ResourceLocation(vce.MOD_ID, "textures/entity/projectiles/" + referenceItem.getRegistryName().getPath() + ".png");
    }
}
