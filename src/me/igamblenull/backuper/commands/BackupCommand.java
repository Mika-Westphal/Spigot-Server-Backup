package me.igamblenull.backuper.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import me.igamblenull.backuper.Main;

public class BackupCommand implements CommandExecutor {

	private Main plugin;

	public BackupCommand(Main plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender.hasPermission("backup")) {
			plugin.help.setCommandSender(sender);
			switch(args.length) {
				case 0:
					if(args.length == 0) {						
						plugin.help.printHelpPage();
					}
					break;
				}
			}
		return true;
	}

}
