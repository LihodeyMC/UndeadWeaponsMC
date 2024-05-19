/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package vpack.undeadweapons.init;

import vpack.undeadweapons.item.USwordItem;
import vpack.undeadweapons.item.USpearItem;
import vpack.undeadweapons.item.UScytheItem;
import vpack.undeadweapons.item.UGreatSwordItem;
import vpack.undeadweapons.item.UAxeItem;
import vpack.undeadweapons.item.CursedBoneItem;
import vpack.undeadweapons.UndeadweaponsMod;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

public class UndeadweaponsModItems {
	public static Item CURSED_BONE;
	public static Item U_SCYTHE;
	public static Item U_AXE;
	public static Item U_GREAT_SWORD;
	public static Item U_SPEAR;
	public static Item U_SWORD;

	public static void load() {
		CURSED_BONE = register("cursed_bone", new CursedBoneItem());
		U_SCYTHE = register("u_scythe", new UScytheItem());
		U_AXE = register("u_axe", new UAxeItem());
		U_GREAT_SWORD = register("u_great_sword", new UGreatSwordItem());
		U_SPEAR = register("u_spear", new USpearItem());
		U_SWORD = register("u_sword", new USwordItem());
	}

	public static void clientLoad() {
	}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(UndeadweaponsMod.MODID, registryName), item);
	}

	private static void registerBlockingProperty(Item item) {
		ItemProperties.register(item, new ResourceLocation("blocking"), (ClampedItemPropertyFunction) ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
	}
}
