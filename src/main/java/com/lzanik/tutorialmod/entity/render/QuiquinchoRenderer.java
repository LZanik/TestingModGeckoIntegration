package com.lzanik.tutorialmod.entity.render;

import com.lzanik.tutorialmod.TutorialMod;
import com.lzanik.tutorialmod.entity.custom.Quiquincho;
import com.lzanik.tutorialmod.entity.model.QuiquinchoModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class QuiquinchoRenderer extends MobRenderer<Quiquincho, QuiquinchoModel<Quiquincho>> {

    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(TutorialMod.MOD_ID, "textures/entity/quiquincho_tex.png");
    public QuiquinchoRenderer(EntityRendererManager rendererManagerIn){super(rendererManagerIn, new QuiquinchoModel<>(), 0.3f);}


    @Override
    public ResourceLocation getEntityTexture(Quiquincho entity) {return TEXTURE;}
}
