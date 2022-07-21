package com.lzanik.tutorialmod.client.model.item;

import com.lzanik.tutorialmod.TutorialMod;
import com.lzanik.tutorialmod.item.custom.KrissItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.example.GeckoLibMod;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KrissModel extends AnimatedGeoModel<KrissItem> {
    @Override
    public ResourceLocation getModelLocation(KrissItem object) {
        return new ResourceLocation(GeckoLib.ModID, "geo/pistol.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KrissItem object) {
        return new ResourceLocation(TutorialMod.MOD_ID, "textures/item/vector_tex.json");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KrissItem animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "animations/vector.animation.json");
    }
}
