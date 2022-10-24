
package net.mcreator.sugomadik.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.sugomadik.init.SugomadikModItems;
import net.mcreator.sugomadik.init.SugomadikModFluids;
import net.mcreator.sugomadik.init.SugomadikModBlocks;

public abstract class GFuelFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(SugomadikModFluids.G_FUEL,
			SugomadikModFluids.FLOWING_G_FUEL,
			FluidAttributes.builder(new ResourceLocation("sugomadik:blocks/watr_still"), new ResourceLocation("sugomadik:blocks/watr_sflow"))

	).explosionResistance(100f)

			.bucket(SugomadikModItems.G_FUEL_BUCKET).block(() -> (LiquidBlock) SugomadikModBlocks.G_FUEL.get());

	private GFuelFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.EXPLOSION;
	}

	public static class Source extends GFuelFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends GFuelFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
