package losokos.vce.custom;

import net.minecraft.core.Vec3i;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.w3c.dom.events.Event;

import java.util.ArrayList;
import java.util.List;

public class LightningCheck {
    public static boolean LightningCheck(Player player, Level world){


        Vec3i playerPos = new Vec3i(player.getX(), player.getY(), player.getZ());
        List<Entity> checkLightningPos = world.getEntities(world.getEntity(93), AABB.ofSize(Vec3.atCenterOf(playerPos), 2, 2, 2));
        boolean isLightning = checkLightningPos.contains(93);
        boolean temp = isLightning == true;
        isLightning =false;
        return temp;

    }
}
