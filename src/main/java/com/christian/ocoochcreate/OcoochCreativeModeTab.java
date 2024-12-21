package com.christian.ocoochcreate;

import com.christian.ocoochcreate.registry.BlockRegistry;
import com.christian.ocoochcreate.registry.ItemRegistry;
import com.simibubi.create.foundation.utility.Components;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTab;

public class OcoochCreativeModeTab{

	//private static final TabInfo OCOOCH_CREATIVE_TAB = register("base",
	//		() -> FabricItemGroup.builder()
	//		.title(Components.translatable("Ocooch"))
	//		.icon(OcoochItems.PAPER_AIRPLANE::asStack)
	//		.build());
	//
	//private static TabInfo register(String name, Supplier<CreativeModeTab> supplier) {
	//	ResourceLocation id = OcoochCreate.asResource(name);
	//	ResourceKey<CreativeModeTab> key = ResourceKey.create(Registries.CREATIVE_MODE_TAB, id);
	//	CreativeModeTab tab = supplier.get();
	//	Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, key, tab);
	//	return new TabInfo(key, tab);
	//}
	//
	//public record TabInfo(ResourceKey<CreativeModeTab> key, CreativeModeTab tab) {
	//}


	private static final CreativeModeTab OCOOCH_CREATIVE_TAB = FabricItemGroup.builder()
			.title(Components.literal("Ocooch"))
			.icon(ItemRegistry.PAPER_AIRPLANE::asStack)
			.build();

	public static void register() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, "main", OCOOCH_CREATIVE_TAB);
		ItemGroupEvents.MODIFY_ENTRIES_ALL.register(OcoochCreativeModeTab::make);
	}

	private static void make(CreativeModeTab creativeModeTab, FabricItemGroupEntries entries) {
		if (creativeModeTab == OCOOCH_CREATIVE_TAB) {
			entries.accept(ItemRegistry.PAPER_AIRPLANE);
			entries.accept(ItemRegistry.PAPER_FOLDING);
			entries.accept(BlockRegistry.TEST_LUMBER);
		}
	}

}
