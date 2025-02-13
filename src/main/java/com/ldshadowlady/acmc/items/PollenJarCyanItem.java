package com.ldshadowlady.acmc.items;

import com.ldshadowlady.acmc.blocks.ACMCBlocks;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

import static net.minecraft.block.Blocks.*;

public class PollenJarCyanItem extends Item {
	public PollenJarCyanItem(Properties properties) {
		super(properties);
	}
	
	public ActionResultType onItemUse(ItemUseContext context) {
		World world = context.getWorld();
		BlockPos blockpos = context.getPos();
		BlockState blockstate = world.getBlockState(blockpos);
		LivingEntity player = context.getPlayer();
		ItemStack itemstack = context.getItem();
		
		//if it is a viable flower
		if (blockstate.getBlock().equals(ROSE_BUSH) || blockstate.getBlock().equals(WITHER_ROSE) || blockstate.getBlock().equals(DANDELION) || blockstate.getBlock().equals(POPPY) || blockstate.getBlock().equals(BLUE_ORCHID) || blockstate.getBlock().equals(ALLIUM) || blockstate.getBlock()
		                                                                                                                                                                                                                                                                             .equals(AZURE_BLUET) || blockstate.getBlock()
		                                                                                                                                                                                                                                                                                                               .equals(RED_TULIP) || blockstate.getBlock()
		                                                                                                                                                                                                                                                                                                                                               .equals(ORANGE_TULIP) || blockstate.getBlock()
		                                                                                                                                                                                                                                                                                                                                                                                  .equals(WHITE_TULIP) || blockstate.getBlock()
		                                                                                                                                                                                                                                                                                                                                                                                                                    .equals(PINK_TULIP) || blockstate.getBlock()
		                                                                                                                                                                                                                                                                                                                                                                                                                                                     .equals(OXEYE_DAISY) || blockstate.getBlock()
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       .equals(CORNFLOWER) || blockstate.getBlock()
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        .equals(LILY_OF_THE_VALLEY) || blockstate.getBlock()
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 .equals(SUNFLOWER) || blockstate.getBlock()
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 .equals(LILAC) || blockstate.getBlock()
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             .equals(PEONY)) {
			PlayerEntity playerentity = context.getPlayer();
			world.playSound(playerentity, blockpos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
			if (!world.isRemote) {
				//This replaces the jar item with full jar
				if (player == null || !((PlayerEntity) player).abilities.isCreativeMode) {
					itemstack.shrink(1);
				}
				if (player == null || !((PlayerEntity) player).abilities.isCreativeMode) {
					if (itemstack.isEmpty()) {
						((PlayerEntity) player).inventory.addItemStackToInventory(new ItemStack(ACMCItems.EMPTY_POLLEN_JAR.get()));
					}
				}
				
				if (blockstate.getBlock().equals(ROSE_BUSH)) {net.minecraft.entity.item.ItemEntity ent = player.entityDropItem(ACMCBlocks.CROP_CYAN_ROSE.get());} else if (blockstate.getBlock().equals(DANDELION)) {
					net.minecraft.entity.item.ItemEntity ent = player.entityDropItem(ACMCBlocks.CROP_CYAN_DANDELION.get());
				} else if (blockstate.getBlock().equals(POPPY)) {net.minecraft.entity.item.ItemEntity ent = player.entityDropItem(ACMCBlocks.CROP_CYAN_POPPY.get());} else if (blockstate.getBlock().equals(BLUE_ORCHID)) {
					net.minecraft.entity.item.ItemEntity ent = player.entityDropItem(ACMCBlocks.CROP_CYAN_ORCHID.get());
				} else if (blockstate.getBlock().equals(ALLIUM)) {net.minecraft.entity.item.ItemEntity ent = player.entityDropItem(ACMCBlocks.CROP_CYAN_ALLIUM.get());} else if (blockstate.getBlock().equals(AZURE_BLUET)) {
					net.minecraft.entity.item.ItemEntity ent = player.entityDropItem(ACMCBlocks.CROP_CYAN_AZURE_BLUET.get());
				} else if (blockstate.getBlock().equals(RED_TULIP)) {net.minecraft.entity.item.ItemEntity ent = player.entityDropItem(ACMCBlocks.CROP_CYAN_TULIP.get());} else if (blockstate.getBlock().equals(ORANGE_TULIP)) {
					net.minecraft.entity.item.ItemEntity ent = player.entityDropItem(ACMCBlocks.CROP_CYAN_TULIP.get());
				} else if (blockstate.getBlock().equals(WHITE_TULIP)) {net.minecraft.entity.item.ItemEntity ent = player.entityDropItem(ACMCBlocks.CROP_CYAN_TULIP.get());} else if (blockstate.getBlock().equals(PINK_TULIP)) {
					net.minecraft.entity.item.ItemEntity ent = player.entityDropItem(ACMCBlocks.CROP_CYAN_TULIP.get());
				} else if (blockstate.getBlock().equals(OXEYE_DAISY)) {net.minecraft.entity.item.ItemEntity ent = player.entityDropItem(ACMCBlocks.CROP_CYAN_DAISY.get());} else if (blockstate.getBlock().equals(CORNFLOWER)) {
					net.minecraft.entity.item.ItemEntity ent = player.entityDropItem(ACMCBlocks.CROP_CYAN_CORNFLOWER.get());
				} else if (blockstate.getBlock().equals(LILY_OF_THE_VALLEY)) {net.minecraft.entity.item.ItemEntity ent = player.entityDropItem(ACMCBlocks.CROP_CYAN_LILY.get());} else if (blockstate.getBlock().equals(WITHER_ROSE)) {
					net.minecraft.entity.item.ItemEntity ent = player.entityDropItem(ACMCBlocks.CROP_CYAN_WITHER_ROSE.get());
				} else if (blockstate.getBlock().equals(SUNFLOWER)) {net.minecraft.entity.item.ItemEntity ent = player.entityDropItem(ACMCBlocks.CROP_CYAN_SUNFLOWER.get());} else if (blockstate.getBlock().equals(LILAC)) {
					net.minecraft.entity.item.ItemEntity ent = player.entityDropItem(ACMCBlocks.CROP_CYAN_LILAC.get());
				} else if (blockstate.getBlock().equals(PEONY)) {net.minecraft.entity.item.ItemEntity ent = player.entityDropItem(ACMCBlocks.CROP_CYAN_PEONY.get());} else if (blockstate.getBlock().equals(ALLIUM)) {
					net.minecraft.entity.item.ItemEntity ent = player.entityDropItem(ACMCBlocks.CROP_CYAN_ALLIUM.get());
				}
				
				// ADD PARTICLE EFFECT (DOESNT WORK
				world.addParticle(ParticleTypes.EXPLOSION, blockpos.getX(), blockpos.getY(), blockpos.getZ(), 0.0D, 0.0D, 0.0D);
				
				if (player instanceof ServerPlayerEntity) {
					CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayerEntity) player, itemstack);
				}
				
				//it ends here
				if (playerentity != null) {
					context.getItem().damageItem(1, playerentity, (p_220040_1_) -> {
						p_220040_1_.sendBreakAnimation(context.getHand());
					});
				}
				return ActionResultType.SUCCESS;
			} else {
				return ActionResultType.PASS;
			}
		}
		return ActionResultType.SUCCESS;
	}
	
	@Override
	public void addInformation(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
		tooltip.add(new TranslationTextComponent("item.full_pollen_jar.desc"));
	}
}