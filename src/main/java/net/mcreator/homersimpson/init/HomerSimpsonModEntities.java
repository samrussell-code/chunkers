
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.homersimpson.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.homersimpson.entity.HomerSimpsonEntity;
import net.mcreator.homersimpson.entity.BenChunkerEntity;
import net.mcreator.homersimpson.HomerSimpsonMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HomerSimpsonModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, HomerSimpsonMod.MODID);
	public static final RegistryObject<EntityType<HomerSimpsonEntity>> HOMER_SIMPSON = register("homer_simpson",
			EntityType.Builder.<HomerSimpsonEntity>of(HomerSimpsonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HomerSimpsonEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BenChunkerEntity>> BEN_CHUNKER = register("ben_chunker",
			EntityType.Builder.<BenChunkerEntity>of(BenChunkerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BenChunkerEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			HomerSimpsonEntity.init();
			BenChunkerEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(HOMER_SIMPSON.get(), HomerSimpsonEntity.createAttributes().build());
		event.put(BEN_CHUNKER.get(), BenChunkerEntity.createAttributes().build());
	}
}
