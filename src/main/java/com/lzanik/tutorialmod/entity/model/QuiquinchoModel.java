package com.lzanik.tutorialmod.entity.model;

import com.lzanik.tutorialmod.entity.custom.Quiquincho;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class QuiquinchoModel <T extends Quiquincho> extends EntityModel<T> {
	private final ModelRenderer Quiquincho;
	private final ModelRenderer body;
	private final ModelRenderer rear;
	private final ModelRenderer lear;
	private final ModelRenderer backlegs;
	private final ModelRenderer frontlegs;
	private final ModelRenderer head;
	private final ModelRenderer tail;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;

	public QuiquinchoModel() {
		textureWidth = 32;
		textureHeight = 32;

		Quiquincho = new ModelRenderer(this);
		Quiquincho.setRotationPoint(0.5F, 19.75F, -8.5F);


		body = new ModelRenderer(this);
		body.setRotationPoint(-0.5F, 4.25F, 8.5F);
		Quiquincho.addChild(body);
		body.setTextureOffset(17, 0).addBox(-2.0F, -5.0F, -4.3249F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(16, 17).addBox(-2.0F, -5.0F, 1.6751F, 4.0F, 4.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 9).addBox(-2.0F, -6.0F, -3.3249F, 4.0F, 5.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-3.0F, -5.0F, -3.3249F, 6.0F, 4.0F, 5.0F, 0.0F, false);

		rear = new ModelRenderer(this);
		rear.setRotationPoint(0.5F, -0.5F, 3.6751F);
		Quiquincho.addChild(rear);
		setRotationAngle(rear, 1.6042F, 0.028F, -0.6977F);
		rear.setTextureOffset(18, 14).addBox(-1.9F, -0.5F, 0.05F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		lear = new ModelRenderer(this);
		lear.setRotationPoint(-0.5F, -0.5F, 3.6751F);
		Quiquincho.addChild(lear);
		setRotationAngle(lear, 1.6042F, -0.028F, 0.6977F);
		lear.setTextureOffset(0, 24).addBox(0.15F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		backlegs = new ModelRenderer(this);
		backlegs.setRotationPoint(-0.5F, 2.3768F, 9.339F);
		Quiquincho.addChild(backlegs);
		setRotationAngle(backlegs, 1.8762F, 0.0F, 0.0F);
		backlegs.setTextureOffset(11, 20).addBox(0.925F, 0.5F, -2.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		backlegs.setTextureOffset(6, 19).addBox(-1.925F, 0.5F, -2.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		frontlegs = new ModelRenderer(this);
		frontlegs.setRotationPoint(-0.5F, 3.0F, 5.6751F);
		Quiquincho.addChild(frontlegs);
		setRotationAngle(frontlegs, 1.1781F, 0.0F, 0.0F);
		frontlegs.setTextureOffset(21, 6).addBox(-2.5F, -0.825F, -1.65F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		frontlegs.setTextureOffset(22, 11).addBox(1.5F, -0.825F, -1.65F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(-0.5F, 0.625F, 4.4251F);
		Quiquincho.addChild(head);
		setRotationAngle(head, 0.5236F, 0.0F, 0.0F);
		head.setTextureOffset(6, 24).addBox(-0.5F, -0.625F, -3.75F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(9, 4).addBox(-1.0F, -0.875F, -2.25F, 2.0F, 2.0F, 3.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(-0.5F, 2.25F, 8.5F);
		Quiquincho.addChild(tail);
		setRotationAngle(tail, -0.2182F, 0.0F, 0.0F);


		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.5F, 0.0F, 3.6751F);
		tail.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(0, 19).addBox(-1.0F, -0.4914F, 0.8695F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.5F, 0.0F, 3.6751F);
		tail.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(13, 9).addBox(-1.5F, -0.8191F, -2.5736F, 2.0F, 1.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}



	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Quiquincho.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

}