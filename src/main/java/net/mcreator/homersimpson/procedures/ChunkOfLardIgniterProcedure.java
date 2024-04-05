package net.mcreator.homersimpson.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.homersimpson.block.LardDimensionPortalBlock;

public class ChunkOfLardIgniterProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Direction direction) {
		if (direction == null)
			return;
		double portalX = 0;
		double portalY = 0;
		double portalZ = 0;
		portalX = x + direction.getStepX();
		portalY = y + direction.getStepY();
		portalZ = z + direction.getStepZ();
		if (world.isEmptyBlock(BlockPos.containing(portalX, portalY, portalZ))) {
			if (world instanceof Level _level)
				LardDimensionPortalBlock.portalSpawn(_level, BlockPos.containing(portalX, portalY, portalZ));
		}
	}
}
