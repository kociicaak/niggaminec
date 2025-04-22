package net.mcreator.totemofdying.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.totemofdying.init.TotemofdyingModMobEffects;
import net.mcreator.totemofdying.TotemofdyingMod;

public class TotemOfDyingPlayerFinishesUsingItemProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(TotemofdyingModMobEffects.HEAL.get(), 1, 10, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 100, (int) 0.001, false, false));
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(100000);
		TotemofdyingMod.queueServerWork(1, () -> {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (entity.getX()), (entity.getY()), (entity.getZ()), 40, Level.ExplosionInteraction.MOB);
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(20);
			entity.push((100 * entity.getLookAngle().x), (100 * entity.getLookAngle().y), (100 * entity.getLookAngle().z));
		});
	}
}
