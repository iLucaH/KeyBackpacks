package com.ilucah.keybackpacks;

import com.ilucah.keybackpacks.api.KeyBackpacksAPI;
import com.ilucah.keybackpacks.handler.Handler;
import org.bukkit.plugin.java.JavaPlugin;

public final class KeyBackpacks extends JavaPlugin {

    private static KeyBackpacks instance;
    public static KeyBackpacks getInstance() {
        return instance;
    }

    private KeyBackpacksAPI api;
    private Handler handler;

    public KeyBackpacksAPI getAPI() {
        return api;
    }

    public Handler getHandler() {
        return handler;
    }
}
