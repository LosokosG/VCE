package losokos.vce.custom;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.player.Player;

public class LightningCheck {
    public static boolean LightningCheck(Player player){

        DamageSource isLightningCheck = player.getLastDamageSource();
       return isLightningCheck == DamageSource.LIGHTNING_BOLT;
}
}

