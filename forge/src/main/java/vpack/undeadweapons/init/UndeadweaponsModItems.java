
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package vpack.undeadweapons.init;

import vpack.undeadweapons.item.USwordItem;
import vpack.undeadweapons.item.USpearItem;
import vpack.undeadweapons.item.UScytheItem;
import vpack.undeadweapons.item.UGreatSwordItem;
import vpack.undeadweapons.item.UAxeItem;
import vpack.undeadweapons.item.CursedBoneItem;
import vpack.undeadweapons.UndeadweaponsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class UndeadweaponsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UndeadweaponsMod.MODID);
	public static final RegistryObject<Item> CURSED_BONE = REGISTRY.register("cursed_bone", () -> new CursedBoneItem());
	public static final RegistryObject<Item> U_SCYTHE = REGISTRY.register("u_scythe", () -> new UScytheItem());
	public static final RegistryObject<Item> U_AXE = REGISTRY.register("u_axe", () -> new UAxeItem());
	public static final RegistryObject<Item> U_GREAT_SWORD = REGISTRY.register("u_great_sword", () -> new UGreatSwordItem());
	public static final RegistryObject<Item> U_SPEAR = REGISTRY.register("u_spear", () -> new USpearItem());
	public static final RegistryObject<Item> U_SWORD = REGISTRY.register("u_sword", () -> new USwordItem());
	// Start of user code block custom items
	// End of user code block custom items
}
