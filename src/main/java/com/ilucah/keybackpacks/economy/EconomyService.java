package com.ilucah.keybackpacks.economy;

import com.ilucah.keybackpacks.KeyBackpacks;
import com.ilucah.keybackpacks.economy.provider.*;
import org.bukkit.OfflinePlayer;

public class EconomyService {

    public void load(KeyBackpacks plugin, String serviceHandle) {
    }

    public boolean isHooked() {
        return false;
    }

    public long getBalance(OfflinePlayer player) {
        return 0L;
    }

    public void removeAmount(OfflinePlayer player, long amount) {
    }

    public EconomyProvider getProvider() {
        return null;
    }

    public void setProvider(EconomyProvider provider) {}
}
