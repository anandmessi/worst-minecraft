
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sugomadik.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.sugomadik.item.GFuelItem;
import net.mcreator.sugomadik.item.DreamdimensionItem;
import net.mcreator.sugomadik.item.DreamSwordItem;
import net.mcreator.sugomadik.item.DreamShovelItem;
import net.mcreator.sugomadik.item.DreamPickaxeItem;
import net.mcreator.sugomadik.item.DreamIngotItem;
import net.mcreator.sugomadik.item.DreamHoeItem;
import net.mcreator.sugomadik.item.DreamAxeItem;
import net.mcreator.sugomadik.item.DreamArmorItem;
import net.mcreator.sugomadik.SugomadikMod;

public class SugomadikModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SugomadikMod.MODID);
	public static final RegistryObject<Item> DREAM_INGOT = REGISTRY.register("dream_ingot", () -> new DreamIngotItem());
	public static final RegistryObject<Item> DREAM_ORE = block(SugomadikModBlocks.DREAM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DREAM_BLOCK = block(SugomadikModBlocks.DREAM_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PINE_WOOD = block(SugomadikModBlocks.PINE_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PINE_LOG = block(SugomadikModBlocks.PINE_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PINE_PLANKS = block(SugomadikModBlocks.PINE_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PINE_LEAVES = block(SugomadikModBlocks.PINE_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> PINE_STAIRS = block(SugomadikModBlocks.PINE_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PINE_SLAB = block(SugomadikModBlocks.PINE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PINE_FENCE = block(SugomadikModBlocks.PINE_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> PINE_FENCE_GATE = block(SugomadikModBlocks.PINE_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> PINE_PRESSURE_PLATE = block(SugomadikModBlocks.PINE_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> PINE_BUTTON = block(SugomadikModBlocks.PINE_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DREAM_PICKAXE = REGISTRY.register("dream_pickaxe", () -> new DreamPickaxeItem());
	public static final RegistryObject<Item> DREAM_AXE = REGISTRY.register("dream_axe", () -> new DreamAxeItem());
	public static final RegistryObject<Item> DREAM_SWORD = REGISTRY.register("dream_sword", () -> new DreamSwordItem());
	public static final RegistryObject<Item> DREAM_SHOVEL = REGISTRY.register("dream_shovel", () -> new DreamShovelItem());
	public static final RegistryObject<Item> DREAM_HOE = REGISTRY.register("dream_hoe", () -> new DreamHoeItem());
	public static final RegistryObject<Item> DREAM_ARMOR_HELMET = REGISTRY.register("dream_armor_helmet", () -> new DreamArmorItem.Helmet());
	public static final RegistryObject<Item> DREAM_ARMOR_CHESTPLATE = REGISTRY.register("dream_armor_chestplate",
			() -> new DreamArmorItem.Chestplate());
	public static final RegistryObject<Item> DREAM_ARMOR_LEGGINGS = REGISTRY.register("dream_armor_leggings", () -> new DreamArmorItem.Leggings());
	public static final RegistryObject<Item> DREAM_ARMOR_BOOTS = REGISTRY.register("dream_armor_boots", () -> new DreamArmorItem.Boots());
	public static final RegistryObject<Item> G_FUEL_BUCKET = REGISTRY.register("g_fuel_bucket", () -> new GFuelItem());
	public static final RegistryObject<Item> DREAMDIMENSION = REGISTRY.register("dreamdimension", () -> new DreamdimensionItem());
	public static final RegistryObject<Item> DREAMMOB = REGISTRY.register("dreammob_spawn_egg",
			() -> new ForgeSpawnEggItem(SugomadikModEntities.DREAMMOB, -1, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
