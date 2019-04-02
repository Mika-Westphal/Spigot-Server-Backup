package me.igamblenull.backuper.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import me.igamblenull.backuper.Main;
import me.igamblenull.backuper.commands.modules.HelpModule;

public class BackupCommand implements CommandExecutor {

	private Main plugin;
	private HelpModule help;

	public BackupCommand(Main plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender.hasPermission("backup")) {
			help = new HelpModule(sender);
			switch(args.length) {
				case 0:
					if(args.length == 0) {						
						help.printHelpPage();
					}
					break;
				}
			}
		return true;
	}

}
