package com.christian.ocoochcreate.data;

import io.github.fabricators_of_create.porting_lib.data.ExistingFileHelper;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

import static com.christian.ocoochcreate.OcoochCreate.REGISTRATE;

public class OcoochCreateDatagen implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator generator) {
		ExistingFileHelper helper = ExistingFileHelper.withResourcesFromArg();
		FabricDataGenerator.Pack pack = generator.createPack();
		pack.addProvider(OcoochSequencedAssemblyRecipeGen::new);
		REGISTRATE.setupDatagen(pack, helper);
	}
}
