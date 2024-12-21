package com.christian.ocoochcreate;

import com.christian.ocoochcreate.registry.BlockRegistry;
import com.christian.ocoochcreate.registry.EntityRegistry;
import com.christian.ocoochcreate.registry.ItemRegistry;
import com.tterrag.registrate.Registrate;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;

import com.simibubi.create.Create;
import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OcoochCreate implements ModInitializer {
	public static final String ID = "ocoochcreate";
	public static final String NAME = "Ocooch Create";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	public static final Registrate REGISTRATE = Registrate.create(ID);

	@Override
	public void onInitialize() {
		OcoochCreativeModeTab.register();
		ItemRegistry.register();
		BlockRegistry.register();
		EntityRegistry.register();

		REGISTRATE.register();

		LOGGER.info("Create addon mod [{}] is loading alongside Create [{}]!", NAME, Create.VERSION);
		LOGGER.info(EnvExecutor.unsafeRunForDist(
				() -> () -> "{} is accessing Porting Lib from the client!",
				() -> () -> "{} is accessing Porting Lib from the server!"
		), NAME);
	}

	public static ResourceLocation asResource(String path) {
		return new ResourceLocation(ID, path);
	}
}
