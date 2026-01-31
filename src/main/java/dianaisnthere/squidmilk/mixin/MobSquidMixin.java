package dianaisnthere.squidmilk.mixin;

import dianaisnthere.squidmilk.interfaces.IMobSquid;
import net.minecraft.core.entity.animal.MobSquid;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemBucketEmpty;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(MobSquid.class)
public abstract class MobSquidMixin implements IMobSquid {
	@Override
	public boolean interact(@NotNull Player player) {
		ItemStack itemstack = player.inventory.getCurrentItem();
		if (itemstack != null && itemstack.itemID == Items.BUCKET.id) {
			ItemBucketEmpty.useBucket(player, new ItemStack(Items.BUCKET_MILK));
			return true;
		} else {
			return interact(player);
		}
	}
}
