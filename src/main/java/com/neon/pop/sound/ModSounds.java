package com.neon.pop.sound;

import com.neon.pop.PrinceOfPersia;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PrinceOfPersia.MOD_ID);

    public static final RegistryObject<SoundEvent> GATE_OPEN = registerSoundEvent("gate_open");



    private static RegistryObject<SoundEvent> registerSoundEvent(String name){

        ResourceLocation id = new ResourceLocation(PrinceOfPersia.MOD_ID,name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus){

        SOUND_EVENTS.register(eventBus);
    }
}
