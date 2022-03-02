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
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public class CopperHelmetItem extends ArmorItem {
    public CopperHelmetItem(ArmorMaterial material, EquipmentSlot slot, Properties properties) {
        super(material, slot, properties);
    }


    static int worldHeightCheck() {


        int i;
        for (i = 0; i <= 368; ++i) {

            if (i == 368) {
                i = 0;
            }
            return i;
        }
        return i;
    }

    static boolean isOutside(Level world, Player player,boolean isOutsideCheck){

        BlockPos posAbove = new BlockPos(player.blockPosition().above(worldHeightCheck()));
        BlockState blockStateAbove = world.getBlockState(posAbove);
        Block above = blockStateAbove.getBlock();


        if(above.equals(Material.AIR)){
            isOutsideCheck = true;
        }
        return isOutsideCheck;
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if (!world.isClientSide()){
            }

            if(world.isThundering()){
                Entity lightningEntity = new LightningBolt(EntityType.LIGHTNING_BOLT, world);
                lightningEntity.setPos(player.getX(),player.getY(),player.getZ());


                    if (isOutside(world, player, true) == true) {

                        world.addFreshEntity(lightningEntity);
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



