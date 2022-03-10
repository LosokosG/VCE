package losokos.vce.custom;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CopperHelmetItem extends ArmorItem {
    public CopperHelmetItem(ArmorMaterial material, EquipmentSlot slot, Properties properties) {
        super(material, slot, properties);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {

        Entity lightningEntity = new LightningBolt(EntityType.LIGHTNING_BOLT, world);
        lightningEntity.setPos(player.getX(),player.getY(),player.getZ());

        if(world.isThundering()) {
            int TickTimer = 0;
            ++TickTimer;

            int random = (int) (Math.random() * 16000 + 1);
            if (TickTimer == random) {
                world.addFreshEntity(lightningEntity);
                setDamage(stack, 0);
                }
            }
        }
        }



    /*@Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if (!world.isClientSide()){
            player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 200));
        }
    }*/



