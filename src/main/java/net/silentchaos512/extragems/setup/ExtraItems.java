package net.silentchaos512.extragems.setup;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.silentchaos512.extragems.ExtraGemsMod;

public class ExtraItems {
    static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtraGemsMod.MOD_ID);

    static {
        ExtraGems.registerItems();
    }
}
