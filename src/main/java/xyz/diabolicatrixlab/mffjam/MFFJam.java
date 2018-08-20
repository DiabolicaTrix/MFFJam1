package xyz.diabolicatrixlab.mffjam;

import org.apache.logging.log4j.Logger;

import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import xyz.diabolicatrixlab.mffjam.proxy.CommonProxy;

@Mod(modid = MFFJam.MODID, name = MFFJam.NAME, version = MFFJam.VERSION)
public class MFFJam
{
    public static final String MODID = "mffjam";
    public static final String NAME = "MFF Jam";
    public static final String VERSION = "1.0";

    private static Logger logger;
    
    @Mod.Instance(MFFJam.MODID)
    private static MFFJam instance;
    
    @SidedProxy(clientSide = "xyz.diabolicatrixlab.mffjam.proxy.ClientProxy", serverSide = "xyz.diabolicatrixlab.mffjam.proxy.CommonProxy")
    private static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
    }
}
