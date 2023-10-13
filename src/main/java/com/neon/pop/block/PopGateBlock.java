package com.neon.pop.block;

import com.neon.pop.block.entity.PopGateBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import org.jetbrains.annotations.Nullable;

public class PopGateBlock extends BaseEntityBlock {

    public static final BooleanProperty TRIGGERED = BlockStateProperties.TRIGGERED;




    protected PopGateBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(TRIGGERED, Boolean.valueOf(false)));




    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new PopGateBlockEntity(pos, state);
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }


    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {

        if(!level.isClientSide()) {
        boolean isPowered = level.hasNeighborSignal(pos);
        boolean wasPowered = state.getValue(TRIGGERED);



        if (isPowered && !wasPowered) {



                level.setBlock(pos, state.setValue(TRIGGERED, Boolean.valueOf(true)), 3);
            }
        }

    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {


        return this.defaultBlockState()
                .setValue(TRIGGERED, false);
    }

    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState state, LivingEntity placer, net.minecraft.world.item.ItemStack stack) {
        // Set TRIGGERED to false when the block is placed

        level.setBlock(pos, state.setValue(TRIGGERED, false), 3);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {

        builder.add(TRIGGERED);
    }
}
