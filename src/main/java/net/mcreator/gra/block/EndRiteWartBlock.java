
package net.mcreator.gra.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.gra.GraModElements;

import java.util.List;
import java.util.Collections;

@GraModElements.ModElement.Tag
public class EndRiteWartBlock extends GraModElements.ModElement {
	@ObjectHolder("gra:end_rite_wart")
	public static final Block block = null;
	public EndRiteWartBlock(GraModElements instance) {
		super(instance, 94);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.NETHER_WOOD).sound(SoundType.WART).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0)
					.harvestLevel(1).harvestTool(ToolType.HOE).setRequiresTool());
			setRegistryName("end_rite_wart");
		}

		@Override
		public ItemStack getPickBlock(BlockState state, RayTraceResult target, IBlockReader world, BlockPos pos, PlayerEntity player) {
			return new ItemStack(EndRiteWartBlock.block, (int) (1));
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(EndRiteWartBlock.block, (int) (1)));
		}
	}
}
