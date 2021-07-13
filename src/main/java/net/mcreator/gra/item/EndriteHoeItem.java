
package net.mcreator.gra.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.gra.GraModElements;

@GraModElements.ModElement.Tag
public class EndriteHoeItem extends GraModElements.ModElement {
	@ObjectHolder("gra:endrite_hoe")
	public static final Item block = null;
	public EndriteHoeItem(GraModElements instance) {
		super(instance, 68);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 2515;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(EndriteIngotItem.block, (int) (1)));
			}
		}, 0, 1f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("endrite_hoe"));
	}
}
