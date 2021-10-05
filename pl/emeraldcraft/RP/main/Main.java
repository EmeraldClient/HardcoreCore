package pl.emeraldcraft.RP.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import pl.emeraldcraft.RP.cmds.Broadcast;
import pl.emeraldcraft.RP.cmds.Chat;
import pl.emeraldcraft.RP.cmds.HardCore;
import pl.emeraldcraft.RP.events.onChat;
import pl.emeraldcraft.RP.events.onJoin;
import pl.emeraldcraft.RP.events.onQuit;
import pl.emeraldcraft.RP.scoreboard.Scoreboard;

public class Main extends JavaPlugin {
	
	public static Main main;
	
	Scoreboard sc;
	
	public static String prefix = "§7[§aEMERALD-CRAFT§7] §f";
	
	public void onEnable() {
		main = this; 
		Bukkit.getConsoleSender().sendMessage("§b-----§aEMERALD-CRAFT.PL §bRP CORE-----");
		Bukkit.getConsoleSender().sendMessage("Zaladowanio RP!");
		
		getConfig().options().copyDefaults(true);
		saveConfig();
		reloadConfig();
		
		new Chat(this);
		new Broadcast(this);
		new HardCore(this);
		
		getServer().getPluginManager().registerEvents(new onChat(), this);
		getServer().getPluginManager().registerEvents(new onJoin(), this);
		getServer().getPluginManager().registerEvents(new onQuit(), this);
		
		
		//sc.updateScoreboard();
	}
	
	public static Main getMain() {
		return main;
	}

}
