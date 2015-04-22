package com.h4zexgaming.world;

import java.util.Random;

import com.h4zexgaming.blocks.MBlocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class H4ZEOre implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case -1:
			generateNether(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 0:
			generateOverworld(random, chunkX * 16, chunkZ * 16, world);
		case 1:
			generateEnd(random, chunkX * 16, chunkZ * 16, world);
		}

	}
	
	private void addOre(Block block, Block blockspawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minVien, int maxVien, int spawnChance){
		for(int i = 0; i < spawnChance; i++){
			int defaultChunkSize = 16;
			
			int xPos = posX + random.nextInt(defaultChunkSize);
			int yPos = minY + random.nextInt(maxY - minY);
			int zPos = posZ + random.nextInt(defaultChunkSize);
			
			new WorldGenMinable(block, (minVien + random.nextInt(maxVien - minVien)), blockspawn).generate(world, random, xPos, yPos, zPos);
		}
	}

	private void generateEnd(Random random, int chunkX, int chunkZ, World world) {
		// TODO Auto-generated method stub
		
	}

	private void generateOverworld(Random random, int chunkX, int chunkZ, World world) {
		addOre(MBlocks.hOre, Blocks.stone, random, world, chunkX, chunkZ, 5, 20, 4, 8, 2);
		addOre(MBlocks.dOre, Blocks.stone, random, world, chunkX, chunkZ, 5, 20, 4, 8, 3);
		addOre(MBlocks.bOre, Blocks.stone, random, world, chunkX, chunkZ, 5, 20, 4, 8, 4);
		addOre(MBlocks.cOre, Blocks.stone, random, world, chunkX, chunkZ, 20, 40, 4, 8, 6);
		addOre(MBlocks.eOre, Blocks.stone, random, world, chunkX, chunkZ, 20, 40, 4, 8, 6);
		addOre(MBlocks.jOre, Blocks.stone, random, world, chunkX, chunkZ, 30, 50, 4, 8, 10);
		addOre(MBlocks.xOre, Blocks.stone, random, world, chunkX, chunkZ, 30, 50, 4, 8, 12);
		
	}

	private void generateNether(Random random, int chunkX, int chunkZ, World world) {
		// TODO Auto-generated method stub
		
	}

}
