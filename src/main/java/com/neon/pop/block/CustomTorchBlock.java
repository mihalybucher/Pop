package com.neon.pop.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CustomTorchBlock extends TorchBlock {

    private static final VoxelShape SHAPE = Block.box(6.5D, 0.0D, 6.5D, 19.5D, 12.0D, 9.5D);

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context){

        return SHAPE;
    }



    public CustomTorchBlock(Properties properties) {
        super(properties, null);
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource source) {

    }
}
