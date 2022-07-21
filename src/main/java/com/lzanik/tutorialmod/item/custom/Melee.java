package com.lzanik.tutorialmod.item.custom;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.lzanik.tutorialmod.item.util.ToolItem;
import net.minecraft.block.Block;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;

import java.util.Set;

public class Melee extends ToolItem {
    private final int attackDamage;
    private final double attackSpeed;
    private final Multimap<Attribute, AttributeModifier> attributeModifiers;

    public Melee(int attackDamage, double attackSpeed, Item.Properties properties) {
        super(properties);
        this.attackSpeed = attackSpeed;
        this.attackDamage = attackDamage;

        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(ATTACK_DAMAGE_MODIFIER,
                "Tool modifier", (double)this.attackDamage, AttributeModifier.Operation.ADDITION));
        builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(ATTACK_SPEED_MODIFIER,
                "Tool modifier", (double)this.attackSpeed, AttributeModifier.Operation.ADDITION));
        this.attributeModifiers = builder.build();
        //        this.effectiveBlocks = effectiveBlocksIn;
        //        this.efficiency = tier.getEfficiency();
//        this.attackDamage = attackDamageIn + tier.getAttackDamage();
//        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
//        builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(ATTACK_DAMAGE_MODIFIER,
//        "Tool modifier", (double)this.attackDamage, AttributeModifier.Operation.ADDITION));
//        builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(ATTACK_SPEED_MODIFIER,
//        "Tool modifier", (double)attackSpeedIn, AttributeModifier.Operation.ADDITION));
//        this.toolAttributes = builder.build();
    }

    @SuppressWarnings("deprecation")
    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType equipmentSlot) {
        return equipmentSlot == EquipmentSlotType.MAINHAND ? this.attributeModifiers : super.getAttributeModifiers(equipmentSlot);
    }


//    @SuppressWarnings("deprecation")
//    @Override
//    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType equipmentSlot) {
//        return equipmentSlot == EquipmentSlotType.MAINHAND ? this.attributeModifiers : super.getAttributeModifiers(equipmentSlot);
//    }

//    public Melee(float attackDamageIn, float attackSpeedIn, IItemTier tier, Set<Block> effectiveBlocksIn, Item.Properties builderIn) {
//        super(tier, builderIn);
//        this.attackDamage = attackDamageIn;
//        this.attackSpeed = attackSpeedIn;
//
//        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
//        builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(ATTACK_DAMAGE_MODIFIER,
//                "Weapon modifier", this.attackDamage, AttributeModifier.Operation.ADDITION));
//        builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(ATTACK_SPEED_MODIFIER,
//                "Weapon modifier", this.attackSpeed, AttributeModifier.Operation.ADDITION));
//        this.attributeModifiers = builder.build();
//    }
//    public ToolItem(float attackDamageIn, float attackSpeedIn, IItemTier tier, Set<Block> effectiveBlocksIn, Item.Properties builderIn) {
//        super(tier, builderIn);
//        this.effectiveBlocks = effectiveBlocksIn;
//        this.efficiency = tier.getEfficiency();
//        this.attackDamage = attackDamageIn + tier.getAttackDamage();
//        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
//        builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Tool modifier", (double)this.attackDamage, AttributeModifier.Operation.ADDITION));
//        builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(ATTACK_SPEED_MODIFIER, "Tool modifier", (double)attackSpeedIn, AttributeModifier.Operation.ADDITION));
//        this.toolAttributes = builder.build();
//    }
}
