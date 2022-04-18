package com.ilucah.keybackpacks.api.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class KeyOpenEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    private boolean cancelled = false;

    private final Player player;
    private final String key;
    private long keys;

    public KeyOpenEvent(final Player player, final String key, long keys) {
        this.player = player;
        this.keys = keys;
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public long getKeys() {
        return keys;
    }

    public Player getPlayer() {
        return player;
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
