
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.totemofdying.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.totemofdying.item.TotemOfDyingItem;
import net.mcreator.totemofdying.item.TotemOfBackItem;
import net.mcreator.totemofdying.item.BetterTotemOfBackItem;
import net.mcreator.totemofdying.TotemofdyingMod;

public class TotemofdyingModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TotemofdyingMod.MODID);
	public static final RegistryObject<Item> TOTEM_OF_DYING = REGISTRY.register("totem_of_dying", () -> new TotemOfDyingItem());
	public static final RegistryObject<Item> TOTEM_OF_BACK = REGISTRY.register("totem_of_back", () -> new TotemOfBackItem());
	public static final RegistryObject<Item> BETTER_TOTEM_OF_BACK = REGISTRY.register("better_totem_of_back", () -> new BetterTotemOfBackItem());
	// Start of user code block custom items
	// End of user code block custom items
}
