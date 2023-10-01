package com.neon.pop;

import com.mojang.logging.LogUtils;
import com.neon.pop.block.ModBlocks;
import com.neon.pop.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(PrinceOfPersia.MOD_ID)
public class PrinceOfPersia
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "pop";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public PrinceOfPersia()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {

        if(event.getTab() == CreativeModeTabs.BUILDING_BLOCKS){

            event.accept(ModBlocks.BLUE_STONE_BRICKS);
            event.accept(ModBlocks.POLISHED_BLUE_STONE_BRICKS);
            event.accept(ModBlocks.MOSSY_BLUE_STONE_BRICKS);
            event.accept(ModBlocks.CRACKED_BLUE_STONE_BRICKS);

            event.accept(ModBlocks.GREEN_STONE_BRICKS);
            event.accept(ModBlocks.POLISHED_GREEN_STONE_BRICKS);

            event.accept(ModBlocks.SANDSTONE_BRICKS);
            event.accept(ModBlocks.POLISHED_SANDSTONE_BRICKS);

            event.accept(ModBlocks.BLUE_STONE_BRICK_PILLAR);
            event.accept(ModBlocks.GREEN_STONE_BRICK_PILLAR);
            event.accept(ModBlocks.SANDSTONE_BRICK_PILLAR);

            event.accept(ModBlocks.BLUE_STONE_BRICK_PILLAR_TOP);
            event.accept(ModBlocks.GREEN_STONE_BRICK_PILLAR_TOP);
            event.accept(ModBlocks.SANDSTONE_BRICK_PILLAR_TOP);
        }


        if(event.getTab() == ModCreativeModeTabs.POP_TAB){

            event.accept(ModBlocks.BLUE_STONE_BRICKS);
            event.accept(ModBlocks.POLISHED_BLUE_STONE_BRICKS);
            event.accept(ModBlocks.MOSSY_BLUE_STONE_BRICKS);
            event.accept(ModBlocks.CRACKED_BLUE_STONE_BRICKS);

            event.accept(ModBlocks.GREEN_STONE_BRICKS);
            event.accept(ModBlocks.POLISHED_GREEN_STONE_BRICKS);

            event.accept(ModBlocks.SANDSTONE_BRICKS);
            event.accept(ModBlocks.POLISHED_SANDSTONE_BRICKS);

            event.accept(ModBlocks.BLUE_STONE_BRICK_PILLAR);
            event.accept(ModBlocks.GREEN_STONE_BRICK_PILLAR);
            event.accept(ModBlocks.SANDSTONE_BRICK_PILLAR);

            event.accept(ModBlocks.BLUE_STONE_BRICK_PILLAR_TOP);
            event.accept(ModBlocks.GREEN_STONE_BRICK_PILLAR_TOP);
            event.accept(ModBlocks.SANDSTONE_BRICK_PILLAR_TOP);
        }
    }



    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
