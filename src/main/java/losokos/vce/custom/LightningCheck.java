package losokos.vce.custom;

import com.mojang.math.Vector3f;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.w3c.dom.events.Event;

import java.util.ArrayList;
import java.util.List;

public class LightningCheck {
    public static boolean LightningCheck(Player player){

/*
        Vec3i playerPos = new Vec3i(player.getX(), player.getY(), player.getZ());
        List<Entity> checkLightningPos = world.getEntities(world.getEntity(93), AABB.ofSize(Vec3.atCenterOf(playerPos), 2, 2, 2));
        boolean isLightning = checkLightningPos.contains(93);
        boolean temp = isLightning == true;
        return temp;

    }
*/
       Entity isLightningCheck = player.getLastHurtMob();
       boolean isLightning = isLightningCheck.equals(93);


       return isLightning;
}
}

