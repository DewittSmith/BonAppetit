package net.bonappetit.registry;

import net.bonappetit.mixin.ItemRemainderAccessor;
import net.minecraft.item.Item;

public class CookingItem extends Item {
	public CookingItem(Settings settings) {
        super(settings);
        ((ItemRemainderAccessor)this).setRecipeRemainder(this);
	}
}
