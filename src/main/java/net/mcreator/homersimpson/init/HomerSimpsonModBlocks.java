
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.homersimpson.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.homersimpson.block.PooBlock;
import net.mcreator.homersimpson.HomerSimpsonMod;

public class HomerSimpsonModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HomerSimpsonMod.MODID);
	public static final RegistryObject<Block> POO = REGISTRY.register("poo", () -> new PooBlock());
}
