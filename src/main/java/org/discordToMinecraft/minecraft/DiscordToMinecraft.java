package org.discordToMinecraft.minecraft;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class DiscordToMinecraft extends JavaPlugin {

    public static Logger LOGGER = Logger.getLogger("Minecraft");

    @Override
    public void onEnable() {
        LOGGER.info("onEnable is called!");
    }
    @Override
    public void onDisable() {
        LOGGER.info("onDisable is called!");
    }
}
