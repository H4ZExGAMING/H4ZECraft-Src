package com.h4zexgaming.creativetabs;

import com.h4zexgaming.item.MItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabH4ZE extends CreativeTabs {

	public CreativeTabH4ZE(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return MItems.hIngot;
	}

}
