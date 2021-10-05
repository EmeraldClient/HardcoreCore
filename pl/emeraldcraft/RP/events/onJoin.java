package pl.emeraldcraft.RP.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import pl.emeraldcraft.RP.scoreboard.Scoreboard;

public class onJoin implements Listener {
	
	Scoreboard sc;
	
	@EventHandler
	public void onPlayerJoinEvent(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		//sc.createScoreboard(p);
		p.sendMessage("test");
	}

}
