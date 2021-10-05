package pl.emeraldcraft.RP.AutoMessage;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;


import net.md_5.bungee.api.ChatColor;
import pl.emeraldcraft.RP.main.Main;

public class AutoMessage {
	
	static Main plugin;
	
	public AutoMessage(Main m) {
		plugin = m;
	}
	
	public static void start() {
		new BukkitRunnable() {
			int i = 0;
			List<String> Messages = plugin.getConfig().getStringList("Messages");
			String prefix = plugin.getConfig().getString("prefix");
			
			public void run() {
				if(i < Messages.size()) {
					for(Player players : Bukkit.getOnlinePlayers()) {
						players.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + " " + Messages.get(i)));
					}
					i++;
				} else {
					i = 0;
				}
			}
		}.runTaskTimer(plugin, 20L * plugin.getConfig().getInt("time"), 20L * plugin.getConfig().getInt("time"));
	}
	
}
