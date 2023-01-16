/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.plugin.Plugin
 */
package Beckstation.XVaults;

import Beckstation.XVaults.XPlugin;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public class XVaults
extends XPlugin {
    public static XVaults plugin;

    public void onEnable() {
        plugin = this;
        this.initCommands();
        this.initListeners();
        this.saveDefaultConfig();
        if (this.getConfig().contains("vault_1_data")) {
            this.loadVault_1();
        } else {
            this.getConfig().set("vault_1_data", null);
        }
        if (this.getConfig().contains("vault_2_data")) {
            this.loadVault_2();
        } else {
            this.getConfig().set("vault_2_data", null);
        }
        if (this.getConfig().contains("vault_3_data")) {
            this.loadVault_3();
        } else {
            this.getConfig().set("vault_3_data", null);
        }
        if (this.getConfig().contains("vault_4_data")) {
            this.loadVault_4();
        } else {
            this.getConfig().set("vault_4_data", null);
        }
        if (this.getConfig().contains("vault_5_data")) {
            this.loadVault_5();
        } else {
            this.getConfig().set("vault_5_data", null);
        }
        if (this.getConfig().contains("vault_6_data")) {
            this.loadVault_6();
        } else {
            this.getConfig().set("vault_6_data", null);
        }
    }

    public void onDisable() {
        this.saveVaults();
        plugin = null;
        Bukkit.getScheduler().cancelTasks((Plugin)this);
    }
}
