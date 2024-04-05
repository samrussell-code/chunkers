
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.homersimpson.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.homersimpson.item.TappedOutDiscItem;
import net.mcreator.homersimpson.item.SimpsonsDonutItem;
import net.mcreator.homersimpson.item.ChunkOfLardItem;
import net.mcreator.homersimpson.item.BenBurgerItem;
import net.mcreator.homersimpson.HomerSimpsonMod;

public class HomerSimpsonModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HomerSimpsonMod.MODID);
	public static final RegistryObject<Item> HOMER_SIMPSON_SPAWN_EGG = REGISTRY.register("homer_simpson_spawn_egg", () -> new ForgeSpawnEggItem(HomerSimpsonModEntities.HOMER_SIMPSON, -3620580, -13076545, new Item.Properties()));
	public static final RegistryObject<Item> SIMPSONS_DONUT = REGISTRY.register("simpsons_donut", () -> new SimpsonsDonutItem());
	public static final RegistryObject<Item> TAPPED_OUT_DISC = REGISTRY.register("tapped_out_disc", () -> new TappedOutDiscItem());
	public static final RegistryObject<Item> BEN_CHUNKER_SPAWN_EGG = REGISTRY.register("ben_chunker_spawn_egg", () -> new ForgeSpawnEggItem(HomerSimpsonModEntities.BEN_CHUNKER, -4480355, -13076545, new Item.Properties()));
	public static final RegistryObject<Item> POO = block(HomerSimpsonModBlocks.POO);
	public static final RegistryObject<Item> BEN_BURGER = REGISTRY.register("ben_burger", () -> new BenBurgerItem());
	public static final RegistryObject<Item> CHUNK_OF_LARD = REGISTRY.register("chunk_of_lard", () -> new ChunkOfLardItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
