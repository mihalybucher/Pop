package com.neon.pop.block.entity.client;

import com.neon.pop.block.entity.PopGateBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class PopGateRenderer extends GeoBlockRenderer<PopGateBlockEntity> {


    public PopGateRenderer(BlockEntityRendererProvider.Context context) {
        super(new PopGateModel());
    }
}
