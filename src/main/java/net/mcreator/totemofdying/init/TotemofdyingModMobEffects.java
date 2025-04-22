
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.totemofdying.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.totemofdying.potion.TotemEffectMobEffect;
import net.mcreator.totemofdying.potion.HEALMobEffect;
import net.mcreator.totemofdying.TotemofdyingMod;

public class TotemofdyingModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, TotemofdyingMod.MODID);
	public static final RegistryObject<MobEffect> TOTEM_EFFECT = REGISTRY.register("totem_effect", () -> new TotemEffectMobEffect());
	public static final RegistryObject<MobEffect> HEAL = REGISTRY.register("heal", () -> new HEALMobEffect());
}
