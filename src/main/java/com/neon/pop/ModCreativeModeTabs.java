package com.neon.pop;

import com.neon.pop.block.ModBlocks;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PrinceOfPersia.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {

    public static CreativeModeTab POP_TAB;

    @SubscribeEvent
    public static void registerCreativeModTabs(CreativeModeTabEvent.Register event){

        POP_TAB = event.registerCreativeModeTab(new ResourceLocation(PrinceOfPersia.MOD_ID, "pop_tab"),
                builder -> builder.icon(() -> new ItemStack(ModBlocks.BLUE_STONE_BRICKS.get())).
                        title(Component.translatable("creativemodetab.pop_tab")));
    }

}
