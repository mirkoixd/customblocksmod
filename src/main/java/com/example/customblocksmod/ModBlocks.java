package com.example.customblocksmod;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.registries.*;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CustomBlocksMod.MODID);

    static {
        for (int i = 1; i <= 500; i++) {
            final int id = i;
            BLOCKS.register("custom_block_" + id,
                    () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                            .strength(2.0F, 6.0F)
                            .requiresCorrectToolForDrops()));
        }
    }
}
