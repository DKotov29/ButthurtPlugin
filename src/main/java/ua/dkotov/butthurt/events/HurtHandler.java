package ua.dkotov.butthurt.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import ua.dkotov.butthurt.ButthurtPlugin;

public class HurtHandler implements Listener {

    private ButthurtPlugin main;

    public HurtHandler(ButthurtPlugin butthurtPlugin) {
        this.main = butthurtPlugin;
    }

    @EventHandler
    public void entity_attacked_event(EntityDamageByEntityEvent event) {
        if (event.getDamager().getType() == EntityType.PLAYER && event.getEntity().getType() == EntityType.PLAYER) {
            Player damager = (Player) event.getDamager();
            Player damaged = (Player) event.getEntity();

            String to_send = damaged.getDisplayName() + " ";

            int a = (int) (damaged.getHealth() / damaged.getMaxHealth() * damaged.getHealthScale());
            for (int i = 0; i < a; i++) {
                to_send += "§4♥";
            }
            a = (int) (damaged.getMaxHealth() * damaged.getHealthScale()) - a;
            for (int i = 0; i < a; i++) {
                to_send += "§7♥";
            }
            damager.sendTitle("", to_send);
        }
    }
}
