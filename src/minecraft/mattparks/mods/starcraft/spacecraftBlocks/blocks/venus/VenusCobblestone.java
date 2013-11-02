package mattparks.mods.starcraft.spacecraftBlocks.blocks.venus;

import java.util.Random;

import mattparks.mods.starcraft.core.StarcraftCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class VenusCobblestone extends Block
{
    public VenusCobblestone(int id, Material material)
    {
    	super( id, material.rock);
        this.setCreativeTab(StarcraftCore.starcraftVenusTab);
    }

}