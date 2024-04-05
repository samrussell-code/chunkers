package net.mcreator.homersimpson.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.homersimpson.entity.HomerSimpsonEntity;

public class HomerSimpsonModel extends GeoModel<HomerSimpsonEntity> {
	@Override
	public ResourceLocation getAnimationResource(HomerSimpsonEntity entity) {
		return new ResourceLocation("homer_simpson", "animations/homer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HomerSimpsonEntity entity) {
		return new ResourceLocation("homer_simpson", "geo/homer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HomerSimpsonEntity entity) {
		return new ResourceLocation("homer_simpson", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(HomerSimpsonEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("ChunkerHead");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
