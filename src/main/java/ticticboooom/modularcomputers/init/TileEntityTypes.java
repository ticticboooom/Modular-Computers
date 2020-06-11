package ticticboooom.modularcomputers.init;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ticticboooom.modularcomputers.ModularComputers;
import ticticboooom.modularcomputers.tileentity.ComputerInterfaceTileEntity;

public class TileEntityTypes {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, ModularComputers.MOD_ID);

    public static final RegistryObject<TileEntityType<ComputerInterfaceTileEntity>> COMPUTER_INTERFACE = TILE_ENTITIES.register("computer_interface", () -> TileEntityType.Builder.create(ComputerInterfaceTileEntity::new, BlockTypes.COMPUTER_INTERFACE.get()).build(null));
}
