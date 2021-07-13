package net.mcreator.gra.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.gra.block.EndriteGrassBlock;
import net.mcreator.gra.GraModElements;
import net.mcreator.gra.GraMod;

import java.util.Map;

@GraModElements.ModElement.Tag
public class EndriteGrassNeighbourBlockChangesProcedure extends GraModElements.ModElement {
	public EndriteGrassNeighbourBlockChangesProcedure(GraModElements instance) {
		super(instance, 96);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				GraMod.LOGGER.warn("Failed to load dependency x for procedure EndriteGrassNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				GraMod.LOGGER.warn("Failed to load dependency y for procedure EndriteGrassNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				GraMod.LOGGER.warn("Failed to load dependency z for procedure EndriteGrassNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				GraMod.LOGGER.warn("Failed to load dependency world for procedure EndriteGrassNeighbourBlockChanges!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.END_STONE.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.END_STONE.getDefaultState(), 3);
		} else if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == EndriteGrassBlock.block.getDefaultState()
				.getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.END_STONE.getDefaultState(), 3);
		}
	}
}
