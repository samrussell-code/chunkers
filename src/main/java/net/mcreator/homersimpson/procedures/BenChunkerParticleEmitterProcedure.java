package net.mcreator.homersimpson.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.homersimpson.init.HomerSimpsonModParticleTypes;
import net.mcreator.homersimpson.HomerSimpsonMod;

public class BenChunkerParticleEmitterProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		HomerSimpsonMod.LOGGER.info("Spawn particle...");
		if (Mth.nextInt(RandomSource.create(), 1, 160) == 80) {
			world.addParticle((SimpleParticleType) (HomerSimpsonModParticleTypes.STINK_CLOUD.get()), x, (y + 1), z, 0, 1, 0);
		}
	}
}
