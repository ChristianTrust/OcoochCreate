package com.christian.ocoochcreate.registry;

import com.christian.ocoochcreate.items.PaperAirplaneItem;
import com.tterrag.registrate.util.entry.ItemEntry;

import net.minecraft.world.item.Item;

import static com.christian.ocoochcreate.OcoochCreate.REGISTRATE;

public class OcoochItems {

	public static final ItemEntry<PaperAirplaneItem> PAPER_AIRPLANE =
			REGISTRATE.item("paper_airplane", PaperAirplaneItem::new)
					.register();
	public static final ItemEntry<SequencedAssemblyItem> PAPER_FOLDING =
			REGISTRATE.item("paper_folding", SequencedAssemblyItem::new)
					.register();

	public static void register() {}
}
