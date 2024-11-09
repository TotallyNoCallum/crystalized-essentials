package gg.crystalized.essentials;

import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Level;

public final class crystalized_essentials extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().log(Level.INFO, "Crystalized Essentials Plugin Enabled!");
        this.getServer().getPluginManager().registerEvents(new CustomSwords(), this);
    }

    @Override
    public void onDisable() {
        getLogger().log(Level.INFO, "Crystalized Essentials Plugin Disabled!");
    }
}
