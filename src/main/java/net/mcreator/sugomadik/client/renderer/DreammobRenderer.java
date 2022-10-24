
package net.mcreator.sugomadik.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.VillagerModel;

import net.mcreator.sugomadik.entity.DreammobEntity;

public class DreammobRenderer extends MobRenderer<DreammobEntity, VillagerModel<DreammobEntity>> {
	public DreammobRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel(context.bakeLayer(ModelLayers.VILLAGER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DreammobEntity entity) {
		return new ResourceLocation("sugomadik:textures/entities/2022_10_19_dream-20964631.png");
	}
}
