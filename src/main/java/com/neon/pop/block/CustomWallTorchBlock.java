package com.neon.pop.block;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallTorchBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Map;

public class CustomWallTorchBlock extends WallTorchBlock {

    private static final Map<Direction, VoxelShape> SHAPE = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(6.5D, 2.5D, 9.5D, 9.5D, 14.0D, 16.0D),
            Direction.SOUTH, Block.box(6.5D, 2.5D, 0.5D, 9.5D, 14.0D, 7.0D),
            Direction.WEST, Block.box(9.5D, 2.5D, 6.5D, 16.0D, 14.0D, 9.5D),
            Direction.EAST, Block.box(0.5D, 2.5D, 6.5D, 7.0D, 14.0D, 9.5D)));

    public CustomWallTorchBlock(Properties properties) {
        super(properties, null);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        return this.getShape(state);
    }

    public static VoxelShape getShape(BlockState state) {
        return SHAPE.get(state.getValue(FACING));
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource source) {

    }
}
