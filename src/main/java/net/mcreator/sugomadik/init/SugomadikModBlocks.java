
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sugomadik.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.sugomadik.block.PineWoodBlock;
import net.mcreator.sugomadik.block.PineStairsBlock;
import net.mcreator.sugomadik.block.PineSlabBlock;
import net.mcreator.sugomadik.block.PinePressurePlateBlock;
import net.mcreator.sugomadik.block.PinePlanksBlock;
import net.mcreator.sugomadik.block.PineLogBlock;
import net.mcreator.sugomadik.block.PineLeavesBlock;
import net.mcreator.sugomadik.block.PineFenceGateBlock;
import net.mcreator.sugomadik.block.PineFenceBlock;
import net.mcreator.sugomadik.block.PineButtonBlock;
import net.mcreator.sugomadik.block.GFuelBlock;
import net.mcreator.sugomadik.block.DreamdimensionPortalBlock;
import net.mcreator.sugomadik.block.DreamOreBlock;
import net.mcreator.sugomadik.block.DreamBlockBlock;
import net.mcreator.sugomadik.SugomadikMod;

public class SugomadikModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SugomadikMod.MODID);
	public static final RegistryObject<Block> DREAM_ORE = REGISTRY.register("dream_ore", () -> new DreamOreBlock());
	public static final RegistryObject<Block> DREAM_BLOCK = REGISTRY.register("dream_block", () -> new DreamBlockBlock());
	public static final RegistryObject<Block> PINE_WOOD = REGISTRY.register("pine_wood", () -> new PineWoodBlock());
	public static final RegistryObject<Block> PINE_LOG = REGISTRY.register("pine_log", () -> new PineLogBlock());
	public static final RegistryObject<Block> PINE_PLANKS = REGISTRY.register("pine_planks", () -> new PinePlanksBlock());
	public static final RegistryObject<Block> PINE_LEAVES = REGISTRY.register("pine_leaves", () -> new PineLeavesBlock());
	public static final RegistryObject<Block> PINE_STAIRS = REGISTRY.register("pine_stairs", () -> new PineStairsBlock());
	public static final RegistryObject<Block> PINE_SLAB = REGISTRY.register("pine_slab", () -> new PineSlabBlock());
	public static final RegistryObject<Block> PINE_FENCE = REGISTRY.register("pine_fence", () -> new PineFenceBlock());
	public static final RegistryObject<Block> PINE_FENCE_GATE = REGISTRY.register("pine_fence_gate", () -> new PineFenceGateBlock());
	public static final RegistryObject<Block> PINE_PRESSURE_PLATE = REGISTRY.register("pine_pressure_plate", () -> new PinePressurePlateBlock());
	public static final RegistryObject<Block> PINE_BUTTON = REGISTRY.register("pine_button", () -> new PineButtonBlock());
	public static final RegistryObject<Block> G_FUEL = REGISTRY.register("g_fuel", () -> new GFuelBlock());
	public static final RegistryObject<Block> DREAMDIMENSION_PORTAL = REGISTRY.register("dreamdimension_portal",
			() -> new DreamdimensionPortalBlock());
}
