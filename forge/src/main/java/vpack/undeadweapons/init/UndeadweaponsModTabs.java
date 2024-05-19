
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package vpack.undeadweapons.init;

import vpack.undeadweapons.UndeadweaponsMod;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UndeadweaponsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UndeadweaponsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(UndeadweaponsModItems.U_SCYTHE.get());
			tabData.accept(UndeadweaponsModItems.U_AXE.get());
			tabData.accept(UndeadweaponsModItems.U_GREAT_SWORD.get());
			tabData.accept(UndeadweaponsModItems.U_SPEAR.get());
			tabData.accept(UndeadweaponsModItems.U_SWORD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(UndeadweaponsModItems.CURSED_BONE.get());
		}
	}
}
