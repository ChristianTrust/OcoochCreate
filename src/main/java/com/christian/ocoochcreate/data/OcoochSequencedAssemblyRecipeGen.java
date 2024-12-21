package com.christian.ocoochcreate.data;

import com.christian.ocoochcreate.OcoochCreate;
import com.christian.ocoochcreate.registry.ItemRegistry;
import com.simibubi.create.content.kinetics.press.PressingRecipe;
import com.simibubi.create.content.processing.sequenced.SequencedAssemblyRecipeBuilder;
import com.simibubi.create.foundation.data.recipe.CreateRecipeProvider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.world.item.Items;

import java.util.function.UnaryOperator;

public class OcoochSequencedAssemblyRecipeGen extends CreateRecipeProvider {

	GeneratedRecipe

	PAPER_AIRPLANE = ocoochCreate("paper_airplane",
			b -> b.require(Items.PAPER)
			.transitionTo(ItemRegistry.INCOMPLETE_PAPER_FOLDING.get())
			.addOutput(ItemRegistry.PAPER_AIRPLANE.get(), 1)
			.loops(5)
					.addStep(PressingRecipe::new, rb -> rb));

	public OcoochSequencedAssemblyRecipeGen(FabricDataOutput p_i48262_1_) {
		super(p_i48262_1_);
	}

	protected GeneratedRecipe ocoochCreate(String name, UnaryOperator<SequencedAssemblyRecipeBuilder> transform) {
		GeneratedRecipe generatedRecipe =
				c -> transform.apply(new SequencedAssemblyRecipeBuilder(OcoochCreate.asResource(name)))
						.build(c);
		all.add(generatedRecipe);
		return generatedRecipe;
	}
}
