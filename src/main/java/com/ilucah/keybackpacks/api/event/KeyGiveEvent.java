package com.ilucah.keybackpacks.api.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class KeyGiveEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    private boolean cancelled = false;

    private final Player player;
    private final String key;
    private long keys;
    private boolean fallingBack;

    public KeyGiveEvent(final Player player, final String key, long keys, boolean fallingBack) {
        this.player = player;
        this.keys = keys;
        this.key = key;
        this.fallingBack = fallingBack;
    }

    public Player getPlayer() {
        return player;
    }

    public boolean isFallingBack() {
        return fallingBack;
    }

    public void setFallingBack(boolean fallingBack) {
        this.fallingBack = fallingBack;
    }

    public String getKey() {
        return key;
    }

    public long getKeys() {
        return keys;
    }

    public void setKeys(long keys) {
        this.keys = keys;
    }

    public void addKeys(long keys) {
        this.keys += keys;
    }

    public void removeKeys(long keys) {
        this.keys -= keys;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }
}
