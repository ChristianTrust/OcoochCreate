package com.christian.ocoochcreate.registry;

import com.tterrag.registrate.util.entry.BlockEntry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import static com.christian.ocoochcreate.OcoochCreate.REGISTRATE;

public class BlockRegistry {

	public static final BlockEntry<Block> TEST_LUMBER =
			REGISTRATE.block("test_lumber", Block::new)
					.initialProperties(()-> Blocks.OAK_PLANKS)
					.properties(p -> p)
					.simpleItem().register();

	public static void register() {}
}
