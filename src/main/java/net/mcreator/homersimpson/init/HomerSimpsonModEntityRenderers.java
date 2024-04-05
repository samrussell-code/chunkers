
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.homersimpson.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.homersimpson.client.renderer.HomerSimpsonRenderer;
import net.mcreator.homersimpson.client.renderer.BenChunkerRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HomerSimpsonModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HomerSimpsonModEntities.HOMER_SIMPSON.get(), HomerSimpsonRenderer::new);
		event.registerEntityRenderer(HomerSimpsonModEntities.BEN_CHUNKER.get(), BenChunkerRenderer::new);
	}
}
