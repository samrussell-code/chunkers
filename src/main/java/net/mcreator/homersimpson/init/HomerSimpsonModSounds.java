
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.homersimpson.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.homersimpson.HomerSimpsonMod;

public class HomerSimpsonModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, HomerSimpsonMod.MODID);
	public static final RegistryObject<SoundEvent> HOMER_DEAD = REGISTRY.register("homer_dead", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("homer_simpson", "homer_dead")));
	public static final RegistryObject<SoundEvent> HOMER_AMBIENT = REGISTRY.register("homer_ambient", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("homer_simpson", "homer_ambient")));
	public static final RegistryObject<SoundEvent> HOMER_HURT = REGISTRY.register("homer_hurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("homer_simpson", "homer_hurt")));
	public static final RegistryObject<SoundEvent> HOMER_WALK = REGISTRY.register("homer_walk", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("homer_simpson", "homer_walk")));
	public static final RegistryObject<SoundEvent> TAPPED_OUT = REGISTRY.register("tapped_out", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("homer_simpson", "tapped_out")));
	public static final RegistryObject<SoundEvent> CHUNKER_AMBIENT = REGISTRY.register("chunker_ambient", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("homer_simpson", "chunker_ambient")));
}
