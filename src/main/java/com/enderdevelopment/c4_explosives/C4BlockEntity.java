package com.enderdevelopment.c4_explosives;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class C4BlockEntity extends BlockEntity {
    public C4BlockEntity(BlockPos pos, BlockState state) {
        super(C4ExplosivesMod.C4_BLOCK_ENTITY, pos, state);
    }

    public void detonate() {
        // Detonation logic
    }
}