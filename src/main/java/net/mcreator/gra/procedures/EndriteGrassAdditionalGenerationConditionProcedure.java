package net.mcreator.gra.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.gra.GraModElements;
import net.mcreator.gra.GraMod;

import java.util.Map;

@GraModElements.ModElement.Tag
public class EndriteGrassAdditionalGenerationConditionProcedure extends GraModElements.ModElement {
	public EndriteGrassAdditionalGenerationConditionProcedure(GraModElements instance) {
		super(instance, 87);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				GraMod.LOGGER.warn("Failed to load dependency x for procedure EndriteGrassAdditionalGenerationCondition!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				GraMod.LOGGER.warn("Failed to load dependency y for procedure EndriteGrassAdditionalGenerationCondition!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				GraMod.LOGGER.warn("Failed to load dependency z for procedure EndriteGrassAdditionalGenerationCondition!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				GraMod.LOGGER.warn("Failed to load dependency world for procedure EndriteGrassAdditionalGenerationCondition!");
			return false;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())) {
			return (true);
		}
		return (false);
	}
}
