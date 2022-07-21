package com.lzanik.tutorialmod.events;

import com.lzanik.tutorialmod.TutorialMod;
import com.lzanik.tutorialmod.entity.ModEntityTypes;
import com.lzanik.tutorialmod.entity.custom.Quiquincho;
import com.lzanik.tutorialmod.item.custom.ModSpawnEggItem;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event){
        event.put(ModEntityTypes.QUIQUINCHO.get(), Quiquincho.setCustomAttributes().create());
    }

    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event){
        ModSpawnEggItem.initSpawneggs();;
    }
}
