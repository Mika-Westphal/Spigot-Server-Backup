package me.igamblenull.backuper;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.igamblenull.backuper.commands.BackupCommand;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		System.out.println("&a[Backuper " + Bukkit.getVersion() + "]&r enabled!");
		registerCommands();
		registerEvents();
	}
	
	private void registerCommands() {
		BackupCommand backupCmd = new BackupCommand(this);
		getCommand("backup").setExecutor(backupCmd);
	}
	
	private void registerEvents() {
		
	}
	
}
