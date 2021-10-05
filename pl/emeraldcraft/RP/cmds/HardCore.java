package pl.emeraldcraft.RP.cmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import pl.emeraldcraft.RP.main.Main;

public class HardCore implements CommandExecutor {
	
	Main plugin;
	
	String rel = "Przeladowano!";
	
	String prefix = "§7[§aEMERALD-CRAFT§7] §f";
	
	public HardCore(Main m) {
		plugin = m;
		m.getCommand("Hardcore").setExecutor(this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {
		String pname = sender.getName();
		if(args.length == 1) {
			if(args[0].equalsIgnoreCase("reload")) {
				if(sender.isOp()) {
					((Player) sender).sendTitle("§aPrzeladowano!", "§bplik §3config.yml.", 10, 40, 10);
					Main.main.reloadConfig();
					sender.sendMessage("Przeladowano config RP");
				}else {
					sender.sendMessage("Nie masz uprwanien SUS");
				}
			}
			
			if(args[0].equalsIgnoreCase("info")) {
				if(sender.isOp()) {
					sender.sendMessage("Przeladowano config RP");
				}
			}
		}
		return false;
	}

}
