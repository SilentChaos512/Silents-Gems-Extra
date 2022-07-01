package net.silentchaos512.extragems.setup;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.silentchaos512.extragems.ExtraGemsMod;

public class ExtraBlocks {
    static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtraGemsMod.MOD_ID);

    static {
        ExtraGems.registerBlocks();
    }
}
