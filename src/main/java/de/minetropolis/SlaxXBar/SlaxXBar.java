package de.minetropolis.SlaxXBar;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class SlaxXBar extends JavaPlugin {

	@Override
	public void onEnable() {
		ScoreboardManager sm = Bukkit.getScoreboardManager();
		Scoreboard main = sm.getMainScoreboard();
	}

}
