package losokos.vce.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class CopperLightningWandItem extends Item {
    public CopperLightningWandItem(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(pContext.getLevel().isClientSide()){
            BlockPos positionClicked = pContext.getClickedPos();
            Player player = pContext.getPlayer();

            if(IsCopperBlock(Block)){

            }
        }

    }

    private void SummonLightning(BlockPos blockPos){
        int x = blockPos.getX();
        int y = blockPos.getY();
        int z = blockPos.getZ();
       p
    }

    private boolean IsCopperBlock(Block block){
        return block == Blocks.COPPER_BLOCK;
    }
}
