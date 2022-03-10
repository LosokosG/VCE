package losokos.vce.custom;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CopperLeggingsItem extends ArmorItem {
    public CopperLeggingsItem(ArmorMaterial material, EquipmentSlot slot, Properties properties) {
        super(material, slot, properties); }


    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
    if(LightningCheck.LightningCheck(player) == true) setDamage(stack, 0);
    }
    }

