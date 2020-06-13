package ticticboooom.modularcomputers.container;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import ticticboooom.modularcomputers.init.ContainerTypes;

public class ComputerInterfaceContainer extends Container {
    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return false;
    }
    public ComputerInterfaceContainer(final int windowId, final PlayerInventory playerInventory, final TileEntity tileEntity) {
        super(ContainerTypes.COMPUTER_INTERFACE.get(), windowId);
    }

    public ComputerInterfaceContainer(final int windowId, final PlayerInventory playerInventory, final PacketBuffer data) {
        this(windowId, playerInventory, playerInventory.player.world.getTileEntity(data.readBlockPos()));
    }

}
