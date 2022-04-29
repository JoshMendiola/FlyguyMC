package mcpc.PhilosophyWithJosh.FlyguyMC.commands;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import mcpc.PhilosophyWithJosh.FlyguyMC.Main;

public class TntCommand implements CommandExecutor
{
	private Main plugin;
	
	public TntCommand(Main plugin)
	{
		this.plugin = plugin;
		plugin.getCommand("flyguy").setExecutor(this);
	}
	
	public boolean onCommand(CommandSender sender, Command flyguy, String label, String[] args)
	{
		if(sender instanceof Player)
		{
			Player p = (Player)sender;	
			
			Location playerLoc = p.getLocation().clone();
			Location tntLoc = p.getLocation().clone().subtract(0,1,0);
			Location redLoc = p.getLocation().clone().subtract(0,2,0);
			Location obsidianOne = playerLoc.subtract(1,0,0);
			Location obsidianTwo = playerLoc.subtract(0,0,1);
			Location obsidianThree = playerLoc.add(1,0,0);
			Location obsidianFour = playerLoc.add(0,0,1);
			
			Block blockOne = obsidianOne.getBlock();
			blockOne.setType(Material.OBSIDIAN);
			Block blockTwo = obsidianTwo.getBlock();
			blockTwo.setType(Material.OBSIDIAN);
			Block blockThree = obsidianThree.getBlock();
			blockThree.setType(Material.OBSIDIAN);
			Block blockFour = obsidianFour.getBlock();
			blockFour.setType(Material.OBSIDIAN);
			
			Block waterBlock = playerLoc.getBlock();
			waterBlock.setType(Material.WATER);
			Block tntBlock = tntLoc.getBlock();
			tntBlock.setType(Material.TNT);
			Block redBlock = redLoc.getBlock();
			redBlock.setType(Material.REDSTONE_BLOCK);
			
			p.sendMessage("Have fun");
			return true;
			
		}
		return false;
	}
}
