package com.neon.pop.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class PillarTopBlock extends Block {



    public PillarTopBlock(Properties properties) {
        super(properties);
    }

    private static final VoxelShape SHAPE = Stream.of(Block.box(4,0,4, 12,13,12),
            Block.box(0,13,0, 16,16,16)).
            reduce((v1,v2) -> Shapes.join(v1,v2, BooleanOp.OR)).get();

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context){

        return SHAPE;
    }


}
