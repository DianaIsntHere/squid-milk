package dianaisnthere.squidmilk.interfaces;

import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemBucketEmpty;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import org.jetbrains.annotations.NotNull;

public interface IMobSquid {
	public boolean interact(@NotNull Player player);
}
