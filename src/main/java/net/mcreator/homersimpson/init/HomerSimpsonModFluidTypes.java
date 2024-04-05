
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.homersimpson.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.homersimpson.fluid.types.DiarrheaFluidType;
import net.mcreator.homersimpson.HomerSimpsonMod;

public class HomerSimpsonModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, HomerSimpsonMod.MODID);
	public static final RegistryObject<FluidType> DIARRHEA_TYPE = REGISTRY.register("diarrhea", () -> new DiarrheaFluidType());
}
