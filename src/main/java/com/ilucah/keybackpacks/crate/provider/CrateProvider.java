package com.ilucah.keybackpacks.crate.provider;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface CrateProvider {

    void openKeys(Player player, String key, long keys);

    ItemStack getKeyItem(Player player, String key);

}
