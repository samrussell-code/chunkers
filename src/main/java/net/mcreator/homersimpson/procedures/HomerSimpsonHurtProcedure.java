package net.mcreator.homersimpson.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.homersimpson.entity.HomerSimpsonEntity;

public class HomerSimpsonHurtProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof HomerSimpsonEntity) {
			((HomerSimpsonEntity) entity).setAnimation("hurt");
		}
	}
}
