package com.ilucah.keybackpacks.backpack;

import de.tr7zw.changeme.nbtapi.NBTItem;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class Backpack {

    public void giveBackpack(Player player) {
    }

    public ItemStack createNewBackpack(Player player) {
        return null;
    }

    public void addKeys(Player player, ItemStack item, String key, long value) {
    }

    public void update(Player player, ItemStack item) {
    }

    public void setKeys(ItemStack item, String key, long value) {
    }

    public void removeKeys(ItemStack item, String key, long value) {
    }

    public long getTotalKeys(NBTItem nbtItem) {
        return 0L;
    }

    public boolean hasSoulboundCheckedBackpack(Player player) {
        return false;
    }

    public boolean hasThisBackpack(Player player) {
        return false;
    }

    public boolean handleSoulboundGive(Player player, String key, long value, boolean fallback) {
        return false;
    }

    public ItemStack getBackpack(Player player) {
        return null;
    }

    public long getCapacity(ItemStack item) {
        return 0L;
    }

    public long getCapacity(NBTItem item) {
        return 0L;
    }

    public void setCapacity(ItemStack item, long amount) {
    }

    public boolean isWithinCapacityLimit(long currentCapacity, long amountToGive) {
        return false;
    }

    public boolean canOpen(Player player, NBTItem item) {
        return false;
    }

    public long getKeys(ItemStack item, String key) {
        return 0L;
    }

    public boolean isSoulbound() {
        return false;
    }

    public void setSoulbound(boolean soulbound) {
    }

    public boolean isRequiresPermission() {
        return false;
    }

    public void setRequiresPermission(boolean requiresPermission) {
    }

    public boolean isKeepOnDeath() {
        return false;
    }

    public void setKeepOnDeath(boolean keepOnDeath) {
    }

    public boolean isInfinite() {
        return false;
    }

    public void setInfinite(boolean infinite) {
    }

    public boolean isUpgradeable() {
        return false;
    }

    public void setUpgradeable(boolean upgradeable) {
    }

    public boolean isUsingUpgradeSound() {
        return false;
    }

    public void setUsingUpgradeSound(boolean usingUpgradeSound) {
    }

    public boolean isUsingUpgradeParticles() {
        return false;
    }

    public void setUsingUpgradeParticles(boolean usingUpgradeParticles) {
    }

    public String getKeyBackpackName() {
        return null;
    }

    public void setKeyBackpackName(String keyBackpackName) {
    }

    public String getPermissionNode() {
        return null;
    }

    public void setPermissionNode(String permissionNode) {
    }

    public String getDisplayName() {
        return null;
    }

    public void setDisplayName(String displayName) {
    }

    public Material getMaterial() {
        return null;
    }

    public void setMaterial(Material material) {
    }

    public List<String> getDisplayLore() {
        return null;
    }

    public void setDisplayLore(List<String> displayLore) {
    }

    public List<String> getKeyWhitelist() {
        return null;
    }

    public void setKeyWhitelist(List<String> keyWhitelist) {
    }

    public Sound getUpgradeSound() {
        return null;
    }

    public void setUpgradeSound(Sound upgradeSound) {
    }

    public CapacityType getCapacityType() {
        return null;
    }

    public void setCapacityType(CapacityType capacityType) {}

    public long getDefaultCapacity() {
        return 0L;
    }

    public void setDefaultCapacity(long defaultCapacity) {}

    public long getMaxCapacity() {
        return 0L;
    }

    public void setMaxCapacity(long maxCapacity) {}

    public boolean isUsingOpenSound() {
        return false;
    }

    public void setUsingOpenSound(boolean usingOpenSound) {}

    public Sound getOpenSound() {
        return null;
    }

    public void setOpenSound(Sound openSound) {}

    public boolean isUsingWithdrawSound() {
        return false;
    }

    public void setUsingWithdrawSound(boolean usingWithdrawSound) {
    }

    public Sound getWithdrawSound() {
        return null;
    }

    public void setWithdrawSound(Sound withdrawSound) {}

    public boolean isUsingDepositSound() {
        return false;
    }

    public void setUsingDepositSound(boolean usingDepositSound) {}

    public Sound getDepositSound() {
        return null;
    }

    public void setDepositSound(Sound depositSound) {
    }

    public boolean isOpenable() {
        return false;
    }

    public void setOpenable(boolean openable) {
    }

    public boolean isWithdrawable() {
        return false;
    }

    public void setWithdrawable(boolean withdrawable) {
    }

    public boolean isDepositable() {
        return false;
    }

    public void setDepositable(boolean depositable) {
    }
}
