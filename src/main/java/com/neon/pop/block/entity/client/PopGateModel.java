package com.neon.pop.block.entity.client;

import com.neon.pop.PrinceOfPersia;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.model.GeoModel;

public class PopGateModel extends GeoModel {
    @Override
    public ResourceLocation getModelResource(GeoAnimatable animatable) {
        return new ResourceLocation(PrinceOfPersia.MOD_ID,"geo/gate_lvl1.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GeoAnimatable animatable) {
        return new ResourceLocation(PrinceOfPersia.MOD_ID,"textures/block/pop_lvl1_gate.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GeoAnimatable animatable) {
        return new ResourceLocation(PrinceOfPersia.MOD_ID,"animations/gate_lvl1_open.animation.json");
    }
}
