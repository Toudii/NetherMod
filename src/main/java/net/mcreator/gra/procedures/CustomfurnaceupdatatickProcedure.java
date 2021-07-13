package net.mcreator.gra.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.gra.GraModElements;
import net.mcreator.gra.GraMod;

import java.util.Map;
import java.util.HashMap;

@GraModElements.ModElement.Tag
public class CustomfurnaceupdatatickProcedure extends GraModElements.ModElement {
	public CustomfurnaceupdatatickProcedure(GraModElements instance) {
		super(instance, 13);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				GraMod.LOGGER.warn("Failed to load dependency x for procedure Customfurnaceupdatatick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				GraMod.LOGGER.warn("Failed to load dependency y for procedure Customfurnaceupdatatick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				GraMod.LOGGER.warn("Failed to load dependency z for procedure Customfurnaceupdatatick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				GraMod.LOGGER.warn("Failed to load dependency world for procedure Customfurnaceupdatatick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", x);
			$_dependencies.put("y", y);
			$_dependencies.put("z", z);
			FireFurnaceUpdateTickProcedure.executeProcedure($_dependencies);
		}
	}
}
