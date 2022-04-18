package com.ilucah.keybackpacks.crate;

import com.ilucah.keybackpacks.KeyBackpacks;
import com.ilucah.keybackpacks.crate.provider.*;
import com.ilucah.keybackpacks.file.FileModule;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.concurrent.ConcurrentHashMap;

public class CrateService {

    public void load(KeyBackpacks plugin, String serviceHandle, FileModule fileModule) {
    }

    public boolean isRateLimited() {
        return false;
    }

    public void setRateLimited(boolean rateLimited) {
    }

    public ConcurrentHashMap<OfflinePlayer, Long> getRateLimits() {
        return null;
    }

    public boolean isHooked() {
        return false;
    }

    public void setHooked(boolean hooked) {
    }

    public CrateProvider getProvider() {
        return null;
    }

    public void setProvider(CrateProvider provider) {
    }

    public ItemStack getPhysicalKey(Player player, String key) {
        return null;
    }

    public void openKeys(Player player, String key, long keys) {
    }

    public long getRateLimitedAmount(Player player, long keys) {
        return 0L;
    }

    public void addRateLimits(Player player, long amount) {
    }

    public void clearRateLimites(Player player) {
    }
}
