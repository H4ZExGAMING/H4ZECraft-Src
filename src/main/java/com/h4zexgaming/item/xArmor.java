package com.h4zexgaming.item;

import com.h4zexgaming.lib.RefStrings;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class xArmor extends ItemArmor{

	public xArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);

	}
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == MItems.xHelmet || stack.getItem() == MItems.xChest || stack.getItem() == MItems.xBoots){
        	return RefStrings.MODID + ":textures/armor/xArmor1.png";
        }else if(stack.getItem() == MItems.xPants){
        	return RefStrings.MODID + ":textures/armor/xArmor2.png";
        }else{
        	return null;
        }
    }

}