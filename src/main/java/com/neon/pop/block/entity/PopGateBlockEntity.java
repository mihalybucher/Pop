package com.neon.pop.block.entity;

import com.neon.pop.block.PopGateBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.RenderUtils;

public class PopGateBlockEntity extends BlockEntity implements GeoBlockEntity {

    private AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);


    public PopGateBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.POP_GATE_BLOCK_ENTITY.get(), pos, state);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {

        controllerRegistrar.add(new AnimationController<>(this, "controller", 0, this::predicate));
    }

    private <T extends GeoAnimatable> PlayState predicate(AnimationState<T> tAnimationState) {

        BooleanProperty TRIGGERED = PopGateBlock.TRIGGERED;

        Level level = this.level;
        BlockPos pos = this.getBlockPos();
        BlockState state = level.getBlockState(pos);

        if(state.hasProperty(TRIGGERED)) {
            if (state.getValue(TRIGGERED)) {
                tAnimationState.getController().setAnimation(RawAnimation.begin().then("open", Animation.LoopType.HOLD_ON_LAST_FRAME));
                return PlayState.CONTINUE;
            } else {
                return PlayState.STOP;
            }

        }
        return PlayState.STOP;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }



    @Override
    public double getTick(Object blockEntity) {
        return RenderUtils.getCurrentTick();
    }

    private boolean isGatePowered(Level level, BlockPos pos) {

        return level.hasNeighborSignal(pos);

    }
}
