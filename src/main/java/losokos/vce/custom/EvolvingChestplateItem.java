package losokos.vce.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class EvolvingChestplateItem extends ArmorItem {
    public EvolvingChestplateItem(ArmorMaterial material, EquipmentSlot slot, Properties properties) {
        super(material, slot, properties);
}

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if (!world.isClientSide()){
            if(player.experienceLevel >= 10){
                player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 10));
            }
            if(player.experienceLevel >=20){
                player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 10));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2));
            }


        }}}