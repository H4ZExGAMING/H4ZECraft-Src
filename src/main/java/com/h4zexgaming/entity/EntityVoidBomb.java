package com.h4zexgaming.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityVoidBomb extends EntityThrowable{

	public EntityVoidBomb(World p_i1776_1_) {
		super(p_i1776_1_);
		
	}
	public EntityVoidBomb(World world, EntityLivingBase entity){
		super(world, entity);
	}
	@Override
	protected void onImpact(MovingObjectPosition p_70184_1_) {
		for(int i = 0; i < 10; i++){
			this.worldObj.spawnParticle("largesmoke", this.posX, this.posY, this.posZ, 0f, 0f, 0f);
		}
		
		if(this.worldObj.isRemote){
			this.setDead();
			if(this.worldObj.isRemote){
				this.worldObj.createExplosion((Entity) null, this.posX, this.posY, this.posZ, 4.0f, true);
			}
				
		}
		
	}

}
