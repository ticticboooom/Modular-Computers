package ticticboooom.modularcomputers.init;

import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ticticboooom.modularcomputers.ModularComputers;
import ticticboooom.modularcomputers.container.ComputerInterfaceContainer;

public class ContainerTypes {
    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = new DeferredRegister<>(ForgeRegistries.CONTAINERS, ModularComputers.MOD_ID);

    public static final RegistryObject<ContainerType<ComputerInterfaceContainer>> COMPUTER_INTERFACE = CONTAINER_TYPES.register("computer_interface", () -> IForgeContainerType.create(ComputerInterfaceContainer::new));
}
