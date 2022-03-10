package losokos.vce.world.entity.projectile;

import losokos.vce.setup.moditems;
import losokos.vce.world.entity.ModEntityType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CopperArrow extends AbstractArrow {
    private final Item refferenceItem;
    public CopperArrow(EntityType<? extends AbstractArrow> type, Level world) {
        super(type, world);
        this.refferenceItem = moditems.COPPER_ARROW.get();
    }

    public CopperArrow(LivingEntity shooter, Level world, Item refferenceItem) {
        super(ModEntityType.COPPER_ARROW.get(),shooter, world);
        this.refferenceItem = refferenceItem;
    }

    @Override
    protected ItemStack getPickupItem() {
        return new ItemStack(this.refferenceItem)
;    }
}
