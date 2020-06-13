package ticticboooom.modularcomputers;

import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import ticticboooom.modularcomputers.client.gui.ComputerInterfaceContainerScreen;
import ticticboooom.modularcomputers.init.ContainerTypes;

@Mod.EventBusSubscriber(modid = ModularComputers.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        ScreenManager.registerFactory(ContainerTypes.COMPUTER_INTERFACE.get(), ComputerInterfaceContainerScreen::new);
    }
}
