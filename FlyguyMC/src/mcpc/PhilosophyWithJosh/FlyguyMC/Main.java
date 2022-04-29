package mcpc.PhilosophyWithJosh.FlyguyMC;

import org.bukkit.plugin.java.JavaPlugin;

import mcpc.PhilosophyWithJosh.FlyguyMC.commands.TntCommand;

public class Main extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		new TntCommand(this);
	}
}
