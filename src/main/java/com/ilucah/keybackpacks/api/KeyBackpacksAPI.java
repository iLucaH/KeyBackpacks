package com.ilucah.keybackpacks.api;

import com.ilucah.keybackpacks.KeyBackpacks;
import com.ilucah.keybackpacks.api.event.KeyGiveEvent;
import com.ilucah.keybackpacks.api.event.KeyallEvent;
import com.ilucah.keybackpacks.backpack.Backpack;
import com.ilucah.keybackpacks.crate.CrateService;
import com.ilucah.keybackpacks.economy.EconomyService;
import de.tr7zw.changeme.nbtapi.NBTItem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.Optional;

public class KeyBackpacksAPI {

    public static KeyBackpacksAPI getInstance() {
        return KeyBackpacks.getInstance().getAPI();
    }

    private KeyBackpacks instance;

    public KeyBackpacksAPI(KeyBackpacks instance) {
        this.instance = instance;
    }

    public boolean hasBackpack(Player player, String name) {
        return instance.getHandler().getBackpack(name).hasThisBackpack(player);
    }

    public boolean hasOwnedBackpack(Player player) {
        return false;
    }

    public Backpack getBackpack(String name) {
        return null;
    }

    public void handleGive(Player player, String key, long amount, boolean fallBack) {}

    public void handleGive(Player player, String key, long amount) {}

    public void handleKeyall(String key, long amount, boolean fallBack, String sender) {}

    public void handleKeyall(String key, long amount, String sender) {}

    public ItemStack getBackpack(Player player) {
        return null;
    }

    public String getBackpackName(ItemStack item) {
        return null;
    }

    public boolean isBackpackItem(ItemStack item) {
        return false;
    }

    public Backpack getBackpack(@Nonnull ItemStack item) {
        return null;
    }

    public CrateService getCrateService() {
        return null;
    }

    public EconomyService getEconomyService() {
        return null;
    }

}
