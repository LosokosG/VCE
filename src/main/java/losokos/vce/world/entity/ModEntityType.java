package losokos.vce.world.entity;

import losokos.vce.vce;
import losokos.vce.world.entity.projectile.CopperArrow;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityType {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, vce.MOD_ID);



//COPPER_ARROW ENTITY TYPE

    // ARROW ENTITY TYPE TEMPLATE:
    // public static final EntityType<Arrow> ARROW = register("arrow", EntityType.Builder.<Arrow>of(Arrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20));

    public static final RegistryObject<EntityType<CopperArrow>> COPPER_ARROW = ENTITIES.register("copper_arrow",
        () -> EntityType.Builder.<CopperArrow>of(CopperArrow::new, MobCategory.MISC).sized(0.5F,0.5F).clientTrackingRange(4).updateInterval(20).build
                (new ResourceLocation(vce.MOD_ID, "copper_arrow").toString()));


    public static void register(IEventBus eventBus){
        ENTITIES.register(eventBus);
    }
}
