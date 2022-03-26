package rilyabyss.hookshot;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerFishEvent;

public class Listener implements org.bukkit.event.Listener {

    @EventHandler
    public void onFish(PlayerFishEvent event) {

        Player p = event.getPlayer();

        if (event.getState().equals(PlayerFishEvent.State.REEL_IN)) {
            Location playerLoc = p.getLocation();
            Location hookLoc = event.getHook().getLocation();
            Location value = hookLoc.subtract(playerLoc);
            p.setVelocity(value.toVector().multiply(0.3));
        }

    }

}
