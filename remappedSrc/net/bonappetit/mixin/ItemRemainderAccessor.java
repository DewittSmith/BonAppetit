package net.bonappetit.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.item.Item;

@Mixin(Item.class)
public interface ItemRemainderAccessor {
    @Accessor("recipeRemainder")
	public void setRecipeRemainder(Item remainder);
}