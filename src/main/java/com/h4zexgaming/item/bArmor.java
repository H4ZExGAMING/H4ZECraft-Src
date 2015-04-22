package com.h4zexgaming.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

import com.h4zexgaming.lib.RefStrings;

public class bArmor extends ItemArmor{

	public bArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);

	}
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == MItems.bHelmet || stack.getItem() == MItems.bChest || stack.getItem() == MItems.bBoots){
        	return RefStrings.MODID + ":textures/armor/bArmor1.png";
        }else if(stack.getItem() == MItems.bPants){
        	return RefStrings.MODID + ":textures/armor/bArmor2.png";
        }else{
        	return null;
        }
    }

}
