package com.christian.ocoochcreate;

import com.christian.ocoochcreate.registry.OcoochItems;
import com.simibubi.create.foundation.utility.Components;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTab;

public class OcoochCreativeModeTab{

	private static final CreativeModeTab OCOOCH_CREATIVE_TAB = FabricItemGroup.builder()
			.title(Components.translatable("itemGroup.ocoochcreate.main"))
			.icon(OcoochItems.PAPER_AIRPLANE::asStack)
			.build();

	public static void register() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, "main", OCOOCH_CREATIVE_TAB);
		ItemGroupEvents.MODIFY_ENTRIES_ALL.register(OcoochCreativeModeTab::make);
	}

	private static void make(CreativeModeTab creativeModeTab, FabricItemGroupEntries entries) {
		if (creativeModeTab == OCOOCH_CREATIVE_TAB) {
			entries.accept(OcoochItems.PAPER_AIRPLANE);
			entries.accept(OcoochItems.PAPER_FOLDING);
		}
	}

}