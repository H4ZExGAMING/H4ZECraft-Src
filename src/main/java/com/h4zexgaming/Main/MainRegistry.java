package com.h4zexgaming.Main;


import com.h4zexgaming.blocks.MBlocks;
import com.h4zexgaming.creativetabs.MCreativeTabs;
import com.h4zexgaming.entity.MEntity;
import com.h4zexgaming.item.MItems;
import com.h4zexgaming.lib.RefStrings;
import com.h4zexgaming.world.MWorld;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION)
public class MainRegistry {
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	@Instance
	public static MainRegistry modInstance;
	
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent){
		MCreativeTabs.initialiseTabs();
		MBlocks.mainRegistery();
		MEntity.mainRegistry();
		MItems.mainRegistery();
		MWorld.mainRegistry();
		CraftingManager.mainRegistry();
		proxy.registerRenderInfo();
	}
	
	@EventHandler
	public static void load(FMLInitializationEvent event){
		
	}
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent){
		
	}
}
