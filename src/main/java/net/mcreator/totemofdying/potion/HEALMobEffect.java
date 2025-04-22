
package net.mcreator.totemofdying.potion;

import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class HEALMobEffect extends MobEffect {
	public HEALMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1);
		this.addAttributeModifier(Attributes.ARMOR, "def96be9-8e25-3c4c-993e-10e8c5f14fcb", 1000, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.MAX_HEALTH, "90d26dfa-3376-363a-80ae-b399584c6d1b", 1000, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.KNOCKBACK_RESISTANCE, "ee160e95-e727-3b73-aa00-6bd52907cc5d", -1000, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(ForgeMod.ENTITY_GRAVITY.get(), "2cc32391-e2c3-3b30-804b-56dcd4a49a19", 0, AttributeModifier.Operation.ADDITION);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
