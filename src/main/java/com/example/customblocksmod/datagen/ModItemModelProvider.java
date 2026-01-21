package com.example.customblocksmod.datagen;

import com.example.customblocksmod.CustomBlocksMod;
import com.example.customblocksmod.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, CustomBlocksMod.MODID, exFileHelper);
    }

    @Override
    protected void registerModels() {
        ModItems.ITEMS.getEntries().forEach(item -> {
            String name = item.getId().getPath();
            withExistingParent(name, modLoc("block/" + name));
        });
    }
}
