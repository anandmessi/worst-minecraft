
package net.mcreator.sugomadik.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.sugomadik.init.SugomadikModFluids;

public class GFuelItem extends BucketItem {
	public GFuelItem() {
		super(SugomadikModFluids.G_FUEL,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}
}
