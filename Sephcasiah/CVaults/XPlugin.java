/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.event.Listener
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.plugin.java.JavaPlugin
 */
package Beckstation.XVaults;

import Commands.VaultGUI_Cmd;
import Listeners.ClickGUIListener;
import Listeners.CloseGUIListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class XPlugin
extends JavaPlugin {
    public static Map<String, ItemStack[]> vault_1_inv = new HashMap<String, ItemStack[]>();
    public static Map<String, ItemStack[]> vault_2_inv = new HashMap<String, ItemStack[]>();
    public static Map<String, ItemStack[]> vault_3_inv = new HashMap<String, ItemStack[]>();
    public static Map<String, ItemStack[]> vault_4_inv = new HashMap<String, ItemStack[]>();
    public static Map<String, ItemStack[]> vault_5_inv = new HashMap<String, ItemStack[]>();
    public static Map<String, ItemStack[]> vault_6_inv = new HashMap<String, ItemStack[]>();

    protected void initCommands() {
        this.getServer().getPluginCommand("cvault").setExecutor((CommandExecutor)new CVaultGUI_Cmd());
    }

    protected void initListeners() {
        this.getServer().getPluginManager().registerEvents((Listener)new ClickGUIListener(), (Plugin)this);
        this.getServer().getPluginManager().registerEvents((Listener)new CloseGUIListener(), (Plugin)this);
    }

    protected void saveVaults() {
        for (Map.Entry<String, ItemStack[]> entry_1 : vault_1_inv.entrySet()) {
            this.getConfig().set("vault_1_data." + entry_1.getKey(), (Object)entry_1.getValue());
        }
        for (Map.Entry<String, ItemStack[]> entry_2 : vault_2_inv.entrySet()) {
            this.getConfig().set("vault_2_data." + entry_2.getKey(), (Object)entry_2.getValue());
        }
        for (Map.Entry<String, ItemStack[]> entry_3 : vault_3_inv.entrySet()) {
            this.getConfig().set("vault_3_data." + entry_3.getKey(), (Object)entry_3.getValue());
        }
        for (Map.Entry<String, ItemStack[]> entry_4 : vault_4_inv.entrySet()) {
            this.getConfig().set("vault_4_data." + entry_4.getKey(), (Object)entry_4.getValue());
        }
        for (Map.Entry<String, ItemStack[]> entry_5 : vault_5_inv.entrySet()) {
            this.getConfig().set("vault_5_data." + entry_5.getKey(), (Object)entry_5.getValue());
        }
        for (Map.Entry<String, ItemStack[]> entry_6 : vault_6_inv.entrySet()) {
            this.getConfig().set("vault_5_data." + entry_6.getKey(), (Object)entry_6.getValue());
        }
        this.saveConfig();
    }

    protected void loadVault_1() {
        this.getConfig().getConfigurationSection("vault_1_data").getKeys(false).forEach(key -> {
            ItemStack[] content_1 = ((List)this.getConfig().get("vault_1_data." + key)).toArray(new ItemStack[0]);
            vault_1_inv.put((String)key, content_1);
        });
    }

    protected void loadVault_2() {
        this.getConfig().getConfigurationSection("vault_2_data").getKeys(false).forEach(key -> {
            ItemStack[] content_2 = ((List)this.getConfig().get("vault_2_data." + key)).toArray(new ItemStack[0]);
            vault_2_inv.put((String)key, content_2);
        });
    }

    protected void loadVault_3() {
        this.getConfig().getConfigurationSection("vault_3_data").getKeys(false).forEach(key -> {
            ItemStack[] content_3 = ((List)this.getConfig().get("vault_3_data." + key)).toArray(new ItemStack[0]);
            vault_3_inv.put((String)key, content_3);
        });
    }

    protected void loadVault_4() {
        this.getConfig().getConfigurationSection("vault_4_data").getKeys(false).forEach(key -> {
            ItemStack[] content_4 = ((List)this.getConfig().get("vault_4_data." + key)).toArray(new ItemStack[0]);
            vault_4_inv.put((String)key, content_4);
        });
    }

    protected void loadVault_5() {
        this.getConfig().getConfigurationSection("vault_5_data").getKeys(false).forEach(key -> {
            ItemStack[] content_5 = ((List)this.getConfig().get("vault_5_data." + key)).toArray(new ItemStack[0]);
            vault_5_inv.put((String)key, content_5);
        });
    }
    protected void loadVault_6() {
        this.getConfig().getConfigurationSection("vault_6_data").getKeys(false).forEach(key -> {
            ItemStack[] content_6 = ((List)this.getConfig().get("vault_6_data." + key)).toArray(new ItemStack[0]);
            vault_6_inv.put((String)key, content_6);
        });
    }
}
