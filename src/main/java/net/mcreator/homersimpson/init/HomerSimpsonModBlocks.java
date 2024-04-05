
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.homersimpson.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.homersimpson.block.RawLardMoldBlockBlock;
import net.mcreator.homersimpson.block.RawLardBlockBlock;
import net.mcreator.homersimpson.block.ProcessedLardBlockBlock;
import net.mcreator.homersimpson.block.PooBlockBlock;
import net.mcreator.homersimpson.block.PooBlock;
import net.mcreator.homersimpson.block.LardDimensionPortalBlock;
import net.mcreator.homersimpson.block.DiarrheaBlock;
import net.mcreator.homersimpson.block.BenBurgerBlock;
import net.mcreator.homersimpson.HomerSimpsonMod;

public class HomerSimpsonModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HomerSimpsonMod.MODID);
	public static final RegistryObject<Block> POO = REGISTRY.register("poo", () -> new PooBlock());
	public static final RegistryObject<Block> BEN_BURGER = REGISTRY.register("ben_burger", () -> new BenBurgerBlock());
	public static final RegistryObject<Block> RAW_LARD_MOLD_BLOCK = REGISTRY.register("raw_lard_mold_block", () -> new RawLardMoldBlockBlock());
	public static final RegistryObject<Block> PROCESSED_LARD_BLOCK = REGISTRY.register("processed_lard_block", () -> new ProcessedLardBlockBlock());
	public static final RegistryObject<Block> RAW_LARD_BLOCK = REGISTRY.register("raw_lard_block", () -> new RawLardBlockBlock());
	public static final RegistryObject<Block> LARD_DIMENSION_PORTAL = REGISTRY.register("lard_dimension_portal", () -> new LardDimensionPortalBlock());
	public static final RegistryObject<Block> POO_BLOCK = REGISTRY.register("poo_block", () -> new PooBlockBlock());
	public static final RegistryObject<Block> DIARRHEA = REGISTRY.register("diarrhea", () -> new DiarrheaBlock());
}
