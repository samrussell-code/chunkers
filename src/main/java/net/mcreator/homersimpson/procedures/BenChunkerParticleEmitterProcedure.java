package net.mcreator.homersimpson.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.homersimpson.init.HomerSimpsonModParticleTypes;
import net.mcreator.homersimpson.HomerSimpsonMod;

public class BenChunkerParticleEmitterProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		HomerSimpsonMod.LOGGER.info("Spawn particle...");
		if (Mth.nextInt(RandomSource.create(), 1, 300) == 80) {
			world.addParticle((SimpleParticleType) (HomerSimpsonModParticleTypes.STINK_CLOUD.get()), x, (y + 1), z, 0, 1, 0);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("homer_simpson:fart")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("homer_simpson:fart")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
	}
}
