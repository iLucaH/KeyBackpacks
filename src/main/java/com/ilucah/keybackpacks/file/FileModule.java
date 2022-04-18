package com.ilucah.keybackpacks.file;

import com.ilucah.keybackpacks.KeyBackpacks;
import org.bukkit.configuration.file.FileConfiguration;

public class FileModule {

    private KeyBackpacks plugin;
    private FileConfiguration configYML;
    private FileConfiguration backpacksYML;
    private FileConfiguration menusYML;
    private FileConfiguration messagesYML;

    public FileModule(KeyBackpacks plugin) {
        this.plugin = plugin;
        configYML = new YamlLoader("config", plugin).load(true);
        backpacksYML = new YamlLoader("backpacks", plugin).load(false);
        menusYML = new YamlLoader("menus", plugin).load(true);
        configYML.options().copyDefaults(true);
        messagesYML = new YamlLoader("messages", plugin).load(true);
        configYML.options().copyDefaults(true);
    }

    public void reload() {
        configYML = new YamlLoader("config", plugin).load(true);
        backpacksYML = new YamlLoader("backpacks", plugin).load(false);
        menusYML = new YamlLoader("menus", plugin).load(true);
        messagesYML = new YamlLoader("messages", plugin).load(true);
    }

    public FileConfiguration getConfigYML() {
        return configYML;
    }

    public void setConfigYML(FileConfiguration configYML) {
        this.configYML = configYML;
    }

    public FileConfiguration getBackpacksYML() {
        return backpacksYML;
    }

    public void setBackpacksYML(FileConfiguration backpacksYML) {
        this.backpacksYML = backpacksYML;
    }

    public FileConfiguration getMenusYML() {
        return menusYML;
    }

    public void setMenusYML(FileConfiguration menusYML) {
        this.menusYML = menusYML;
    }

    public FileConfiguration getMessagesYML() {
        return messagesYML;
    }

    public void setMessagesYML(FileConfiguration messagesYML) {
        this.messagesYML = messagesYML;
    }
}
