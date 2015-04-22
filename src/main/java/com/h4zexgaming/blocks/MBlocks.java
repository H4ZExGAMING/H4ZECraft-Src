package com.h4zexgaming.blocks;


import com.h4zexgaming.creativetabs.MCreativeTabs;
import com.h4zexgaming.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import cpw.mods.fml.common.registry.GameRegistry;

public class MBlocks {

	public static void mainRegistery(){
		initializeBlock();
		registerBlock();
	}
	
	public static Block hBlock;
	public static Block hOre;
	public static Block dOre;
	public static Block dBlock;
	public static Block bOre;
	public static Block bBlock;
	public static Block cBlock;
	public static Block cOre;
	public static Block eOre;
	public static Block eBlock;
	public static Block jOre;
	public static Block jBlock;
	public static Block xOre;
	public static Block xBlock;
	
	public static void initializeBlock(){
		//Blocks//
		bBlock = new bBlock(Material.ground).setBlockName("bBlock").setCreativeTab(MCreativeTabs.tabH4ZECraft).setBlockTextureName(RefStrings.MODID + ":Beichner_block").setHardness(4).setResistance(30);
		hBlock = new hBlock(Material.ground).setBlockName("hBlock").setCreativeTab(MCreativeTabs.tabH4ZECraft).setBlockTextureName(RefStrings.MODID + ":H4ZE_block").setHardness(6).setResistance(40);
		dBlock = new hBlock(Material.ground).setBlockName("dBlock").setCreativeTab(MCreativeTabs.tabH4ZECraft).setBlockTextureName(RefStrings.MODID + ":Derp_block").setHardness(5).setResistance(35);
		cBlock = new cBlock(Material.ground).setBlockName("cBlock").setCreativeTab(MCreativeTabs.tabH4ZECraft).setBlockTextureName(RefStrings.MODID + ":Crackerish_block").setHardness(4).setResistance(25);
		eBlock = new eBlock(Material.ground).setBlockName("eBlock").setCreativeTab(MCreativeTabs.tabH4ZECraft).setBlockTextureName(RefStrings.MODID + ":Ender_matter_block").setHardness(3).setResistance(20);
		jBlock = new jBlock(Material.ground).setBlockName("jBlock").setCreativeTab(MCreativeTabs.tabH4ZECraft).setBlockTextureName(RefStrings.MODID + ":Jack_block").setHardness(3).setResistance(17);
		xBlock = new xBlock(Material.ground).setBlockName("xBlock").setCreativeTab(MCreativeTabs.tabH4ZECraft).setBlockTextureName(RefStrings.MODID + ":Xaencus_block").setHardness(3).setResistance(17);
		
		//Ores//
		hOre = new hOre(Material.ground).setBlockName("hOre").setCreativeTab(MCreativeTabs.tabH4ZECraft).setBlockTextureName(RefStrings.MODID + ":H4ZE_ore").setHardness(5).setResistance(20);
		dOre = new dOre(Material.ground).setBlockName("dOre").setCreativeTab(MCreativeTabs.tabH4ZECraft).setBlockTextureName(RefStrings.MODID + ":Derp_ore").setHardness(4).setResistance(18);
		bOre = new bOre(Material.ground).setBlockName("bOre").setCreativeTab(MCreativeTabs.tabH4ZECraft).setBlockTextureName(RefStrings.MODID + ":Beichner_ore").setHardness(4).setResistance(17);
		cOre = new cOre(Material.ground).setBlockName("cOre").setCreativeTab(MCreativeTabs.tabH4ZECraft).setBlockTextureName(RefStrings.MODID + ":Crackerish_ore").setHardness(3).setResistance(16);
		eOre = new eOre(Material.ground).setBlockName("eOre").setCreativeTab(MCreativeTabs.tabH4ZECraft).setBlockTextureName(RefStrings.MODID + ":Ender_matter_ore").setHardness(3).setResistance(14);
		jOre = new jOre(Material.ground).setBlockName("jOre").setCreativeTab(MCreativeTabs.tabH4ZECraft).setBlockTextureName(RefStrings.MODID + ":Jack_ore").setHardness(2).setResistance(14);
		xOre = new xOre(Material.ground).setBlockName("xOre").setCreativeTab(MCreativeTabs.tabH4ZECraft).setBlockTextureName(RefStrings.MODID + ":Xaencus_ore").setHardness(2).setResistance(14);
		
	}
	
	public static void registerBlock(){
		GameRegistry.registerBlock(hBlock, hBlock.getUnlocalizedName());
		GameRegistry.registerBlock(hOre, hOre.getUnlocalizedName());
		GameRegistry.registerBlock(dOre, dOre.getUnlocalizedName());
		GameRegistry.registerBlock(dBlock, dBlock.getUnlocalizedName());
		GameRegistry.registerBlock(bOre, bOre.getUnlocalizedName());
		GameRegistry.registerBlock(bBlock, bBlock.getUnlocalizedName());
		GameRegistry.registerBlock(cOre, cOre.getUnlocalizedName());
		GameRegistry.registerBlock(cBlock, cBlock.getUnlocalizedName());
		GameRegistry.registerBlock(eOre, eOre.getUnlocalizedName());
		GameRegistry.registerBlock(eBlock, eBlock.getUnlocalizedName());
		GameRegistry.registerBlock(jOre, jOre.getUnlocalizedName());
		GameRegistry.registerBlock(jBlock, jBlock.getUnlocalizedName());
		GameRegistry.registerBlock(xOre, xOre.getUnlocalizedName());
		GameRegistry.registerBlock(xBlock, xBlock.getUnlocalizedName());
	}
}
