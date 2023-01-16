/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.ChatColor
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.inventory.InventoryClickEvent
 *  org.bukkit.inventory.Inventory
 *  org.bukkit.inventory.InventoryHolder
 */
package Listeners;

import Beckstation.XVaults.XPlugin;
import java.io.IOException;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public class ClickGUIListener
implements Listener {
    @EventHandler
    public void eventClick(InventoryClickEvent event) throws IOException {
        Player player = (Player)event.getWhoClicked();
        Inventory Vault_1 = Bukkit.createInventory((InventoryHolder)player, (int)18, (String)ChatColor.translateAlternateColorCodes((char)'&', (String)"&8\u00ab &9Vault &31 &8\u00bb"));
        Inventory Vault_2 = Bukkit.createInventory((InventoryHolder)player, (int)27, (String)ChatColor.translateAlternateColorCodes((char)'&', (String)"&8\u00ab &9Vault &32 &8\u00bb"));
        Inventory Vault_3 = Bukkit.createInventory((InventoryHolder)player, (int)36, (String)ChatColor.translateAlternateColorCodes((char)'&', (String)"&8\u00ab &9Vault &33 &8\u00bb"));
        Inventory Vault_4 = Bukkit.createInventory((InventoryHolder)player, (int)45, (String)ChatColor.translateAlternateColorCodes((char)'&', (String)"&8\u00ab &9Vault &34 &8\u00bb"));
        Inventory Vault_5 = Bukkit.createInventory((InventoryHolder)player, (int)54, (String)ChatColor.translateAlternateColorCodes((char)'&', (String)"&8\u00ab &9Vault &35 &8\u00bb"));
        Inventory Vault_6 = Bukkit.createInventory((InventoryHolder)player, (int)54, (String)ChatColor.translateAlternateColorCodes((char)'&', (String)"&8\u00ab &9Vault &36 &8\u00bb"));
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.GOLD + "Select a Vault")) {
            if (event.getCurrentItem() == null) {
                return;
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8\u00ab &9Vault &31 &8\u00bb"))) {
                if (player.hasPermission("xvaults.1")) {
                    player.closeInventory();
                    if (XPlugin.vault_1_inv.containsKey(player.getUniqueId().toString())) {
                        Vault_1.setContents(XPlugin.vault_1_inv.get(player.getUniqueId().toString()));
                        player.openInventory(Vault_1);
                    }
                    player.openInventory(Vault_1);
                } else {
                    player.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&9&lXVaults &7\u00bb &cYou cannot access this vault."));
                }
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8\u00ab &9Vault &32 &8\u00bb"))) {
                if (player.hasPermission("xvaults.2")) {
                    player.closeInventory();
                    if (XPlugin.vault_2_inv.containsKey(player.getUniqueId().toString())) {
                        Vault_2.setContents(XPlugin.vault_2_inv.get(player.getUniqueId().toString()));
                        player.openInventory(Vault_2);
                    }
                    player.openInventory(Vault_2);
                } else {
                    player.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&9&lXVaults &7\u00bb &cYou cannot access this vault."));
                }
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8\u00ab &9Vault &33 &8\u00bb"))) {
                if (player.hasPermission("xvaults.3")) {
                    player.closeInventory();
                    if (XPlugin.vault_3_inv.containsKey(player.getUniqueId().toString())) {
                        Vault_3.setContents(XPlugin.vault_3_inv.get(player.getUniqueId().toString()));
                        player.openInventory(Vault_3);
                    }
                    player.openInventory(Vault_3);
                } else {
                    player.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&9&lXVaults &7\u00bb &cYou cannot access this vault."));
                }
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8\u00ab &9Vault &34 &8\u00bb"))) {
                if (player.hasPermission("xvaults.4")) {
                    player.closeInventory();
                    if (XPlugin.vault_4_inv.containsKey(player.getUniqueId().toString())) {
                        Vault_4.setContents(XPlugin.vault_4_inv.get(player.getUniqueId().toString()));
                        player.openInventory(Vault_4);
                    }
                    player.openInventory(Vault_4);
                } else {
                    player.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&9&lXVaults &7\u00bb &cYou cannot access this vault."));
                }
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8\u00ab &9Vault &35 &8\u00bb"))) {
                if (player.hasPermission("xvaults.5")) {
                    player.closeInventory();
                    if (XPlugin.vault_5_inv.containsKey(player.getUniqueId().toString())) {
                        Vault_5.setContents(XPlugin.vault_5_inv.get(player.getUniqueId().toString()));
                        player.openInventory(Vault_5);
                    }
                    player.openInventory(Vault_5);
                } else {
                    player.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&9&lXVaults &7\u00bb &cYou cannot access this vault."));
                }
            }
            if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8\u00ab &9Vault &36 &8\u00bb"))) {
                if (player.hasPermission("xvaults.6")) {
                    player.closeInventory();
                    if (XPlugin.vault_6_inv.containsKey(player.getUniqueId().toString())) {
                        Vault_6.setContents(XPlugin.vault_6_inv.get(player.getUniqueId().toString()));
                        player.openInventory(Vault_6);
                    }
                    player.openInventory(Vault_6);
                } else {
                    player.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&9&lXVaults &7\u00bb &cYou cannot access this vault."));
                }
            }
            event.setCancelled(true);
        }
    }
}
