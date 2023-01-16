/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.ChatColor
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.inventory.InventoryCloseEvent
 */
package Listeners;

import Beckstation.XVaults.XPlugin;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;

public class CloseGUIListener
implements Listener {
    @EventHandler
    public void onCloseGUI(InventoryCloseEvent event) {
        if (event.getView().getTitle().contains(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8\u00ab &9Vault &31 &8\u00bb"))) {
            XPlugin.vault_1_inv.put(event.getPlayer().getUniqueId().toString(), event.getInventory().getContents());
        }
        if (event.getView().getTitle().contains(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8\u00ab &9Vault &32 &8\u00bb"))) {
            XPlugin.vault_2_inv.put(event.getPlayer().getUniqueId().toString(), event.getInventory().getContents());
        }
        if (event.getView().getTitle().contains(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8\u00ab &9Vault &33 &8\u00bb"))) {
            XPlugin.vault_3_inv.put(event.getPlayer().getUniqueId().toString(), event.getInventory().getContents());
        }
        if (event.getView().getTitle().contains(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8\u00ab &9Vault &34 &8\u00bb"))) {
            XPlugin.vault_4_inv.put(event.getPlayer().getUniqueId().toString(), event.getInventory().getContents());
        }
        if (event.getView().getTitle().contains(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8\u00ab &9Vault &35 &8\u00bb"))) {
            XPlugin.vault_5_inv.put(event.getPlayer().getUniqueId().toString(), event.getInventory().getContents());
        }
        if (event.getView().getTitle().contains(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8\u00ab &9Vault &36 &8\u00bb"))) {
            XPlugin.vault_6_inv.put(event.getPlayer().getUniqueId().toString(), event.getInventory().getContents());
        }
    }
}
