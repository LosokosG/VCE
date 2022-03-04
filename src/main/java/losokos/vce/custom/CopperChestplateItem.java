package losokos.vce.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import static losokos.vce.setup.moditems.COPPER_HELMET;

public class CopperChestplateItem extends ArmorItem {
    public CopperChestplateItem(ArmorMaterial material, EquipmentSlot slot, Item.Properties properties) {
        super(material, slot, properties); }


    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {

        ItemStack getHeadSlot = player.getItemBySlot(EquipmentSlot.HEAD);
        boolean isWearingCopperHelmet = (getHeadSlot.equals((COPPER_HELMET)));

        BlockPos lightningPosCheck = new BlockPos(player.getX(), player.getY(), player.getZ());
        boolean isStruckByLightning = world.getBlockEntity(lightningPosCheck).equals(EntityType.LIGHTNING_BOLT);



        if(isWearingCopperHelmet && isStruckByLightning){
            setDamage(stack,0);
        }
    }
}
