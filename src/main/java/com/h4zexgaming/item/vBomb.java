package com.h4zexgaming.item;

import com.h4zexgaming.entity.EntityVoidBomb;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class vBomb extends Item{
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player){
		if(!player.capabilities.isCreativeMode){
			--itemstack.stackSize;
		}
		world.playSoundAtEntity(player, "random.fire", 0.7f, 0.8f);
		
		if(world.isRemote){
			world.spawnEntityInWorld(new EntityVoidBomb(world,player));
		}
		
		return itemstack;
	}

}
