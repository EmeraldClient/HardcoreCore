package pl.emeraldcraft.RP.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

import pl.emeraldcraft.RP.cmds.Chat;

public class onChat implements Listener {
	
	@EventHandler
	public void onPlayerChat(PlayerChatEvent e) {
		Player p = e.getPlayer();
		
		if(!p.isOp()) {
			if(Chat.muted = true) {
				e.setCancelled(true);
				
				p.sendMessage("§8Chat jest obecnie §cWy³¹czony");
			}
		}
	}
	

}
