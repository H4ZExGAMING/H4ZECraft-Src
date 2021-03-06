package com.h4zexgaming.item;

import com.h4zexgaming.lib.RefStrings;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class hArmor extends ItemArmor{

	public hArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);

	}
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == MItems.hHelmet || stack.getItem() == MItems.hChest || stack.getItem() == MItems.hBoots){
        	return RefStrings.MODID + ":textures/armor/hArmor1.png";
        }else if(stack.getItem() == MItems.hPants){
        	return RefStrings.MODID + ":textures/armor/hArmor2.png";
        }else{
        	return null;
        }
    }

}
