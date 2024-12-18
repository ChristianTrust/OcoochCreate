package com.christian.ocoochcreate.registry;

import com.christian.ocoochcreate.entity.PaperAirplaneEntity;
import com.christian.ocoochcreate.entity.PaperAirplaneRenderer;
import com.tterrag.registrate.util.entry.EntityEntry;

import net.minecraft.world.entity.MobCategory;

import static com.christian.ocoochcreate.OcoochCreate.REGISTRATE;

public class OcoochEntity {

	public static final EntityEntry<PaperAirplaneEntity> PAPER_AIRPLANE_PROJECTILE =
			REGISTRATE.entity("paper_airplane_entity", PaperAirplaneEntity::new, MobCategory.MISC)
			.properties(PaperAirplaneEntity::build)
			.renderer(() -> PaperAirplaneRenderer::new)
			.register();

	public static void register(){}
}
