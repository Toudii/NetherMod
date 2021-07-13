
package net.mcreator.gra.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.gra.GraModElements;

@GraModElements.ModElement.Tag
public class WastedAxeItem extends GraModElements.ModElement {
	@ObjectHolder("gra:wasted_axe")
	public static final Item block = null;
	public WastedAxeItem(GraModElements instance) {
		super(instance, 52);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2515;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 9f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(WastedIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("wasted_axe"));
	}
}
