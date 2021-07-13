
package net.mcreator.gra.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.gra.GraModElements;

@GraModElements.ModElement.Tag
public class EndriteSwordItem extends GraModElements.ModElement {
	@ObjectHolder("gra:endrite_sword")
	public static final Item block = null;
	public EndriteSwordItem(GraModElements instance) {
		super(instance, 67);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2515;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 7f;
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
		}, 3, -2.3f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("endrite_sword"));
	}
}
