
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.totemofdying.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.totemofdying.TotemofdyingMod;

public class TotemofdyingModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TotemofdyingMod.MODID);
	public static final RegistryObject<CreativeModeTab> MORE_TOTEMS = REGISTRY.register("more_totems",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.totemofdying.more_totems")).icon(() -> new ItemStack(TotemofdyingModItems.TOTEM_OF_DYING.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TotemofdyingModItems.TOTEM_OF_DYING.get());
				tabData.accept(TotemofdyingModItems.TOTEM_OF_BACK.get());
				tabData.accept(TotemofdyingModItems.BETTER_TOTEM_OF_BACK.get());
			}).build());
}
