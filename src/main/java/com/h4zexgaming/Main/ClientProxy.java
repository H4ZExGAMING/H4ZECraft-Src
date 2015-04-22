package com.h4zexgaming.Main;

import net.minecraft.client.renderer.entity.RenderSnowball;

import com.h4zexgaming.entity.EntityVoidBomb;
import com.h4zexgaming.item.MItems;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{
	public void registerRenderInfo(){
		RenderingRegistry.registerEntityRenderingHandler(EntityVoidBomb.class, new RenderSnowball(MItems.vBomb));
	}
	public int addArmor(String armor){
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
}
