/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xyz.brosforlife.tpsplaceholder;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import net.minecraft.server.v1_11_R1.MinecraftServer;
import net.minecraft.server.v1_11_R1.WorldServer;
import org.bukkit.ChatColor;

import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.spigotmc.TicksPerSecondCommand;

/**
 *
 * @author Aecnoril Minecraft.BrosForLife.xyz
 */
public class TPSPlaceHolder extends PlaceholderExpansion {

    @Override
    public String getIdentifier() {
        return "TPS";
    }

    @Override
    public String getPlugin() {
        return null;
    }

    @Override
    public String getAuthor() {
        return "Aecnoril - Aecnorilkoen@gmail.com";
    }

    @Override
    public String getVersion() {
        return "1.0.2";
    }

    @Override
    public String onPlaceholderRequest(Player p, String identifier) {

        /**
         * Get latest TPS
         * recentTPS returns a Double[3]
         */
        double[] tpsArray = MinecraftServer.getServer().recentTps;

        String tpsResult;
        
        switch (identifier) {
            case "rounded_1": tpsResult = format(tpsArray[0]);
                break;
            case "rounded_5": tpsResult = format(tpsArray[1]);
                break;
            case "rounded_15": tpsResult = format(tpsArray[2]);
                break;
            case "rounded_1_color": tpsResult = colorFormat(tpsArray[0]);
                break;
            case "rounded_5_color": tpsResult = colorFormat(tpsArray[1]);
                break;
            case "rounded_15_color": tpsResult = colorFormat(tpsArray[2]);
                break;
            default: tpsResult = "Invalid TPS placeholder!";
        }
        return tpsResult;
    }

    /**
     * Format TPS with standard Spigot colors.
     * @param tps A double representing the latest TPS
     * @return A String with the formatted TPS
     */
    private String colorFormat(double tps) {
        return ((tps > 18.0) ? ChatColor.GREEN : (tps > 16.0) ? ChatColor.YELLOW : ChatColor.RED).toString()
                + ((tps > 20.0) ? "*" : "") + Math.min(Math.round(tps * 100.0) / 100.0, 20.0);
    }

    /**
     * Format TPS in plain white.
     * @param tps A double representing the latest TPS
     * @return A String with the formatted TPS
     */
    private String format(double tps) {
        return String.valueOf(Math.min(Math.round(tps * 100.0) / 100.0, 20.0));
    }

}
