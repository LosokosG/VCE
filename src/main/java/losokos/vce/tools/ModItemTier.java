package losokos.vce.tools;

import losokos.vce.setup.moditems;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;



public class ModItemTier {
    public static  final  ForgeTier COPPER_PICKAXE = new ForgeTier(2,190,7.5f,0,30, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(moditems.COPPER_PICKAXE.get()));
    public static  final  ForgeTier COPPER_AXE = new ForgeTier(2,190,7.5f,4,30, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(moditems.COPPER_AXE.get()));
    public static  final  ForgeTier COPPER_SWORD = new ForgeTier(0,190, 7.5f,2,30, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(moditems.COPPER_SWORD.get()));
    public static  final  ForgeTier COPPER_SHOVEL = new ForgeTier(3,190,7.5f,-1,30, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(moditems.COPPER_SHOVEL.get()));
    public static  final  ForgeTier COPPER_HOE = new ForgeTier(1,190,7.5f,-2,30, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(moditems.COPPER_HOE.get()));



}

