package net.mcreator.totemofdying.procedures;

import net.minecraft.world.entity.Entity;

public class HEALActiveTickConditionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.fallDistance = 0;
	}
}
