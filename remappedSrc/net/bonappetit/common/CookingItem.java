package net.bonappetit.common;

import net.bonappetit.mixin.ItemRemainderAccessor;

public class CookingItem extends ModItem {
	public CookingItem(Settings settings) {
        super(settings.maxCount(1));
        ((ItemRemainderAccessor)this).setRecipeRemainder(this);
	}
}
