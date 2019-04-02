package me.igamblenull.backuper.commands.modules;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.CommandSender;

public class HelpModule {
	
	CommandSender sender;
	
	private List<String> commandPage = new ArrayList<>();
	
	public HelpModule(CommandSender sender) {
		this.sender = sender;
		setupList();
	}
	
	private void setupList() {
		if(getIndexCount() == 0) {
			addHelpPage("Hi");
			addHelpPage("No");
		}
	}
	
	public void addHelpPage(String entryToAdd) {
		commandPage.add(entryToAdd);
	}
	
	public void clearHelpPage() {
		commandPage.clear();
	}
	
	public void printHelpPage() {
		for(String helpString : commandPage) {
			sender.sendMessage(helpString);
		}
	}
	
	public boolean removeHelpPage(String entryToRemove) {
		if(commandPage.contains(entryToRemove)) {
			commandPage.remove(entryToRemove);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean removeHelpPage(int indexToRemove) {
		try {
			if(commandPage.get(indexToRemove) != null) {
				commandPage.remove(indexToRemove);
				return true;
			}
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean containsHelpPage(String contains) {
		return commandPage.contains(contains);
	}
	
	@SuppressWarnings("unused")
	public int getIndexCount() {
		int counter = 0;
		for(String helpString : commandPage) {
			counter++;
		}
		return counter;
	}
}
