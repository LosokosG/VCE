package losokos.vce.tools;

import losokos.vce.setup.ModArmorMaterial;
import losokos.vce.vce;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

import static net.minecraft.world.item.Items.COPPER_INGOT;

public final class ModArmorTier {
    public static final ArmorMaterial COPPER = new ModArmorMaterial(100, new int[] {950, 1400, 1800, 1000},new int[] {0, 0, 0, 0}, 3f, 1.85f, vce.MOD_ID + ":copper", SoundEvents.ARMOR_EQUIP_IRON, () -> Ingredient.of(COPPER_INGOT));

   private ModArmorTier(){
    }
}
