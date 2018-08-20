package xyz.diabolicatrixlab.mffjam.proxy;

import net.minecraftforge.common.MinecraftForge;
import xyz.diabolicatrixlab.mffjam.event.ClientEventHandler;

public class ClientProxy extends CommonProxy 
{
	@Override
	public void preInit() {
		super.preInit();
	}
	
	@Override
	public void init() {
		super.init();
		MinecraftForge.EVENT_BUS.register(new ClientEventHandler());
	}
}
