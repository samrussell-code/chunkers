
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.homersimpson.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.homersimpson.HomerSimpsonMod;

public class HomerSimpsonModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HomerSimpsonMod.MODID);
	public static final RegistryObject<CreativeModeTab> SIMPSONS_TAB = REGISTRY.register("simpsons_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.homer_simpson.simpsons_tab")).icon(() -> new ItemStack(HomerSimpsonModItems.SIMPSONS_DONUT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(HomerSimpsonModItems.HOMER_SIMPSON_SPAWN_EGG.get());
				tabData.accept(HomerSimpsonModItems.SIMPSONS_DONUT.get());
				tabData.accept(HomerSimpsonModItems.TAPPED_OUT_DISC.get());
				tabData.accept(HomerSimpsonModItems.BEN_CHUNKER_SPAWN_EGG.get());
				tabData.accept(HomerSimpsonModBlocks.POO.get().asItem());
				tabData.accept(HomerSimpsonModItems.CHUNK_OF_LARD.get());
				tabData.accept(HomerSimpsonModBlocks.BEN_BURGER.get().asItem());
				tabData.accept(HomerSimpsonModBlocks.RAW_LARD_MOLD_BLOCK.get().asItem());
				tabData.accept(HomerSimpsonModBlocks.PROCESSED_LARD_BLOCK.get().asItem());
				tabData.accept(HomerSimpsonModBlocks.RAW_LARD_BLOCK.get().asItem());
				tabData.accept(HomerSimpsonModBlocks.POO_BLOCK.get().asItem());
				tabData.accept(HomerSimpsonModItems.DIARRHEA_BUCKET.get());
			})

					.build());
}
