package ticticboooom.modularcomputers.init;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ticticboooom.modularcomputers.ModularComputers;
import ticticboooom.modularcomputers.block.ComputerInterfaceBlock;
import ticticboooom.modularcomputers.tileentity.ComputerInterfaceTileEntity;

public class BlockTypes {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ModularComputers.MOD_ID);

    public static final RegistryObject<Block> COMPUTER_INTERFACE = BLOCKS.register("computer_interface", ComputerInterfaceBlock::new);

}
