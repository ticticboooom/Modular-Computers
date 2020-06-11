package ticticboooom.modularcomputers;

import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ticticboooom.modularcomputers.init.BlockTypes;
import ticticboooom.modularcomputers.init.ContainerTypes;
import ticticboooom.modularcomputers.init.TileEntityTypes;

@Mod(ModularComputers.MOD_ID)
public class ModularComputers {
    public static final String MOD_ID = "modularcomputers";
    public  static final Logger LOGGER = LogManager.getLogger();
    public ModularComputers() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ContainerTypes.CONTAINER_TYPES.register(eventBus);
        TileEntityTypes.TILE_ENTITIES.register(eventBus);
        BlockTypes.BLOCKS.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
