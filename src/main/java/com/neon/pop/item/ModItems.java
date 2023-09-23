package com.neon.pop.item;

import com.neon.pop.PrinceOfPersia;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PrinceOfPersia.MOD_ID);


    public static void register(IEventBus eventBus){

        ITEMS.register(eventBus);
    }
}
