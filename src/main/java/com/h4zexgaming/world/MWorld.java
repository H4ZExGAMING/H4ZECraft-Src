package com.h4zexgaming.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class MWorld {
	public static void mainRegistry(){
		initialiseWorldGen();
	}
	public static void initialiseWorldGen(){
		registerWorldGen(new H4ZEOre(), 1);
	}
	
	public static void registerWorldGen(IWorldGenerator worldGenClass, int wightedProbabilty){
		GameRegistry.registerWorldGenerator(worldGenClass, wightedProbabilty);
	}
}
