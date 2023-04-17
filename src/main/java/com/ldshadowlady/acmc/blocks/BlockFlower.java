package com.ldshadowlady.acmc.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BlockFlower extends BushBlock {
	private final VoxelShape Shape;
	
	public BlockFlower(Properties properties, VoxelShape ShapeIn) {
		super(properties);
		this.Shape = ShapeIn;
	}
	
	@Override
	public OffsetType getOffsetType() {
		return OffsetType.XZ;
	}
	
	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		Vec3 offset = state.getOffset(world, pos);
		return this.Shape.move(offset.x, offset.y, offset.z);
	}
}