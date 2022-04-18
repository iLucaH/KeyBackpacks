package com.ilucah.keybackpacks.handler;

import com.ilucah.keybackpacks.backpack.Backpack;
import com.ilucah.keybackpacks.crate.CrateService;
import com.ilucah.keybackpacks.economy.EconomyService;
import com.ilucah.keybackpacks.file.FileModule;
import org.bukkit.entity.Player;

import java.text.DecimalFormat;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

public class Handler {

    private DecimalFormat format;

    public void reloadSubsidiary() {
    }

    public void reloadBackpacks() {
    }

    public void clearBackpacks() {
    }

    public Backpack getBackpack(String name) {
        return null;
    }

    public void addBackpack(Backpack backpack) {
    }

    public Stream<Backpack> getBackpacks() {
        return null;
    }

    public Stream<String> getBackpackKeys() {
        return null;
    }

    public String getFallbackCommand() {
        return null;
    }

    public void setFallbackCommand(String fallbackCommand) {
    }

    public FileModule getFileModule() {
        return null;
    }

    public EconomyService getEconomyService() {
        return null;
    }

    public void setEconomyService(EconomyService economyService) {
    }

    public CrateService getCrateService() {
        return null;
    }

    public void setCrateService(CrateService crateService) {
    }

    public DecimalFormat getFormat() {
        return format;
    }

    public void sendNoBackpackFoundMessage(Player player) {
    }
}
