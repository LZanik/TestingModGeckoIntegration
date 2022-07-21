package com.lzanik.tutorialmod.item.custom;

import com.lzanik.tutorialmod.item.ModItemGroup;
import com.lzanik.tutorialmod.client.renderer.item.KrissRender;
import net.minecraft.item.Item;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.network.GeckoLibNetwork;
import software.bernie.geckolib3.network.ISyncable;

public class KrissItem extends Item implements IAnimatable, ISyncable {

    public String controllerName = "controller";
    public AnimationFactory factory = new AnimationFactory(this);

    public KrissItem() {
        super(new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP).maxStackSize(1)
                .setISTER(() -> KrissRender::new));
        GeckoLibNetwork.registerSyncable(this);
    }
//    public void initializeClient(Consumer<IItemPropertyGetter> consumer){
//        super.initializeClient(consumer);
//    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this, controllerName, 1, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    public <P extends Item & IAnimatable> PlayState predicate(AnimationEvent<P> event) {
        event.getController().setAnimation(new AnimationBuilder().addAnimation("shooting", false));
        return PlayState.CONTINUE;
    }

    @Override
    public void onAnimationSync(int id, int state) {

    }
}
