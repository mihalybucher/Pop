package com.neon.pop.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PillarBlock extends Block {



    public PillarBlock(Properties properties) {
        super(properties);
    }

    private static final VoxelShape SHAPE = Block.box(4,0,4, 12,16,12);

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context){

        return SHAPE;
    }


}
