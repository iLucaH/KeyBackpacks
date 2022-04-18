package com.ilucah.keybackpacks.economy.provider;

import org.bukkit.OfflinePlayer;

public interface EconomyProvider {

    long getBalance(OfflinePlayer player);

    void removeAmount(OfflinePlayer player, long amount);
}
