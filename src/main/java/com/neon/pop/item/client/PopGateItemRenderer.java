package com.neon.pop.item.client;

import com.neon.pop.item.PopGateItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class PopGateItemRenderer extends GeoItemRenderer<PopGateItem> {


    public PopGateItemRenderer() {
        super(new PopGateItemModel());
    }
}
