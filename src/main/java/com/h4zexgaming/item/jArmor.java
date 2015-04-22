package com.h4zexgaming.item;

import com.h4zexgaming.lib.RefStrings;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class jArmor extends ItemArmor{

	public jArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);

	}
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == MItems.jHelmet || stack.getItem() == MItems.jChest || stack.getItem() == MItems.jBoots){
        	return RefStrings.MODID + ":textures/armor/jArmor1.png";
        }else if(stack.getItem() == MItems.jPants){
        	return RefStrings.MODID + ":textures/armor/jArmor2.png";
        }else{
        	return null;
        }
    }

}
