package losokos.vce.custom;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import org.w3c.dom.events.Event;

public class LightningCheck {
    public LightningCheck(Player player, Level world, Event event){

       double playerPos = player.getX() + player.getY() + player.getZ();
        boolean isLightning = world.getEntities(, AABB.ofSize(Vec3.ZERO,2,2, 1));
    }

}
