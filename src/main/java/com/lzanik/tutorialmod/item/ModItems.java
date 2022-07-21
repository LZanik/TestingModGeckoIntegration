package com.lzanik.tutorialmod.item;

import com.google.common.collect.Multimap;
import com.lzanik.tutorialmod.TutorialMod;
import com.lzanik.tutorialmod.entity.ModEntityTypes;
import com.lzanik.tutorialmod.item.custom.Firestone;
import com.lzanik.tutorialmod.item.custom.KrissItem;
import com.lzanik.tutorialmod.item.custom.Melee;
import com.lzanik.tutorialmod.item.custom.ModSpawnEggItem;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import software.bernie.example.item.PistolItem;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
            () -> new Item(new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> FIRESTONE = ITEMS.register("firestone",
            () -> new Firestone(new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP).maxDamage(8)));

    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword",
            () -> new SwordItem(ModItemTier.AMETHYST, 2, 3f,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP).isImmuneToFire()));

    public static final RegistryObject<ToolItem> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe",
            () -> new PickaxeItem(ModItemTier.AMETHYST, 2, 3f,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe",
            () -> new AxeItem(ModItemTier.AMETHYST, 2, 3f,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel",
            () -> new ShovelItem(ModItemTier.AMETHYST, 2, 3f,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe",
            () -> new HoeItem(ModItemTier.AMETHYST, 2, 3f,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> CROWBAR = ITEMS.register("crowbar",
            () -> new Melee(15,-2.4f, new Item.Properties().maxDamage(50).group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<KrissItem> KRISS_VECTOR = ITEMS.register("kriss_vector", () -> new KrissItem());

    public static final RegistryObject<ModSpawnEggItem> QUIQUINCHO_SPAWN_EGG = ITEMS.register("quiquincho_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.QUIQUINCHO, 0000, 0000,
                    new Item.Properties().maxStackSize(64).group(ModItemGroup.TUTORIAL_GROUP)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
