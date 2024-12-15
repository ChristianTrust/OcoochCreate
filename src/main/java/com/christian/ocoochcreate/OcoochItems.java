package com.christian.ocoochcreate;

import com.simibubi.create.AllCreativeModeTabs;
import com.tterrag.registrate.util.entry.ItemEntry;

import net.minecraft.world.item.Item;

import static com.christian.ocoochcreate.OcoochCreate.REGISTRATE;

public class OcoochItems {

	static {
		REGISTRATE.setCreativeTab(AllCreativeModeTabs.BASE_CREATIVE_TAB.key());
	}

	public static final ItemEntry<Item> PAPER_AIRPLANE =
			REGISTRATE.item("paper_airplane", Item::new)
					.register();

	// Load this class
	public static void register() {}
}
