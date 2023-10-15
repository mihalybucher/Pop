package com.neon.pop.item.client;

import com.neon.pop.PrinceOfPersia;
import com.neon.pop.item.PopGateItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class PopGateItemModel extends GeoModel<PopGateItem> {
    @Override
    public ResourceLocation getModelResource(PopGateItem animatable) {
        return new ResourceLocation(PrinceOfPersia.MOD_ID, "geo/gate_lvl1.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PopGateItem animatable) {
        return new ResourceLocation(PrinceOfPersia.MOD_ID, "textures/block/pop_lvl1_gate.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PopGateItem animatable) {
        return new ResourceLocation(PrinceOfPersia.MOD_ID, "animations/gate_lvl1_open.animation.json");
    }
}
