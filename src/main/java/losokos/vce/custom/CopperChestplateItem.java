package losokos.vce.custom;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CopperChestplateItem extends ArmorItem {
    public CopperChestplateItem(ArmorMaterial material, EquipmentSlot slot, Item.Properties properties) {
        super(material, slot, properties); }


    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
    if(LightningCheck.LightningCheck(player, world) == true) setDamage(stack, 0);
    }
    }

