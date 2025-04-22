
package net.mcreator.totemofdying.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.totemofdying.procedures.TotemOfBackPlayerFinishesUsingItemProcedure;

public class TotemOfBackItem extends Item {
	public TotemOfBackItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(0).saturationMod(0f).alwaysEat().build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		TotemOfBackPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
