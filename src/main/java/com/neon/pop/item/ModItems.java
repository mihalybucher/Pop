package com.neon.pop.item;

import com.neon.pop.PrinceOfPersia;
import com.neon.pop.block.ModBlocks;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PrinceOfPersia.MOD_ID);

    public static final RegistryObject<Item> POP_TORCH = ITEMS.register("pop_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.POP_TORCH.get(),ModBlocks.POP_WALL_TORCH.get(),
                    new Item.Properties(), Direction.DOWN));

    public static final RegistryObject<Item> POP_GATE_ITEM = ITEMS.register("gate_lvl1",
            () -> new PopGateItem(ModBlocks.POP_GATE_LVL1.get(), new Item.Properties()));


    public static void register(IEventBus eventBus){

        ITEMS.register(eventBus);
    }
}
