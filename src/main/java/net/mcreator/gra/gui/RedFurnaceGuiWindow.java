
package net.mcreator.gra.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.gra.procedures.PBD9Procedure;
import net.mcreator.gra.procedures.PBD8Procedure;
import net.mcreator.gra.procedures.PBD7Procedure;
import net.mcreator.gra.procedures.PBD6Procedure;
import net.mcreator.gra.procedures.PBD5Procedure;
import net.mcreator.gra.procedures.PBD4Procedure;
import net.mcreator.gra.procedures.PBD3Procedure;
import net.mcreator.gra.procedures.PBD2Procedure;
import net.mcreator.gra.procedures.PBD20Procedure;
import net.mcreator.gra.procedures.PBD1Procedure;
import net.mcreator.gra.procedures.PBD19Procedure;
import net.mcreator.gra.procedures.PBD18Procedure;
import net.mcreator.gra.procedures.PBD17Procedure;
import net.mcreator.gra.procedures.PBD16Procedure;
import net.mcreator.gra.procedures.PBD15Procedure;
import net.mcreator.gra.procedures.PBD14Procedure;
import net.mcreator.gra.procedures.PBD13Procedure;
import net.mcreator.gra.procedures.PBD12Procedure;
import net.mcreator.gra.procedures.PBD11Procedure;
import net.mcreator.gra.procedures.PBD10Procedure;
import net.mcreator.gra.procedures.PBD0Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

import com.google.common.collect.ImmutableMap;

@OnlyIn(Dist.CLIENT)
public class RedFurnaceGuiWindow extends ContainerScreen<RedFurnaceGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	public RedFurnaceGuiWindow(RedFurnaceGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}
	private static final ResourceLocation texture = new ResourceLocation("gra:textures/red_furnace.png");
	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		if (PBD0Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("gra:textures/arrowanimatioon1.png"));
			this.blit(ms, this.guiLeft + 78, this.guiTop + 25, 0, 0, 20, 14, 20, 14);
		}
		if (PBD1Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("gra:textures/arrowanimation1.png"));
			this.blit(ms, this.guiLeft + 78, this.guiTop + 25, 0, 0, 20, 14, 20, 14);
		}
		if (PBD2Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("gra:textures/arrowanimation2.png"));
			this.blit(ms, this.guiLeft + 78, this.guiTop + 25, 0, 0, 20, 14, 20, 14);
		}
		if (PBD3Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("gra:textures/arrowanimation3.png"));
			this.blit(ms, this.guiLeft + 78, this.guiTop + 25, 0, 0, 20, 14, 20, 14);
		}
		if (PBD4Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("gra:textures/arrowanimation4.png"));
			this.blit(ms, this.guiLeft + 78, this.guiTop + 25, 0, 0, 20, 14, 20, 14);
		}
		if (PBD5Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("gra:textures/arrowanimation5.png"));
			this.blit(ms, this.guiLeft + 78, this.guiTop + 25, 0, 0, 20, 14, 20, 14);
		}
		if (PBD6Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("gra:textures/arrowanimation6.png"));
			this.blit(ms, this.guiLeft + 78, this.guiTop + 25, 0, 0, 20, 14, 20, 14);
		}
		if (PBD7Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("gra:textures/arrowanimation7.png"));
			this.blit(ms, this.guiLeft + 78, this.guiTop + 25, 0, 0, 20, 14, 20, 14);
		}
		if (PBD8Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("gra:textures/arrowanimation8.png"));
			this.blit(ms, this.guiLeft + 78, this.guiTop + 25, 0, 0, 20, 14, 20, 14);
		}
		if (PBD9Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("gra:textures/arrowanimation9.png"));
			this.blit(ms, this.guiLeft + 78, this.guiTop + 25, 0, 0, 20, 14, 20, 14);
		}
		if (PBD10Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("gra:textures/arrowanimation10.png"));
			this.blit(ms, this.guiLeft + 78, this.guiTop + 25, 0, 0, 20, 14, 20, 14);
		}
		if (PBD11Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("gra:textures/arrowanimation11.png"));
			this.blit(ms, this.guiLeft + 78, this.guiTop + 25, 0, 0, 20, 14, 20, 14);
		}
		if (PBD12Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("gra:textures/arrowanimation12.png"));
			this.blit(ms, this.guiLeft + 78, this.guiTop + 25, 0, 0, 20, 14, 20, 14);
		}
		if (PBD13Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("gra:textures/arrowanimation13.png"));
			this.blit(ms, this.guiLeft + 78, this.guiTop + 25, 0, 0, 20, 14, 20, 14);
		}
		if (PBD14Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("gra:textures/arrowanimation14.png"));
			this.blit(ms, this.guiLeft + 78, this.guiTop + 25, 0, 0, 20, 14, 20, 14);
		}
		if (PBD15Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("gra:textures/arrowanimation15.png"));
			this.blit(ms, this.guiLeft + 78, this.guiTop + 25, 0, 0, 20, 14, 20, 14);
		}
		if (PBD16Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("gra:textures/arrowanimation16.png"));
			this.blit(ms, this.guiLeft + 78, this.guiTop + 25, 0, 0, 20, 14, 20, 14);
		}
		if (PBD17Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("gra:textures/arrowanimation17.png"));
			this.blit(ms, this.guiLeft + 78, this.guiTop + 25, 0, 0, 20, 14, 20, 14);
		}
		if (PBD18Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("gra:textures/arrowanimation18.png"));
			this.blit(ms, this.guiLeft + 78, this.guiTop + 25, 0, 0, 20, 14, 20, 14);
		}
		if (PBD19Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("gra:textures/arrowanimation19.png"));
			this.blit(ms, this.guiLeft + 78, this.guiTop + 25, 0, 0, 20, 14, 20, 14);
		}
		if (PBD20Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("gra:textures/arrowanimation20.png"));
			this.blit(ms, this.guiLeft + 78, this.guiTop + 25, 0, 0, 20, 14, 20, 14);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Fire Furnace", 60, 4, -16777216);
		this.font.drawString(ms, "Inventory", 6, 70, -16777216);
		this.font.drawString(ms, "" + ((int) new Object() {
			public double getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return 0;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "burnTime")) + "", 79, 64, -12829636);
		this.font.drawString(ms, "" + ((int) new Object() {
			public double getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return 0;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "furnaceSpeed")) + "", 128, 25, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
	}
}
