package ticticboooom.modularcomputers.tileentity;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import ticticboooom.modularcomputers.container.ComputerInterfaceContainer;
import ticticboooom.modularcomputers.init.TileEntityTypes;

import javax.annotation.Nullable;

public class ComputerInterfaceTileEntity extends TileEntity implements INamedContainerProvider {
    public ComputerInterfaceTileEntity() {
        super(TileEntityTypes.COMPUTER_INTERFACE.get());
    }


    @Override
    public ITextComponent getDisplayName() {
        return new TranslationTextComponent("container.modularcomputers.computer_interface.startup");
    }

    @Nullable
    @Override
    public Container createMenu(int p_createMenu_1_, PlayerInventory p_createMenu_2_, PlayerEntity p_createMenu_3_) {
        return new ComputerInterfaceContainer(p_createMenu_1_, p_createMenu_2_, this);
    }
}
