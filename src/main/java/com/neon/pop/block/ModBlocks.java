package com.neon.pop.block;

import com.neon.pop.PrinceOfPersia;
import com.neon.pop.item.ModItems;
import net.minecraft.client.particle.Particle;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
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

    //walls and pillars
    public static final RegistryObject<Block> BLUE_STONE_BRICK_PILLAR =
            registerBlock("blue_stone_brick_pillar", () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GREEN_STONE_BRICK_PILLAR =
            registerBlock("green_stone_brick_pillar", () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SANDSTONE_BRICK_PILLAR =
            registerBlock("sandstone_brick_pillar", () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()));

    //pillar tops
    public static final RegistryObject<Block> BLUE_STONE_BRICK_PILLAR_TOP =
            registerBlock("blue_stone_brick_pillar_top", () -> new PillarTopBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GREEN_STONE_BRICK_PILLAR_TOP =
            registerBlock("green_stone_brick_pillar_top", () -> new PillarTopBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SANDSTONE_BRICK_PILLAR_TOP =
            registerBlock("sandstone_brick_pillar_top", () -> new PillarTopBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()));

    //torch
    public static final RegistryObject<Block> POP_TORCH =
            BLOCKS.register("pop_torch_block", () -> new CustomTorchBlock(BlockBehaviour.Properties.of(Material.DECORATION)
                    .noCollission().instabreak().lightLevel((p_50755_) -> {
                        return 14;
                    }).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> POP_WALL_TORCH =
            BLOCKS.register("pop_wall_torch_block", () -> new CustomWallTorchBlock(BlockBehaviour.Properties.of(Material.DECORATION)
                    .noCollission().instabreak().lightLevel((p_50886_) -> {
                        return 14;
                    }).sound(SoundType.WOOD).dropsLike(POP_TORCH.get())));


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
