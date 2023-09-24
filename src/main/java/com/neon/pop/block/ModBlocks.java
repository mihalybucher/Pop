package com.neon.pop.block;

import com.neon.pop.PrinceOfPersia;
import com.neon.pop.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PrinceOfPersia.MOD_ID);

    //blue stone bricks
    public static final RegistryObject<Block> BLUE_STONE_BRICKS =
            registerBlock("blue_stone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_BLUE_STONE_BRICKS =
            registerBlock("polished_blue_stone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_BLUE_STONE_BRICKS =
            registerBlock("mossy_blue_stone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_BLUE_STONE_BRICKS =
            registerBlock("cracked_blue_stone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()));

    //green stone bricks
    public static final RegistryObject<Block> GREEN_STONE_BRICKS =
            registerBlock("green_stone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_GREEN_STONE_BRICKS =
            registerBlock("polished_green_stone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()));

    //sandstone bricks
    public static final RegistryObject<Block> SANDSTONE_BRICKS =
            registerBlock("sandstone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_SANDSTONE_BRICKS =
            registerBlock("polished_sandstone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()));




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){

        RegistryObject toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){

        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus){

        BLOCKS.register(eventBus);
    }
}
