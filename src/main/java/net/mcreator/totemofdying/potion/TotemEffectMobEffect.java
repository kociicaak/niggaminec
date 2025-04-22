
package net.mcreator.totemofdying.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class TotemEffectMobEffect extends MobEffect {
	public TotemEffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -13434880);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, "c5735e8f-d12f-336e-afc6-220d661190fc", -1000, AttributeModifier.Operation.ADDITION);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
