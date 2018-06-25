package de.minetropolis;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class SlaxXBar extends JavaPlugin implements CommandExecutor {

	@Override
	public void onEnable() {
		getCommand("commandblockcorrect").setExecutor(this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (args.length != 1)
			return false;
		
		ScoreboardManager sm = Bukkit.getScoreboardManager();
		Scoreboard main = sm.getMainScoreboard();
		Scoreboard individual = sm.getNewScoreboard();
		individual.registerNewObjective(args[0], "dummy");
		
		return true;
	}
}
