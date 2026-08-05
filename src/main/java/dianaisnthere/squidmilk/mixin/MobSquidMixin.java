package dianaisnthere.squidmilk.mixin;

import dianaisnthere.squidmilk.interfaces.IMobSquid;

import net.minecraft.core.entity.animal.MobSquid;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemBucket;
import net.minecraft.core.item.ItemStack;

import org.jetbrains.annotations.NotNull;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(MobSquid.class)
public abstract class MobSquidMixin implements IMobSquid {

	@Unique
	public boolean interact(@NotNull Player player) {
		ItemStack itemstack = player.inventory.getCurrentItem();
		if (itemstack != null && itemstack.getItem() instanceof ItemBucket) {
			ItemBucket.useBucket(itemstack, player, player.world, ItemBucket.STATE_MILK);
			return true;
		} else {
			return interact(player);
		}
	}
}
