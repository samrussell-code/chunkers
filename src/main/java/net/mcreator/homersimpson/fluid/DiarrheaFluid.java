
package net.mcreator.homersimpson.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.homersimpson.init.HomerSimpsonModItems;
import net.mcreator.homersimpson.init.HomerSimpsonModFluids;
import net.mcreator.homersimpson.init.HomerSimpsonModFluidTypes;
import net.mcreator.homersimpson.init.HomerSimpsonModBlocks;

public abstract class DiarrheaFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> HomerSimpsonModFluidTypes.DIARRHEA_TYPE.get(), () -> HomerSimpsonModFluids.DIARRHEA.get(), () -> HomerSimpsonModFluids.FLOWING_DIARRHEA.get())
			.explosionResistance(100f).bucket(() -> HomerSimpsonModItems.DIARRHEA_BUCKET.get()).block(() -> (LiquidBlock) HomerSimpsonModBlocks.DIARRHEA.get());

	private DiarrheaFluid() {
		super(PROPERTIES);
	}

	public static class Source extends DiarrheaFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends DiarrheaFluid {
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
