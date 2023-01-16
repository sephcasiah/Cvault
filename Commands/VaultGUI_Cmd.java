/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.ChatColor
 *  org.bukkit.Material
 *  org.bukkit.command.Command
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.Player
 *  org.bukkit.inventory.Inventory
 *  org.bukkit.inventory.InventoryHolder
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.meta.ItemMeta
 */
package Commands;

import java.util.Arrays;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class VaultGUI_Cmd
implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player)sender;
            Inventory VaultSelection = Bukkit.createInventory((InventoryHolder)player, (int)27, (String)(ChatColor.GOLD + "Select a Vault"));
            ItemStack Vault_1 = new ItemStack(Material.ENDER_CHEST);
            ItemMeta Vault_1_Meta = Vault_1.getItemMeta();
            Vault_1_Meta.setDisplayName(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8\u00ab &9Vault &31 &8\u00bb"));
            Vault_1_Meta.setLore(Arrays.asList(ChatColor.translateAlternateColorCodes((char)'&', (String)"&6Tiny Vault &8- &218 &aSlots")));
            Vault_1.setItemMeta(Vault_1_Meta);
            ItemStack Vault_2 = new ItemStack(Material.ENDER_CHEST);
            ItemMeta Vault_2_Meta = Vault_2.getItemMeta();
            Vault_2_Meta.setDisplayName(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8\u00ab &9Vault &32 &8\u00bb"));
            Vault_2_Meta.setLore(Arrays.asList(ChatColor.translateAlternateColorCodes((char)'&', (String)"&6Small Vault &8- &227 &aSlots")));
            Vault_2.setItemMeta(Vault_2_Meta);
            ItemStack Vault_3 = new ItemStack(Material.ENDER_CHEST);
            ItemMeta Vault_3_Meta = Vault_3.getItemMeta();
            Vault_3_Meta.setDisplayName(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8\u00ab &9Vault &33 &8\u00bb"));
            Vault_3_Meta.setLore(Arrays.asList(ChatColor.translateAlternateColorCodes((char)'&', (String)"&6Big Vault &8- &236 &aSlots")));
            Vault_3.setItemMeta(Vault_3_Meta);
            ItemStack Vault_4 = new ItemStack(Material.ENDER_CHEST);
            ItemMeta Vault_4_Meta = Vault_4.getItemMeta();
            Vault_4_Meta.setDisplayName(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8\u00ab &9Vault &34 &8\u00bb"));
            Vault_4_Meta.setLore(Arrays.asList(ChatColor.translateAlternateColorCodes((char)'&', (String)"&6Large Vault &8- &245 &aSlots")));
            Vault_4.setItemMeta(Vault_4_Meta);
            ItemStack Vault_5 = new ItemStack(Material.ENDER_CHEST);
            ItemMeta Vault_5_Meta = Vault_5.getItemMeta();
            Vault_5_Meta.setDisplayName(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8\u00ab &9Vault &35 &8\u00bb"));
            Vault_5_Meta.setLore(Arrays.asList(ChatColor.translateAlternateColorCodes((char)'&', (String)"&6Super Vault &8- &254 &aSlots")));
            Vault_5.setItemMeta(Vault_5_Meta);
            ItemStack Vault_6 = new ItemStack(Material.ENDER_CHEST);
            ItemMeta Vault_6_Meta = Vault_6.getItemMeta();
            Vault_6_Meta.setDisplayName(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8\u00ab &9Vault &36 &8\u00bb"));
            Vault_6_Meta.setLore(Arrays.asList(ChatColor.translateAlternateColorCodes((char)'&', (String)"&6Uber Vault &8- &254 &aSlots")));
            Vault_6.setItemMeta(Vault_6_Meta);
            ItemStack Filler = new ItemStack(Material.Barrier);
            ItemMeta Filler_Meta = Filler.getItemMeta();
            Filler_Meta.setDisplayName(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8Select a Vault"));
            Filler.setItemMeta(Filler_Meta);
            VaultSelection.setItem(0, Filler);
            VaultSelection.setItem(1, Filler);
            VaultSelection.setItem(2, Filler);
            VaultSelection.setItem(3, Filler);
            VaultSelection.setItem(4, Filler);
            VaultSelection.setItem(5, Filler);
            VaultSelection.setItem(6, Filler);
            VaultSelection.setItem(7, Filler);
            VaultSelection.setItem(8, Filler);
            VaultSelection.setItem(9, Filler);
            VaultSelection.setItem(10, Filler);
            VaultSelection.setItem(11, Vault_1);
            VaultSelection.setItem(12, Vault_2);
            VaultSelection.setItem(13, Vault_3);
            VaultSelection.setItem(14, Vault_4);
            VaultSelection.setItem(15, Vault_5);
            VaultSelection.setItem(16, Vault_6);
            VaultSelection.setItem(17, Filler);
            VaultSelection.setItem(18, Filler);
            VaultSelection.setItem(19, Filler);
            VaultSelection.setItem(20, Filler);
            VaultSelection.setItem(21, Filler);
            VaultSelection.setItem(22, Filler);
            VaultSelection.setItem(23, Filler);
            VaultSelection.setItem(24, Filler);
            VaultSelection.setItem(25, Filler);
            VaultSelection.setItem(26, Filler);
            player.openInventory(VaultSelection);
        }
        return false;
    }
}
