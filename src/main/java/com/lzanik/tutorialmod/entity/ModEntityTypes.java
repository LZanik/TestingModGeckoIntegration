package com.lzanik.tutorialmod.entity;

import com.lzanik.tutorialmod.TutorialMod;
import com.lzanik.tutorialmod.entity.custom.Quiquincho;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, TutorialMod.MOD_ID);

    public static final RegistryObject<EntityType<Quiquincho>> QUIQUINCHO =
            ENTITY_TYPES.register("quiquincho",
                    () -> EntityType.Builder.create(Quiquincho::new,
                            EntityClassification.CREATURE).size(1f, 0.3f)
                            .build(new ResourceLocation(TutorialMod.MOD_ID, "quiquincho").toString()));


    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
