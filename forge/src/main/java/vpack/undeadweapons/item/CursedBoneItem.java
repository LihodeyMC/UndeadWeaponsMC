
package vpack.undeadweapons.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CursedBoneItem extends Item {
	public CursedBoneItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
