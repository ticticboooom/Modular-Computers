package ticticboooom.modularcomputers;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ModularComputers.MOD_ID)
public class ModularComputers {
    public static final String MOD_ID = "modularcomputers";
    public  static final Logger LOGGER = LogManager.getLogger();
    public ModularComputers() {

        MinecraftForge.EVENT_BUS.register(this);
    }
}
