
package net.mcreator.homersimpson.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.homersimpson.init.HomerSimpsonModFluids;

public class DiarrheaBlock extends LiquidBlock {
	public DiarrheaBlock() {
		super(() -> HomerSimpsonModFluids.DIARRHEA.get(), BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
