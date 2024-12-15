package com.christian.ocoochcreate;

import com.simibubi.create.Create;

import com.simibubi.create.foundation.data.CreateRegistrate;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.ResourceLocation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OcoochCreate implements ModInitializer {
	public static final String ID = "ocoochcreate";
	public static final String NAME = "Ocooch Create";
	public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(ID);
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	@Override
	public void onInitialize() {
		OcoochItems.register();

		// fabric exclusive, squeeze this in here to register before stuff is used
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
