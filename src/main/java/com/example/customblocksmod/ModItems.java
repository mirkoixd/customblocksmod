package com.example.customblocksmod;

import net.minecraft.item.*;
import net.minecraftforge.registries.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CustomBlocksMod.MODID);

    static {
        for (int i = 1; i <= 500; i++) {
            final int id = i;
            ITEMS.register("custom_block_" + id,
                    () -> new BlockItem(
                            ModBlocks.BLOCKS.getEntries()
                                    .stream()
                                    .filter(e -> e.getId().getPath().equals("custom_block_" + id))
                                    .findFirst()
                                    .orElseThrow(IllegalStateException::new)
                                    .get(),
                            new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
        }
    }
}
