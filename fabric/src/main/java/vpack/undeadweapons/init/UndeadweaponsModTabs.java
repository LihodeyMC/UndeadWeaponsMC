
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package vpack.undeadweapons.init;

import vpack.undeadweapons.UndeadweaponsMod;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class UndeadweaponsModTabs {
	public static ResourceKey<CreativeModeTab> TAB_U_AXE_C = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(UndeadweaponsMod.MODID, "u_axe_c"));
	public static ResourceKey<CreativeModeTab> TAB_U_GS_C = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(UndeadweaponsMod.MODID, "u_gs_c"));
	public static ResourceKey<CreativeModeTab> TAB_U_SCYTHE_C = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(UndeadweaponsMod.MODID, "u_scythe_c"));
	public static ResourceKey<CreativeModeTab> TAB_UCB_C = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(UndeadweaponsMod.MODID, "ucb_c"));
	public static ResourceKey<CreativeModeTab> TAB_U_SWORD_C = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(UndeadweaponsMod.MODID, "u_sword_c"));
	public static ResourceKey<CreativeModeTab> TAB_U_SPEAR_C = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(UndeadweaponsMod.MODID, "u_spear_c"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_U_AXE_C, FabricItemGroup.builder().title(Component.translatable("item_group." + UndeadweaponsMod.MODID + ".u_axe_c")).icon(() -> new ItemStack(UndeadweaponsModItems.U_AXE)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_U_GS_C,
				FabricItemGroup.builder().title(Component.translatable("item_group." + UndeadweaponsMod.MODID + ".u_gs_c")).icon(() -> new ItemStack(UndeadweaponsModItems.U_GREAT_SWORD)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_U_SCYTHE_C,
				FabricItemGroup.builder().title(Component.translatable("item_group." + UndeadweaponsMod.MODID + ".u_scythe_c")).icon(() -> new ItemStack(UndeadweaponsModItems.U_SCYTHE)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_UCB_C,
				FabricItemGroup.builder().title(Component.translatable("item_group." + UndeadweaponsMod.MODID + ".ucb_c")).icon(() -> new ItemStack(UndeadweaponsModItems.CURSED_BONE)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_U_SWORD_C,
				FabricItemGroup.builder().title(Component.translatable("item_group." + UndeadweaponsMod.MODID + ".u_sword_c")).icon(() -> new ItemStack(UndeadweaponsModItems.U_SWORD)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_U_SPEAR_C,
				FabricItemGroup.builder().title(Component.translatable("item_group." + UndeadweaponsMod.MODID + ".u_spear_c")).icon(() -> new ItemStack(UndeadweaponsModItems.U_SPEAR)).build());
	}
}
