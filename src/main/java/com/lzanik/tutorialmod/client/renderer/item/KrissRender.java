package com.lzanik.tutorialmod.client.renderer.item;

import com.lzanik.tutorialmod.client.model.item.KrissModel;
import com.lzanik.tutorialmod.item.custom.KrissItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class KrissRender extends GeoItemRenderer<KrissItem> {
    public KrissRender() {
        super(new KrissModel());
    }
}
