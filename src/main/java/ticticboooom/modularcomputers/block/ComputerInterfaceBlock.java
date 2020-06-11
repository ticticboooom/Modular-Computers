package ticticboooom.modularcomputers.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.world.IBlockReader;
import ticticboooom.modularcomputers.init.TileEntityTypes;

import javax.annotation.Nullable;

public class ComputerInterfaceBlock extends Block {
    public ComputerInterfaceBlock() {
        super(Block.Properties.create(Material.ROCK));
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return TileEntityTypes.COMPUTER_INTERFACE.get().create();
    }
}
