package com.h4zexgaming.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class jBlock extends Block{

	protected jBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHarvestLevel("pickaxe", 3);
	}

}
