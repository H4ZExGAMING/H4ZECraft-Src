package com.h4zexgaming.item;

import com.h4zexgaming.Main.MainRegistry;
import com.h4zexgaming.creativetabs.MCreativeTabs;
import com.h4zexgaming.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class MItems {

	public static void mainRegistery(){
		initializeItem();
		registerItem();
	}
	public static ToolMaterial LoShard = EnumHelper.addToolMaterial("The Legend Of H4ZE", 5, 100000000, 16.0f, 2000000000, 0);
	
	public static ToolMaterial hShard = EnumHelper.addToolMaterial("H4ZE Shard", 5, 10000, 40.0f, 5.0f, 35);	
	public static ToolMaterial hShard2 = EnumHelper.addToolMaterial("H4ZE Shard", 5, 10000, 16.0f, 20.0f, 35);	
	public static ToolMaterial hShard3 = EnumHelper.addToolMaterial("H4ZE Shard", 5, 10000, 16.0f, 4.0f, 35);	
	public static ToolMaterial hShard4 = EnumHelper.addToolMaterial("H4ZE Shard", 5, 10000, 16.0f, 150.0f, 35);	
	public static ToolMaterial hShard5 = EnumHelper.addToolMaterial("H4ZE Shard", 5, 10000, 16.0f, 1.0f, 35);
	public static ArmorMaterial hArmor = EnumHelper.addArmorMaterial("H4ZE Armor", 10000, new int[]{8, 12, 9, 7}, 35);
	
	public static ToolMaterial dShard1 = EnumHelper.addToolMaterial("Derp Shard", 5, 9000, 35.0f, 5.0f, 35);	
	public static ToolMaterial dShard2 = EnumHelper.addToolMaterial("Derp Shard", 5, 9000, 16.0f, 20.0f, 35);	
	public static ToolMaterial dShard3 = EnumHelper.addToolMaterial("Derp Shard", 5, 9000, 16.0f, 4.0f, 35);	
	public static ToolMaterial dShard4 = EnumHelper.addToolMaterial("Derp Shard", 5, 9000, 16.0f, 135.0f, 35);	
	public static ToolMaterial dShard5 = EnumHelper.addToolMaterial("Derp Shard", 5, 1000000, 16.0f, 1.0f, 35);
	public static ArmorMaterial dArmor = EnumHelper.addArmorMaterial("Derp Armor", 9000, new int[]{7, 10, 8, 6}, 35);
	
	public static ToolMaterial bShard1 = EnumHelper.addToolMaterial("Beichner Shard", 5, 7000, 30.0f, 5.0f, 30);	
	public static ToolMaterial bShard2 = EnumHelper.addToolMaterial("Beichner Shard", 5, 7000, 16.0f, 20.0f, 30);	
	public static ToolMaterial bShard3 = EnumHelper.addToolMaterial("Beichner Shard", 5, 7000, 16.0f, 4.0f, 30);	
	public static ToolMaterial bShard4 = EnumHelper.addToolMaterial("Beichner Shard", 5, 7000, 16.0f, 110.0f, 30);	
	public static ToolMaterial bShard5 = EnumHelper.addToolMaterial("Beichner Shard", 5, 7000, 16.0f, 1.0f, 30);
	public static ArmorMaterial bArmor = EnumHelper.addArmorMaterial("beichner Armor", 7000, new int[]{6, 9, 7, 5}, 30);
	
	public static ToolMaterial cShard1 = EnumHelper.addToolMaterial("Crackerish Shard", 4, 5000, 25.0f, 5.0f, 30);	
	public static ToolMaterial cShard2 = EnumHelper.addToolMaterial("Crackerish Shard", 4, 5000, 16.0f, 20.0f, 30);	
	public static ToolMaterial cShard3 = EnumHelper.addToolMaterial("Crackerish Shard", 4, 5000, 16.0f, 4.0f, 30);	
	public static ToolMaterial cShard4 = EnumHelper.addToolMaterial("Crackerish Shard", 4, 5000, 16.0f, 90.0f, 30);	
	public static ToolMaterial cShard5 = EnumHelper.addToolMaterial("Crackerish Shard", 4, 5000, 16.0f, 1.0f, 30);
	public static ArmorMaterial cArmor = EnumHelper.addArmorMaterial("Crackerish Armor", 6000, new int[]{5, 8, 6, 4}, 30);
	
	public static ToolMaterial eShard1 = EnumHelper.addToolMaterial("Ender Matter Shard", 4, 4000, 25.0f, 5.0f, 30);	
	public static ToolMaterial eShard2 = EnumHelper.addToolMaterial("Ender Matter Shard", 4, 4000, 16.0f, 20.0f, 30);	
	public static ToolMaterial eShard3 = EnumHelper.addToolMaterial("Ender Matter Shard", 4, 4000, 16.0f, 4.0f, 30);	
	public static ToolMaterial eShard4 = EnumHelper.addToolMaterial("Ender Matter Shard", 4, 4000, 16.0f, 70.0f, 30);	
	public static ToolMaterial eShard5 = EnumHelper.addToolMaterial("Ender Matter Shard", 4, 4000, 16.0f, 1.0f, 30);
	public static ArmorMaterial eArmor = EnumHelper.addArmorMaterial("Ender Matter Armor", 5000, new int[]{4, 7, 6, 3}, 30);
	
	public static ToolMaterial jShard1 = EnumHelper.addToolMaterial("Jack Shard", 4, 3000, 25.0f, 5.0f, 30);	
	public static ToolMaterial jShard2 = EnumHelper.addToolMaterial("Jack Shard", 4, 3000, 16.0f, 20.0f, 30);	
	public static ToolMaterial jShard3 = EnumHelper.addToolMaterial("Jack Shard", 4, 3000, 16.0f, 4.0f, 30);	
	public static ToolMaterial jShard4 = EnumHelper.addToolMaterial("Jack Shard", 4, 3000, 16.0f, 55.0f, 30);	
	public static ToolMaterial jShard5 = EnumHelper.addToolMaterial("Jack Shard", 4, 3000, 16.0f, 1.0f, 30);
	public static ArmorMaterial jArmor = EnumHelper.addArmorMaterial("Jack Armor", 4000, new int[]{3, 5, 4, 3}, 30);
	
	public static ToolMaterial xShard1 = EnumHelper.addToolMaterial("Xaencus Shard", 4, 2000, 25.0f, 5.0f, 30);	
	public static ToolMaterial xShard2 = EnumHelper.addToolMaterial("Xaencus Shard", 4, 2000, 16.0f, 20.0f, 30);	
	public static ToolMaterial xShard3 = EnumHelper.addToolMaterial("Xaencus Shard", 4, 2000, 16.0f, 4.0f, 30);	
	public static ToolMaterial xShard4 = EnumHelper.addToolMaterial("Xaencus Shard", 4, 2000, 16.0f, 40.0f, 30);	
	public static ToolMaterial xShard5 = EnumHelper.addToolMaterial("Xaencus Shard", 4, 2000, 16.0f, 1.0f, 30);
	public static ArmorMaterial xArmor = EnumHelper.addArmorMaterial("Xaencus Armor", 3000, new int[]{2, 4, 3, 2}, 30);
	
	public static Item hIngot;
	public static Item hPick;
	public static Item hAxe;
	public static Item hSpade;
	public static Item hSword;
	public static Item hHoe;
    public static Item hBlade;
    public static Item hShaft;
    public static Item hHandle;
    public static Item hHelmet;
    public static Item hChest;
    public static Item hPants;
    public static Item sString;
    public static Item bFlint;
    public static Item oStick;
    public static Item bArrow;
    public static Item bFeather;
    public static Item hBow;
    public static Item hGrip;
    public static Item CompString;
    public static Item dShard;
    public static Item dGem;
    public static Item hBoots;
    public static Item dIngot;
    public static Item dPick;
    public static Item dSpade;
    public static Item dAxe;
	public static Item dSword;
    public static Item dHoe;
    public static Item Derpple;
    public static Item dHelmet;
    public static Item dChest;
    public static Item dPants;
    public static Item dBoots;
    public static Item bIngot;
    public static Item bPick;
    public static Item bSpade;
    public static Item bAxe;
    public static Item bSword;
    public static Item bHoe;
    public static Item bHelmet;
    public static Item bChest;
    public static Item bPants;
    public static Item bBoots;
    public static Item obStick;
    public static Item LoH4ZE;
    public static Item LoCore;
    public static Item cIngot;
    public static Item cPick;
    public static Item cSpade;
    public static Item cAxe;
    public static Item cSword;
    public static Item cHelmet;
    public static Item cChest;
    public static Item cPants;
    public static Item cBoots;
    public static Item eMatter;
    public static Item eGem;
    public static Item vBomb;
    public static Item ePick;
    public static Item eSpade;
    public static Item eAxe;
    public static Item eSword;
    public static Item eHelmet;
    public static Item eChest;
    public static Item ePants;
    public static Item eBoots;
    public static Item jGem;
    public static Item jPick;
    public static Item jSpade;
    public static Item jAxe;
    public static Item jSword;
    public static Item jHelmet;
    public static Item jChest;
    public static Item jPants;
    public static Item jBoots;
    public static Item xDust;
    public static Item xGem;
    public static Item xPick;
    public static Item xSpade;
    public static Item xAxe;
    public static Item xSword;
    public static Item xHelmet;
    public static Item xChest;
    public static Item xPants;
    public static Item xBoots;
    
    
 
	public static void initializeItem(){
		//Legend of H4ZE//
		LoH4ZE = new LoH4ZE(LoShard).setUnlocalizedName("LoH4ZE").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":The_legend_of_H4ZE");
		LoCore = new Item().setUnlocalizedName("LoCore").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Legend_of_H4ZE_Core");
		
		//H4ZE Items//
		hIngot = new Item().setUnlocalizedName("hIngot").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":H4ZE_ingot");
		sString = new Item().setUnlocalizedName("sString").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Soul_string");
	    bFlint = new Item().setUnlocalizedName("bFlint").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Blood_flint");
	    oStick = new Item().setUnlocalizedName("oStick").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Obsidian_stick");
	    bArrow = new Item().setUnlocalizedName("bArrow").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Blood_arrow");
	    bFeather = new Item().setUnlocalizedName("bFeather").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Blood_feather");
	    hGrip = new Item().setUnlocalizedName("hGrip").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":H4ZE_Grip");
	    hHandle = new Item().setUnlocalizedName("hHandle").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":H4ZE_sword_Handle");
	    hShaft = new Item().setUnlocalizedName("hShaft").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":H4ZE_sword_shaft");
	    hBlade = new Item().setUnlocalizedName("hBlade").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":H4ZE_sword_blade");
	    CompString = new Item().setUnlocalizedName("CompString").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Compressed_string");
		
	    //H4ZE Tools//
		hPick = new hPick(hShard).setUnlocalizedName("hPick").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":H4ZE_pickaxe");
		hAxe = new hAxe(hShard2).setUnlocalizedName("hAxe").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":H4ZE_axe");
		hSpade = new hSpade(hShard3).setUnlocalizedName("hSpade").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":H4ZE_shovel");
		hSword = new hSword(hShard4).setUnlocalizedName("hSword").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":H4ZE_sword");
		hHoe = new hHoe(hShard5).setUnlocalizedName("hHoe").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":H4ZE_hoe");
		hBow = new Item().setUnlocalizedName("hBow").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":H4ZE_Bow");
		
		//H4ZE Armor//
		hHelmet = new hArmor(hArmor, MainRegistry.proxy.addArmor("hArmor"), 0).setUnlocalizedName("hHelmet").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":H4ZE_helmet");
		hChest = new hArmor(hArmor, MainRegistry.proxy.addArmor("hArmor"), 1).setUnlocalizedName("hChest").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":H4ZE_chest");
		hPants = new hArmor(hArmor, MainRegistry.proxy.addArmor("hArmor"), 2).setUnlocalizedName("hPants").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":H4ZE_pants");
		hBoots = new hArmor(hArmor, MainRegistry.proxy.addArmor("hArmor"), 3).setUnlocalizedName("hBoots").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":H4ZE_boots");
		
		//Derp Items//
		dShard = new Item().setUnlocalizedName("dShard").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Derp_shard");
	    dGem = new Item().setUnlocalizedName("dGem").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Derp_gem");
	    dIngot = new Item().setUnlocalizedName("dIngot").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Derp_ingot");
	   
	    //Derp Tools//
	    dPick = new dPick(dShard1).setUnlocalizedName("dPick").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Derp_pickaxe");
	    dSpade = new dSpade(dShard2).setUnlocalizedName("dSpade").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Derp_shovel");
	    dAxe = new dAxe(dShard3).setUnlocalizedName("dAxe").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Derp_axe");
	    dSword = new dSword(dShard4).setUnlocalizedName("dSword").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Derp_sword");
	    dHoe = new dHoe(dShard5).setUnlocalizedName("dHoe").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Derp_hoe");
	    
	    //Derp Armor//
		dHelmet = new dArmor(dArmor, MainRegistry.proxy.addArmor("dArmor"), 0).setUnlocalizedName("dHelmet").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Derp_helmet");
		dChest = new dArmor(dArmor, MainRegistry.proxy.addArmor("dArmor"), 1).setUnlocalizedName("dChest").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Derp_chest");
		dPants = new dArmor(dArmor, MainRegistry.proxy.addArmor("dArmor"), 2).setUnlocalizedName("dPants").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Derp_pants");
		dBoots = new dArmor(dArmor, MainRegistry.proxy.addArmor("dArmor"), 3).setUnlocalizedName("dBoots").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Derp_boots");
		
		//Beichner Items//
		bIngot = new Item().setUnlocalizedName("bIngot").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Beichner_ingot");
		obStick = new Item().setUnlocalizedName("obStick").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Obis_stick");
		
		//Beichner Tools//
		bPick = new bPick(bShard1).setUnlocalizedName("bPick").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Beichner_pickaxe");
		bSpade = new bSpade(bShard2).setUnlocalizedName("bSpade").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Beichner_shovel");
		bAxe = new bAxe(bShard3).setUnlocalizedName("bAxe").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Beichner_axe");
		bSword = new bSword(bShard4).setUnlocalizedName("bSword").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Beichner_sword");
		bHoe = new bHoe(bShard5).setUnlocalizedName("bHoe").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Beichner_hoe");
		
		//Beichner Armor//
		bHelmet = new bArmor(bArmor, MainRegistry.proxy.addArmor("bArmor"), 0).setUnlocalizedName("bHelmet").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Beichner_helmet");
		bChest = new bArmor(bArmor, MainRegistry.proxy.addArmor("bArmor"), 1).setUnlocalizedName("bChest").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Beichner_chest");
		bPants = new bArmor(bArmor, MainRegistry.proxy.addArmor("bArmor"), 2).setUnlocalizedName("bPants").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Beichner_pants");
		bBoots = new bArmor(bArmor, MainRegistry.proxy.addArmor("bArmor"), 3).setUnlocalizedName("bBoots").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Beichner_boots");
		
		//Crackerish Items//
		cIngot = new Item().setUnlocalizedName("cIngot").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Crackerish_ingot");
		
		//Crackerish Tools//
		cPick = new cPick(cShard1).setUnlocalizedName("cPick").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Crackerish_pickaxe");
		cSpade = new cSpade(cShard2).setUnlocalizedName("cSpade").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Crackerish_shovel");
		cAxe = new cAxe(cShard3).setUnlocalizedName("cAxe").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Crackerish_axe");
		cSword = new cSword(cShard4).setUnlocalizedName("cSword").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Crackerish_sword");
		
		//Crackerish Armor//
		cHelmet = new cArmor(cArmor, MainRegistry.proxy.addArmor("cArmor"), 0).setUnlocalizedName("cHelmet").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Crackerish_helmet");
		cChest = new cArmor(cArmor, MainRegistry.proxy.addArmor("cArmor"), 1).setUnlocalizedName("cChest").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Crackerish_chest");
		cPants = new cArmor(cArmor, MainRegistry.proxy.addArmor("cArmor"), 2).setUnlocalizedName("cPants").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Crackerish_leggings");
		cBoots = new cArmor(cArmor, MainRegistry.proxy.addArmor("cArmor"), 3).setUnlocalizedName("cBoots").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Crackerish_boots");
		
		//Ender Matter Items//
		eMatter = new Item().setUnlocalizedName("eMatter").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Ender_matter");
		eGem = new Item().setUnlocalizedName("eGem").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Ender_gem");
		
		//Ender Matter Tools//
		ePick = new ePick(eShard1).setUnlocalizedName("ePick").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Ender_matter_pickaxe");
		eSpade = new eSpade(eShard2).setUnlocalizedName("eSpade").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Ender_matter_shovel");
		eAxe = new eAxe(eShard3).setUnlocalizedName("eAxe").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Ender_matter_axe");
		eSword = new eSword(eShard4).setUnlocalizedName("eSword").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Ender_matter_sword");
		
		//Ender Matter Armor//
		eHelmet = new eArmor(eArmor, MainRegistry.proxy.addArmor("eArmor"), 0).setUnlocalizedName("eHelmet").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Ender_matter_helmet");
		eChest = new eArmor(eArmor, MainRegistry.proxy.addArmor("eArmor"), 1).setUnlocalizedName("eChest").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Ender_matter_chest");
		ePants = new eArmor(eArmor, MainRegistry.proxy.addArmor("eArmor"), 2).setUnlocalizedName("ePants").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Ender_matter_leggings");
		eBoots = new eArmor(eArmor, MainRegistry.proxy.addArmor("eArmor"), 3).setUnlocalizedName("eBoots").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Ender_matter_boots");
		
		//Ender Matter Entity's//
		vBomb = new vBomb().setUnlocalizedName("vBomb").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Voidbomb");
		
		//Jack Items//
		jGem = new Item().setUnlocalizedName("jGem").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Jack_gem");
		
		//Jack Tools//
		jPick = new jPick(jShard1).setUnlocalizedName("jPick").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Jack_pickaxe");
		jSpade = new jSpade(jShard2).setUnlocalizedName("jSpade").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Jack_shovel");
		jAxe = new jAxe(jShard3).setUnlocalizedName("jAxe").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Jack_axe");
		jSword = new jSword(jShard4).setUnlocalizedName("jSword").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Jack_sword");
		
		//Jack Armor//
		jHelmet = new jArmor(jArmor, MainRegistry.proxy.addArmor("jArmor"), 0).setUnlocalizedName("jHelmet").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Jack_helmet");
		jChest = new jArmor(jArmor, MainRegistry.proxy.addArmor("jArmor"), 1).setUnlocalizedName("jChest").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Jack_chest");
		jPants = new jArmor(jArmor, MainRegistry.proxy.addArmor("jArmor"), 2).setUnlocalizedName("jPants").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Jack_leggings");
		jBoots = new jArmor(jArmor, MainRegistry.proxy.addArmor("jArmor"), 3).setUnlocalizedName("jBoots").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Jack_boots");
		
		//Xaencus Items//
		xDust = new Item().setUnlocalizedName("xDust").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Xaencus_dust");
		xGem = new Item().setUnlocalizedName("xGem").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Xaencus_gem");
		
		//Xaencus Tools//
		xPick = new xPick(xShard1).setUnlocalizedName("xPick").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Xaencus_pickaxe");
		xSpade = new xSpade(xShard2).setUnlocalizedName("xSpade").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Xaencus_shovel");
		xAxe = new xAxe(xShard3).setUnlocalizedName("xAxe").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Xaencus_axe");
		xSword = new xSword(xShard4).setUnlocalizedName("xSword").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Xaencus_sword");
		
		//Xaencus Armor//
		xHelmet = new xArmor(xArmor, MainRegistry.proxy.addArmor("xArmor"), 0).setUnlocalizedName("xHelmet").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Xaencus_helmet");
		xChest = new xArmor(xArmor, MainRegistry.proxy.addArmor("xArmor"), 1).setUnlocalizedName("xChest").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Xaencus_chest");
		xPants = new xArmor(xArmor, MainRegistry.proxy.addArmor("xArmor"), 2).setUnlocalizedName("xPants").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Xaencus_leggings");
		xBoots = new xArmor(xArmor, MainRegistry.proxy.addArmor("xArmor"), 3).setUnlocalizedName("xBoots").setCreativeTab(MCreativeTabs.tabH4ZECraft).setTextureName(RefStrings.MODID + ":Xaencus_boots");
	} 
	
	public static void registerItem(){
		GameRegistry.registerItem(LoH4ZE, LoH4ZE.getUnlocalizedName());
		GameRegistry.registerItem(LoCore, LoCore.getUnlocalizedName());
		GameRegistry.registerItem(hIngot, hIngot.getUnlocalizedName());
		GameRegistry.registerItem(hPick, hPick.getUnlocalizedName());
		GameRegistry.registerItem(hAxe, hAxe.getUnlocalizedName());
		GameRegistry.registerItem(hSpade, hSpade.getUnlocalizedName());
		GameRegistry.registerItem(hSword, hSword.getUnlocalizedName());
		GameRegistry.registerItem(hHoe, hHoe.getUnlocalizedName());
		GameRegistry.registerItem(hHelmet, hHelmet.getUnlocalizedName());
		GameRegistry.registerItem(hChest, hChest.getUnlocalizedName());
		GameRegistry.registerItem(hPants, hPants.getUnlocalizedName());
		GameRegistry.registerItem(hBoots, hBoots.getUnlocalizedName());
		GameRegistry.registerItem(sString, sString.getUnlocalizedName());
		GameRegistry.registerItem(oStick, oStick.getUnlocalizedName());
		GameRegistry.registerItem(bFlint, bFlint.getUnlocalizedName());
		GameRegistry.registerItem(bArrow, bArrow.getUnlocalizedName());
		GameRegistry.registerItem(bFeather, bFeather.getUnlocalizedName());
		GameRegistry.registerItem(hBow, hBow.getUnlocalizedName());
		GameRegistry.registerItem(dGem, dGem.getUnlocalizedName());
		GameRegistry.registerItem(hGrip, hGrip.getUnlocalizedName());
		GameRegistry.registerItem(dShard, dShard.getUnlocalizedName());
		GameRegistry.registerItem(CompString, CompString.getUnlocalizedName());
		GameRegistry.registerItem(hHandle, hHandle.getUnlocalizedName());
		GameRegistry.registerItem(hShaft, hShaft.getUnlocalizedName());
		GameRegistry.registerItem(hBlade, hBlade.getUnlocalizedName());
		GameRegistry.registerItem(dIngot, dIngot.getUnlocalizedName());
		GameRegistry.registerItem(dPick, dPick.getUnlocalizedName());
		GameRegistry.registerItem(dSpade, dSpade.getUnlocalizedName());
		GameRegistry.registerItem(dAxe, dAxe.getUnlocalizedName());
		GameRegistry.registerItem(dSword, dSword.getUnlocalizedName());
		GameRegistry.registerItem(dHoe, dHoe.getUnlocalizedName());
		GameRegistry.registerItem(dHelmet, dHelmet.getUnlocalizedName());
		GameRegistry.registerItem(dChest, dChest.getUnlocalizedName());
		GameRegistry.registerItem(dPants, dPants.getUnlocalizedName());
		GameRegistry.registerItem(dBoots, dBoots.getUnlocalizedName());
		GameRegistry.registerItem(bIngot, bIngot.getUnlocalizedName());
		GameRegistry.registerItem(obStick, obStick.getUnlocalizedName());
		GameRegistry.registerItem(bPick, bPick.getUnlocalizedName());
		GameRegistry.registerItem(bSpade, bSpade.getUnlocalizedName());
		GameRegistry.registerItem(bAxe, bAxe.getUnlocalizedName());
		GameRegistry.registerItem(bSword, bSword.getUnlocalizedName());
		GameRegistry.registerItem(bHoe, bHoe.getUnlocalizedName());
		GameRegistry.registerItem(bHelmet, bHelmet.getUnlocalizedName());
		GameRegistry.registerItem(bChest, bChest.getUnlocalizedName());
		GameRegistry.registerItem(bPants, bPants.getUnlocalizedName());
		GameRegistry.registerItem(bBoots, bBoots.getUnlocalizedName());
		GameRegistry.registerItem(cPick, cPick.getUnlocalizedName());
		GameRegistry.registerItem(cSpade, cSpade.getUnlocalizedName());
		GameRegistry.registerItem(cAxe, cAxe.getUnlocalizedName());
		GameRegistry.registerItem(cSword, cSword.getUnlocalizedName());
		GameRegistry.registerItem(cHelmet, cHelmet.getUnlocalizedName());
		GameRegistry.registerItem(cChest, cChest.getUnlocalizedName());
		GameRegistry.registerItem(cPants, cPants.getUnlocalizedName());
		GameRegistry.registerItem(cBoots, cBoots.getUnlocalizedName());
		GameRegistry.registerItem(cIngot, cIngot.getUnlocalizedName());
		GameRegistry.registerItem(ePick, ePick.getUnlocalizedName());
		GameRegistry.registerItem(eSpade, eSpade.getUnlocalizedName());
		GameRegistry.registerItem(eAxe, eAxe.getUnlocalizedName());
		GameRegistry.registerItem(eSword, eSword.getUnlocalizedName());
		GameRegistry.registerItem(eHelmet, eHelmet.getUnlocalizedName());
		GameRegistry.registerItem(eChest, eChest.getUnlocalizedName());
		GameRegistry.registerItem(ePants, ePants.getUnlocalizedName());
		GameRegistry.registerItem(eBoots, eBoots.getUnlocalizedName());
		GameRegistry.registerItem(eMatter, eMatter.getUnlocalizedName());
		GameRegistry.registerItem(eGem, eGem.getUnlocalizedName());
		GameRegistry.registerItem(vBomb, vBomb.getUnlocalizedName());
		GameRegistry.registerItem(jPick, jPick.getUnlocalizedName());
		GameRegistry.registerItem(jSpade, jSpade.getUnlocalizedName());
		GameRegistry.registerItem(jAxe, jAxe.getUnlocalizedName());
		GameRegistry.registerItem(jSword, jSword.getUnlocalizedName());
		GameRegistry.registerItem(jHelmet, jHelmet.getUnlocalizedName());
		GameRegistry.registerItem(jChest, jChest.getUnlocalizedName());
		GameRegistry.registerItem(jPants, jPants.getUnlocalizedName());
		GameRegistry.registerItem(jBoots, jBoots.getUnlocalizedName());
		GameRegistry.registerItem(jGem, jGem.getUnlocalizedName());
		GameRegistry.registerItem(xPick, xPick.getUnlocalizedName());
		GameRegistry.registerItem(xSpade, xSpade.getUnlocalizedName());
		GameRegistry.registerItem(xAxe, xAxe.getUnlocalizedName());
		GameRegistry.registerItem(xSword, xSword.getUnlocalizedName());
		GameRegistry.registerItem(xHelmet, xHelmet.getUnlocalizedName());
		GameRegistry.registerItem(xChest, xChest.getUnlocalizedName());
		GameRegistry.registerItem(xPants, xPants.getUnlocalizedName());
		GameRegistry.registerItem(xBoots, xBoots.getUnlocalizedName());
		GameRegistry.registerItem(xDust, xDust.getUnlocalizedName());
		GameRegistry.registerItem(xGem, xGem.getUnlocalizedName());
	}
}
