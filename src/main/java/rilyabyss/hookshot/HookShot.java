package rilyabyss.hookshot;

import org.bukkit.plugin.java.JavaPlugin;

public final class HookShot extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Listener(), this);
    }

    @Override
    public void onDisable() {

    }
}
