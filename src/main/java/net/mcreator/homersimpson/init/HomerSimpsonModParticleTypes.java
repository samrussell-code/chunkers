
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.homersimpson.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.homersimpson.HomerSimpsonMod;

public class HomerSimpsonModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, HomerSimpsonMod.MODID);
	public static final RegistryObject<SimpleParticleType> STINK_CLOUD = REGISTRY.register("stink_cloud", () -> new SimpleParticleType(true));
}
