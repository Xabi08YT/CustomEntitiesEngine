package fuffly.xabi08yt.customentitiesengine.customentitiesengine;

import org.bukkit.plugin.java.JavaPlugin;

public final class CustomEntitiesEngine extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Hello World");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("See ya !");
    }
}
