
package net.mcreator.homersimpson.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import net.mcreator.homersimpson.procedures.ChunkOfLardIgniterProcedure;

import java.util.List;

public class ChunkOfLardItem extends Item {
	public ChunkOfLardItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		ChunkOfLardIgniterProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getClickedFace());
		return InteractionResult.SUCCESS;
	}
}
