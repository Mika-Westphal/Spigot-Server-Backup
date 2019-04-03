package me.igamblenull.backuper;

import org.bukkit.plugin.java.JavaPlugin;

import me.igamblenull.backuper.commands.BackupCommand;
import me.igamblenull.backuper.commands.modules.HelpModule;

public class Main extends JavaPlugin {
	
	public HelpModule help;
	
	public void onEnable() {
		registerCommands();
		registerEvents();
		setupHelp();
	}
	
	private void registerCommands() {
		BackupCommand backupCmd = new BackupCommand(this);
		getCommand("backup").setExecutor(backupCmd);
	}
	
	private void registerEvents() {
		
	}
	
	private void setupHelp() {
		help = new HelpModule(null);
		help.addHelpPage("/backup - Shows this page!",
						 "/backup start - Starts an new backup",
						 "/backup list - Shows a list with all Backups");
	}
	
}
