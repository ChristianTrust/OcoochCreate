package com.christian.ocoochcreate.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractHurtingProjectile;
import net.minecraft.world.level.Level;

public class PaperAirplaneEntity extends AbstractHurtingProjectile {

	public PaperAirplaneEntity(EntityType<? extends AbstractHurtingProjectile> entityType, Level level) {
		super(entityType, level);
	}

	public static FabricEntityTypeBuilder<?> build(FabricEntityTypeBuilder builder) {
		FabricEntityTypeBuilder<PaperAirplaneEntity> entityBuilder = (FabricEntityTypeBuilder<PaperAirplaneEntity>) builder;
		return entityBuilder.dimensions(EntityDimensions.fixed(.25f, .25f));
	}
}
