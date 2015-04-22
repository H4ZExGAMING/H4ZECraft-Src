package com.h4zexgaming.Main;

import com.h4zexgaming.blocks.MBlocks;
import com.h4zexgaming.item.MItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {
	public static void mainRegistry(){
		addCraftingRec();
		addSmeltingRec();
	}
	public static void addCraftingRec(){
		//Shaped
		GameRegistry.addRecipe(new ItemStack(MBlocks.hBlock, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.hIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.hPick, 1), new Object[]{"XXX"," S "," S ", 'X', MItems.hIngot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.hAxe, 1), new Object[]{"XX ","XS "," S ", 'X', MItems.hIngot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.hSpade, 1), new Object[]{" X "," S "," S ", 'X', MItems.hIngot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.hSword, 1), new Object[]{"  X","DSD","H  ", 'X', MItems.hBlade, 'D', MItems.dSword, 'S', MItems.hShaft, 'H', MItems.hHandle, 'C', MItems.CompString});
		GameRegistry.addRecipe(new ItemStack(MItems.hHoe, 1), new Object[]{"XX "," S "," S ", 'X', MItems.hIngot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.sString, 1), new Object[]{"SDS","DXD","SDS", 'X', Items.string, 'S', Blocks.netherrack, 'D', Items.netherbrick});
		GameRegistry.addRecipe(new ItemStack(MItems.bFlint, 1), new Object[]{"NCN","CFC","NCN", 'F', Items.flint, 'N', Blocks.nether_brick, 'C', Items.fire_charge});
		GameRegistry.addRecipe(new ItemStack(MItems.oStick, 2), new Object[]{"S  "," S ","  S", 'S', Blocks.obsidian});
		GameRegistry.addRecipe(new ItemStack(MItems.bFeather, 4), new Object[]{"NCN","CFC","NCN", 'F', Items.feather, 'N', Blocks.nether_brick, 'C', Items.fire_charge});
		GameRegistry.addRecipe(new ItemStack(MItems.bArrow, 16), new Object[]{"  F"," S ","N  ", 'N', MItems.bFeather, 'S', MItems.oStick, 'F', MItems.bFlint});
		GameRegistry.addRecipe(new ItemStack(MItems.hIngot, 5), new Object[]{"DED","EIE","DED", 'D', Blocks.diamond_block, 'E', Blocks.emerald_block, 'I', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(MItems.hBow, 1), new Object[]{" HC","G C"," HC", 'H', MItems.hIngot, 'G', MItems.hGrip, 'C', MItems.CompString});
		GameRegistry.addRecipe(new ItemStack(MItems.hGrip, 1), new Object[]{"HHH"," L ","  H", 'H', MItems.hIngot, 'L', Items.leather});
		GameRegistry.addRecipe(new ItemStack(MItems.CompString, 1), new Object[]{"SSS","SSS","SSS", 'S', MItems.sString});
		GameRegistry.addRecipe(new ItemStack(MItems.dGem, 1), new Object[]{"DD ","DD ","   ", 'D', MItems.dShard});
		GameRegistry.addRecipe(new ItemStack(MItems.dIngot, 1), new Object[]{"DD ","DD ","   ", 'D', MItems.dGem});
		GameRegistry.addRecipe(new ItemStack(MBlocks.dBlock, 1), new Object[]{"DDD","DDD","DDD", 'D', MItems.dIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.dPick, 1), new Object[]{"DDD"," B "," B ", 'D', MItems.dIngot,'B', Items.blaze_rod});
		GameRegistry.addRecipe(new ItemStack(MItems.dSpade, 1), new Object[]{" D "," B "," B ", 'D', MItems.dIngot,'B', Items.blaze_rod});
		GameRegistry.addRecipe(new ItemStack(MItems.dAxe, 1), new Object[]{"DD ","DB "," B ", 'D', MItems.dIngot,'B', Items.blaze_rod});
		GameRegistry.addRecipe(new ItemStack(MItems.dSword, 1), new Object[]{" D ","DND"," B ", 'D', MItems.dIngot,'N', MItems.bSword,'B', Items.blaze_rod});
		GameRegistry.addRecipe(new ItemStack(MItems.dHoe, 1), new Object[]{"DD "," B "," B ", 'D', MItems.dIngot,'B', Items.blaze_rod});
		GameRegistry.addRecipe(new ItemStack(MItems.hBlade, 1), new Object[]{"HDH","HDH","HDH", 'H', MItems.hIngot, 'D', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(MItems.hShaft, 1), new Object[]{"H H"," H ","   ", 'H', MItems.hIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.hHandle, 1), new Object[]{"HDH","HSH","HHH", 'H', MItems.hIngot, 'D', Items.diamond, 'S', MItems.oStick});
		GameRegistry.addRecipe(new ItemStack(MItems.hHelmet, 1), new Object[]{"HHH","HDH","   ", 'H', MItems.hIngot, 'D', Items.diamond_helmet});
		GameRegistry.addRecipe(new ItemStack(MItems.hChest, 1), new Object[]{"HDH","HHH","HHH", 'H', MItems.hIngot, 'D', Items.diamond_chestplate});
		GameRegistry.addRecipe(new ItemStack(MItems.hPants, 1), new Object[]{"HHH","HDH","H H", 'H', MItems.hIngot, 'D', Items.diamond_leggings});
		GameRegistry.addRecipe(new ItemStack(MItems.hBoots, 1), new Object[]{"HDH","H H","   ", 'H', MItems.hIngot, 'D', Items.diamond_boots});
		GameRegistry.addRecipe(new ItemStack(MItems.dHelmet, 1), new Object[]{"HHH","HDH","   ", 'H', MItems.dIngot, 'D', Items.diamond_helmet});
		GameRegistry.addRecipe(new ItemStack(MItems.dChest, 1), new Object[]{"HDH","HHH","HHH", 'H', MItems.dIngot, 'D', Items.diamond_chestplate});
		GameRegistry.addRecipe(new ItemStack(MItems.dPants, 1), new Object[]{"HHH","HDH","H H", 'H', MItems.dIngot, 'D', Items.diamond_leggings});
		GameRegistry.addRecipe(new ItemStack(MItems.dBoots, 1), new Object[]{"HDH","H H","   ", 'H', MItems.dIngot, 'D', Items.diamond_boots});
		GameRegistry.addRecipe(new ItemStack(MBlocks.bBlock, 1), new Object[]{"DDD","DDD","DDD", 'D', MItems.bIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.bHelmet, 1), new Object[]{"BBB","BDB","   ", 'B', MItems.bIngot, 'D', Items.diamond_helmet});
		GameRegistry.addRecipe(new ItemStack(MItems.bChest, 1), new Object[]{"BDB","BBB","BBB", 'B', MItems.bIngot, 'D', Items.diamond_chestplate});
		GameRegistry.addRecipe(new ItemStack(MItems.bPants, 1), new Object[]{"BBB","BDB","B B", 'B', MItems.bIngot, 'D', Items.diamond_leggings});
		GameRegistry.addRecipe(new ItemStack(MItems.bBoots, 1), new Object[]{"BDB","B B","   ", 'B', MItems.bIngot, 'D', Items.diamond_boots});
		GameRegistry.addRecipe(new ItemStack(MItems.bPick, 1), new Object[]{"BBB"," O "," O ", 'B', MItems.bIngot,'O', MItems.obStick});
		GameRegistry.addRecipe(new ItemStack(MItems.bSpade, 1), new Object[]{" B "," O "," O ", 'B', MItems.bIngot,'O', MItems.obStick});
		GameRegistry.addRecipe(new ItemStack(MItems.bAxe, 1), new Object[]{"BB ","BO "," O ", 'B', MItems.bIngot,'O', MItems.obStick});
		GameRegistry.addRecipe(new ItemStack(MItems.bSword, 1), new Object[]{" B ","BCB"," O ", 'B', MItems.bIngot,'C', MItems.cSword, 'O',MItems.obStick});
		GameRegistry.addRecipe(new ItemStack(MItems.bHoe, 1), new Object[]{"BB "," O "," O ", 'B', MItems.bIngot,'O', MItems.obStick});
		GameRegistry.addRecipe(new ItemStack(MItems.obStick, 1), new Object[]{" L ","LOL"," L ", 'L', Blocks.lapis_block, 'O', MItems.oStick});
		GameRegistry.addRecipe(new ItemStack(MBlocks.cBlock, 1), new Object[]{"DDD","DDD","DDD", 'D', MItems.cIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.cHelmet, 1), new Object[]{"BBB","BDB","   ", 'B', MItems.cIngot, 'D', Items.diamond_helmet});
		GameRegistry.addRecipe(new ItemStack(MItems.cChest, 1), new Object[]{"BDB","BBB","BBB", 'B', MItems.cIngot, 'D', Items.diamond_chestplate});
		GameRegistry.addRecipe(new ItemStack(MItems.cPants, 1), new Object[]{"BBB","BDB","B B", 'B', MItems.cIngot, 'D', Items.diamond_leggings});
		GameRegistry.addRecipe(new ItemStack(MItems.cBoots, 1), new Object[]{"BDB","B B","   ", 'B', MItems.cIngot, 'D', Items.diamond_boots});
		GameRegistry.addRecipe(new ItemStack(MItems.cPick, 1), new Object[]{"BBB"," O "," O ", 'B', MItems.cIngot,'O', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.cSpade, 1), new Object[]{" B "," O "," O ", 'B', MItems.cIngot,'O', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.cAxe, 1), new Object[]{"BB ","BO "," O ", 'B', MItems.cIngot,'O', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.cSword, 1), new Object[]{" B "," B "," O ", 'B', MItems.cIngot,'O', MItems.eSword});
		GameRegistry.addRecipe(new ItemStack(MItems.eGem, 1), new Object[]{"EE ","EE ","   ", 'E', MItems.eMatter});
		GameRegistry.addRecipe(new ItemStack(MBlocks.eBlock, 1), new Object[]{"DDD","DDD","DDD", 'D', MItems.eGem});
		GameRegistry.addRecipe(new ItemStack(MItems.eHelmet, 1), new Object[]{"BBB","BDB","   ", 'B', MItems.eGem, 'D', Items.diamond_helmet});
		GameRegistry.addRecipe(new ItemStack(MItems.eChest, 1), new Object[]{"BDB","BBB","BBB", 'B', MItems.eGem, 'D', Items.diamond_chestplate});
		GameRegistry.addRecipe(new ItemStack(MItems.ePants, 1), new Object[]{"BBB","BDB","B B", 'B', MItems.eGem, 'D', Items.diamond_leggings});
		GameRegistry.addRecipe(new ItemStack(MItems.eBoots, 1), new Object[]{"BDB","B B","   ", 'B', MItems.eGem, 'D', Items.diamond_boots});
		GameRegistry.addRecipe(new ItemStack(MItems.ePick, 1), new Object[]{"BBB"," O "," O ", 'B', MItems.eGem,'O', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.eSpade, 1), new Object[]{" B "," O "," O ", 'B', MItems.eGem,'O', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.eAxe, 1), new Object[]{"BB ","BO "," O ", 'B', MItems.eGem,'O', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.eSword, 1), new Object[]{" B "," B "," O ", 'B', MItems.eGem,'O', MItems.jSword});
		GameRegistry.addRecipe(new ItemStack(MBlocks.jBlock, 1), new Object[]{"DDD","DDD","DDD", 'D', MItems.jGem});
		GameRegistry.addRecipe(new ItemStack(MItems.jHelmet, 1), new Object[]{"BBB","BDB","   ", 'B', MItems.jGem, 'D', Items.iron_helmet});
		GameRegistry.addRecipe(new ItemStack(MItems.jChest, 1), new Object[]{"BDB","BBB","BBB", 'B', MItems.jGem, 'D', Items.iron_chestplate});
		GameRegistry.addRecipe(new ItemStack(MItems.jPants, 1), new Object[]{"BBB","BDB","B B", 'B', MItems.jGem, 'D', Items.iron_leggings});
		GameRegistry.addRecipe(new ItemStack(MItems.jBoots, 1), new Object[]{"BDB","B B","   ", 'B', MItems.jGem, 'D', Items.iron_boots});
		GameRegistry.addRecipe(new ItemStack(MItems.jPick, 1), new Object[]{"BBB"," O "," O ", 'B', MItems.jGem,'O', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.jSpade, 1), new Object[]{" B "," O "," O ", 'B', MItems.jGem,'O', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.jAxe, 1), new Object[]{"BB ","BO "," O ", 'B', MItems.jGem,'O', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.jSword, 1), new Object[]{" B "," B "," O ", 'B', MItems.jGem,'O', MItems.xSword});
		GameRegistry.addRecipe(new ItemStack(MItems.xGem, 1), new Object[]{"EE ","EE ","   ", 'E', MItems.xDust});
		GameRegistry.addRecipe(new ItemStack(MBlocks.xBlock, 1), new Object[]{"DDD","DDD","DDD", 'D', MItems.xGem});
		GameRegistry.addRecipe(new ItemStack(MItems.xHelmet, 1), new Object[]{"BBB","BDB","   ", 'B', MItems.xGem, 'D', Items.iron_helmet});
		GameRegistry.addRecipe(new ItemStack(MItems.xChest, 1), new Object[]{"BDB","BBB","BBB", 'B', MItems.xGem, 'D', Items.iron_chestplate});
		GameRegistry.addRecipe(new ItemStack(MItems.xPants, 1), new Object[]{"BBB","BDB","B B", 'B', MItems.xGem, 'D', Items.iron_leggings});
		GameRegistry.addRecipe(new ItemStack(MItems.xBoots, 1), new Object[]{"BDB","B B","   ", 'B', MItems.xGem, 'D', Items.iron_boots});
		GameRegistry.addRecipe(new ItemStack(MItems.xPick, 1), new Object[]{"BBB"," O "," O ", 'B', MItems.xGem,'O', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.xSpade, 1), new Object[]{" B "," O "," O ", 'B', MItems.xGem,'O', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.xAxe, 1), new Object[]{"BB ","BO "," O ", 'B', MItems.xGem,'O', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.xSword, 1), new Object[]{" B "," B "," O ", 'B', MItems.xGem,'O', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.LoH4ZE, 1), new Object[]{"DHB","CSE","JOX", 'H', MItems.hSword, 'D', MItems.dSword, 'B', MItems.bSword, 'C', MItems.cSword, 'E', MItems.eSword, 'J', MItems.jSword, 'X', MItems.xSword, 'S', MItems.LoCore, 'O', MItems.obStick});
		GameRegistry.addRecipe(new ItemStack(MItems.LoCore, 1), new Object[]{"DND","NEN","DND", 'N', Items.nether_star, 'D', Blocks.diamond_block, 'E', Blocks.dragon_egg});
		
		//Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.hIngot, 9), new Object[] { MBlocks.hBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.dGem, 4),new Object[] { MItems.dIngot});
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.dIngot, 9), new Object[] { MBlocks.dBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.bIngot, 9), new Object[] { MBlocks.bBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.cIngot, 9), new Object[] { MBlocks.cBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.eGem, 9), new Object[] { MBlocks.eBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.jGem, 9), new Object[] { MBlocks.jBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.xGem, 9), new Object[] { MBlocks.xBlock});
	}
	public static void addSmeltingRec(){
		GameRegistry.addSmelting(MBlocks.hOre, new ItemStack(MItems.hIngot, 1), 20.0f);
		GameRegistry.addSmelting(MBlocks.dOre, new ItemStack(MItems.dShard, 1), 20.0f);
		GameRegistry.addSmelting(MBlocks.bOre, new ItemStack(MItems.bIngot, 1), 20.0f);
		GameRegistry.addSmelting(MBlocks.cOre, new ItemStack(MItems.cIngot, 1), 20.0f);
		GameRegistry.addSmelting(MBlocks.eOre, new ItemStack(MItems.eMatter, 2), 20.0f);
		GameRegistry.addSmelting(MBlocks.jOre, new ItemStack(MItems.jGem, 1), 20.0f);
		GameRegistry.addSmelting(MBlocks.xOre, new ItemStack(MItems.xDust, 3), 20.0f);
	}
}
