
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sugomadik.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.sugomadik.world.biome.PineforestBiome;
import net.mcreator.sugomadik.world.biome.ObsidianBiome;
import net.mcreator.sugomadik.world.biome.GfueloceanBiome;
import net.mcreator.sugomadik.world.biome.DreamBiome;
import net.mcreator.sugomadik.SugomadikMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SugomadikModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, SugomadikMod.MODID);
	public static final RegistryObject<Biome> DREAM = REGISTRY.register("dream", () -> DreamBiome.createBiome());
	public static final RegistryObject<Biome> OBSIDIAN = REGISTRY.register("obsidian", () -> ObsidianBiome.createBiome());
	public static final RegistryObject<Biome> PINEFOREST = REGISTRY.register("pineforest", () -> PineforestBiome.createBiome());
	public static final RegistryObject<Biome> GFUELOCEAN = REGISTRY.register("gfuelocean", () -> GfueloceanBiome.createBiome());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			DreamBiome.init();
			ObsidianBiome.init();
			PineforestBiome.init();
			GfueloceanBiome.init();
		});
	}
}
