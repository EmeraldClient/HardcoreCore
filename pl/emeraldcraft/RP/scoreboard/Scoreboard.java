package pl.emeraldcraft.RP.scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;

public class Scoreboard {
	

    public void setScoreBoard(Player player) {
          Scoreboard board = (Scoreboard) Bukkit.getScoreboardManager().getNewScoreboard();
          Objective obj = ((org.bukkit.scoreboard.Scoreboard) board).registerNewObjective("ServerName", "dummy", "Test Server");
          obj.setDisplaySlot(DisplaySlot.SIDEBAR);
          
          Score onlineName = obj.getScore(ChatColor.GRAY + "» Online");
          onlineName.setScore(15);
    }

}
