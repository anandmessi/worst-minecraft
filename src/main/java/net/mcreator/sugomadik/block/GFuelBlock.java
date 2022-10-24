
package net.mcreator.sugomadik.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.sugomadik.init.SugomadikModFluids;

public class GFuelBlock extends LiquidBlock {
	public GFuelBlock() {
		super(() -> (FlowingFluid) SugomadikModFluids.G_FUEL.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}
}
