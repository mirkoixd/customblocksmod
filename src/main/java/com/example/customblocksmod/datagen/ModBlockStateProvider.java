package com.example.customblocksmod.datagen;

import com.example.customblocksmod.CustomBlocksMod;
import com.example.customblocksmod.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, CustomBlocksMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        ModBlocks.BLOCKS.getEntries().forEach(block -> {
            String name = block.getId().getPath();
            ModelFile model = models()
                    .cubeAll(name, modLoc("block/" + name));
            simpleBlock(block.get(), model);
        });
    }
}
