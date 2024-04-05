
package net.mcreator.homersimpson.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.List;

@JeiPlugin
public class HomerSimpsonModJeiInformation implements IModPlugin {
	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("homer_simpson:information");
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		registration.addIngredientInfo(List.of(new ItemStack(HomerSimpsonModItems.SIMPSONS_DONUT.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.homer_simpson.simpsons_donut_info"));
		registration.addIngredientInfo(List.of(new ItemStack(HomerSimpsonModItems.HOMER_SIMPSON_SPAWN_EGG.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.homer_simpson.homer_simpson_info"));
	}
}
