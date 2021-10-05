package pl.emeraldcraft.RP.cmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import pl.emeraldcraft.RP.main.Main;

public class Broadcast implements CommandExecutor {
	
Main plugin;
	
	public Broadcast(Main m) {
		plugin = m;
		m.getCommand("broadcast").setExecutor(this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {
		if(sender.isOp()) {
			if(args.length >= 1) {
				StringBuilder sb = new StringBuilder();
				
				for(int i = 1; i < args.length; ++i) {
					sb.append(args[i]).append(" ");
				}
				
				String msg = sb.toString();
				
				if(args[0].equalsIgnoreCase("bc")) {
					for(Player ps : plugin.getServer().getOnlinePlayers()) {
						ps.sendMessage(plugin.prefix + msg.replace("&", "§"));
					}
				}else if(args[0].equalsIgnoreCase("title")) {
					for(Player ps : plugin.getServer().getOnlinePlayers()) {
						ps.sendTitle(msg.replace("&", "§"), " ");
					}
				}
				
			}
		}else {
			sender.sendMessage("§cWE SPIEDALAJ!");
		}
		return false;
	}

}
