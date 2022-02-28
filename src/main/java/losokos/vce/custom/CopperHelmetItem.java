package losokos.vce.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.IBlockRenderProperties;
import net.minecraftforge.common.extensions.IForgeBlockState;

import java.util.concurrent.TimeUnit;

public class CopperHelmetItem extends ArmorItem {
    public CopperHelmetItem(ArmorMaterial material, EquipmentSlot slot, Properties properties) {
        super(material, slot, properties);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if (!world.isClientSide()){


            if(world.isThundering()){
                //Adds "lightningEntity" that spawns lightning at players location
                Entity lightningEntity = new LightningBolt(EntityType.LIGHTNING_BOLT, world);
                lightningEntity.setPos(player.getX(),player.getY(),player.getZ());

                    //Spawns "lightningEntity" every x seconds
                    try {

                        Thread.sleep(1000);
                        world.addFreshEntity(lightningEntity);
                    } catch (InterruptedException e) {
                        world.addFreshEntity(lightningEntity);
                    }



            }
        }
    }}

    /*@Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if (!world.isClientSide()){
            player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 200));
        }
    }*/



