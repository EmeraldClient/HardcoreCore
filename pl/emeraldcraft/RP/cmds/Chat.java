package pl.emeraldcraft.RP.cmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import pl.emeraldcraft.RP.main.Main;

public class Chat implements CommandExecutor {
	
	Main plugin;
	
	String prefix = "§7[§aEMERALD-CRAFT§7] §f";
	
	public static boolean muted = false;
	
	public Chat(Main m) {
		plugin = m;
		m.getCommand("chat").setExecutor(this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {
		if(args.length == 1) {
			if(args[0].equalsIgnoreCase("clear")) {
  				if(sender.isOp()) {
					for(Player ps : plugin.getServer().getOnlinePlayers()) {
						for(int i = 1; i < 101; i++) {
							ps.sendMessage("");
						}
						ps.sendMessage("");
						ps.sendMessage("§b§l§m----------" + prefix + "§b§l§m----------");
						ps.sendMessage("§8Chat zosta³ §6wyczyszczony");
						ps.sendMessage("§8Przez §a" + sender.getName());
						ps.sendMessage("§b§l§m----------" + prefix + "§b§l§m----------");
					}
				}else {
					sender.sendMessage("§cnie masz permisji emerald.chat");
				}
 			}else if(args[0].equalsIgnoreCase("on")) {
 				if(sender.isOp()) {
 					muted = false;
 					
 					for(Player ps : plugin.getServer().getOnlinePlayers()) {
						ps.sendMessage("");
						ps.sendMessage("§b§l§m----------" + prefix + "§b§l§m----------");
						ps.sendMessage("§8Chat zosta³ §aW³¹czony");
						ps.sendMessage("§8Przez §a" + sender.getName());
						ps.sendMessage("§b§l§m----------" + prefix + "§b§l§m----------");
					}
 				}else {
 					sender.sendMessage("§cnie masz permisji emerald.chat");
 				}
 				
 			}else if(args[0].equalsIgnoreCase("off")) {
 				if(sender.isOp()) {
 					muted = true;
 					
 					for(Player ps : plugin.getServer().getOnlinePlayers()) {
						ps.sendMessage("");
						ps.sendMessage("§b§l§m----------" + prefix + "§b§l§m----------");
						ps.sendMessage("§8Chat zosta³ §cWy³¹czony");
						ps.sendMessage("§8Przez §a" + sender.getName());
						ps.sendMessage("§b§l§m----------" + prefix + "§b§l§m----------");
					}
		}else {
			sender.sendMessage("§cnie masz permisji emerald.chat");
		}
	}

}
		return false;
	}
}
