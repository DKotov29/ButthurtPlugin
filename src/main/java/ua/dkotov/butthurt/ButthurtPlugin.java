package ua.dkotov.butthurt;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.plugin.Plugin;
import org.bukkit.plugin.java.annotation.plugin.author.Author;
import ua.dkotov.butthurt.events.HurtHandler;

@Plugin(name="ButthurtPlugin", version="1.0")
@Author(value = "DKotov")
public class ButthurtPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new HurtHandler(this), this);
    }

    @Override
    public void onDisable() {

    }
}
