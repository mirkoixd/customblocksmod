package com.example.customblocksmod;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSounds {

    public static final DeferredRegister<SoundEvent> SOUNDS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CustomBlocksMod.MODID);

    public static void registerSounds() {
        register("boyardland_1");
        register("boyardland_2");
        register("boyardland_3");
        register("boyardland_4");
        register("grechia");
        register("meme_kvn");
        register("meme_mozart");
        register("meme_piska");
        register("meme_slower");
        register("meme_timesup");
        register("meme_univer");
        register("perefouras_cue_1");
        register("perefouras_cue_2");
        register("perefouras_cue_3");
        register("perefouras_cue_4");
        register("perefouras_cue_5");
        register("perefouras_cue_6");
        register("perefouras_cue_7");
        register("perefouras_cue_8");
        register("perefouras_cue_9");
        register("perefouras_cue_10");
        register("perefouras_cue_11");
        register("perefouras_cue_12");
        register("perefouras_cue_13");
        register("perefouras_cue_14");
        register("perefouras_cue_15");
        register("perefouras_cue_16");
        register("perefouras_cue_17");
        register("perefouras_cue_18");
        register("timeout");
        register("timeout2");
        register("willy_bar");
        register("willy_bar_2");
        register("willy_cue_1");
        register("willy_cue_2");
        register("willy_cue_3");
        register("willy_cue_4");
        register("willy_cue_5");
        register("willy_cue_6");
        register("willy_cue_7");
        register("willy_cue_8");
        register("willy_cue_9");
        register("willy_cue_10");
        register("willy_cue_11");
        register("willy_cue_12");
        register("willy_cue_13");
        register("willy_cue_14");
        register("willy_cue_15");
        register("willy_cue_16");
        register("willy_cue_17");
        register("willy_cue_18");
        register("willy_cue_19");
        register("willy_cue_aaaahh");
        register("willy_cue_coffee");
        register("willy_cue_coffee_2");
        register("willy_cue_coffee_3");
        register("willy_cue_cough");
        register("willy_cue_laugh");
        register("willy_cue_laugh_2");
        register("willy_cue_laugh_3");
        register("willy_cue_nonono");
        register("willy_cue_welcome");
        register("willy_cue_welcome_2");
        register("willy_cue_welcome_3.ogg");
    }

    private static void register(String name) {
        SOUNDS.register(name,
                () -> new SoundEvent(new ResourceLocation(CustomBlocksMod.MODID, name)));
    }
}
