package com.h4zexgaming.item;

import com.h4zexgaming.lib.RefStrings;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class cArmor extends ItemArmor{

	public cArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);

	}
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == MItems.cHelmet || stack.getItem() == MItems.cChest || stack.getItem() == MItems.cBoots){
        	return RefStrings.MODID + ":textures/armor/cArmor1.png";
        }else if(stack.getItem() == MItems.cPants){
        	return RefStrings.MODID + ":textures/armor/cArmor2.png";
        }else{
        	return null;
        }
    }

}
