package mattparks.mods.starcraft.spacecraftBlocks.block;

import mattparks.mods.starcraft.core.StarcraftCore;
import mattparks.mods.starcraft.mercury.GCMercury;
import mattparks.mods.starcraft.spacecraftBlocks.SpacecraftBlocks;
import micdoodle8.mods.galacticraft.core.blocks.GCCoreBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class StarcraftCaravanModule extends Block
{        
    public StarcraftCaravanModule(int id, String name)
    {
        super(id, Material.rock);
        this.setUnlocalizedName(name);
        this.setTextureName(StarcraftCore.ASSET_PREFIX + name);
        this.setHardness(2.0F);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public CreativeTabs getCreativeTabToDisplayOn()
    {
        return GCMercury.starcraftMercuryTab;
    }
    
    @Override
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {            
            this.breakBlocksOther(par1World, par2 - 1, par3 + 1, par4 + 3, false);
            this.breakBlocksOther(par1World, par2, par3 + 1, par4 + 3, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 1, par4 + 3, false);
            
            this.breakBlocksOther(par1World, par2 - 1, par3 + 1, par4 + 2, false);
            this.breakBlocksOther(par1World, par2, par3 + 1, par4 + 2, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 1, par4 + 2, false);
            
            this.breakBlocksOther(par1World, par2 - 1, par3 + 1, par4 + 1, false);
            this.breakBlocksOther(par1World, par2, par3 + 1, par4 + 1, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 1, par4 + 1, false);
            
            this.breakBlocksOther(par1World, par2 - 1, par3 + 1, par4, false);
            this.breakBlocksOther(par1World, par2, par3 + 1, par4, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 1, par4, false);
            
            
            this.breakBlocksOther(par1World, par2 - 1, par3 + 2, par4 + 3, false);
            this.breakBlocksOther(par1World, par2, par3 + 2, par4 + 3, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 2, par4 + 3, false);
            
            this.breakBlocksOther(par1World, par2 - 1, par3 + 2, par4 + 2, false);
            this.breakBlocksOther(par1World, par2, par3 + 2, par4 + 2, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 2, par4 + 2, false);
            
            this.breakBlocksOther(par1World, par2 - 1, par3 + 2, par4 + 1, false);
            this.breakBlocksOther(par1World, par2, par3 + 2, par4 + 1, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 2, par4 + 1, false);
            
            this.breakBlocksOther(par1World, par2 - 1, par3 + 2, par4, false);
            this.breakBlocksOther(par1World, par2, par3 + 2, par4, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 2, par4, false);
            
            this.breakBlocksOther(par1World, par2 - 1, par3 + 2, par4 - 1, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 2, par4 + 1, false);
            
            
            this.breakBlocksOther(par1World, par2 - 1, par3 + 3, par4 + 3, false);
            this.breakBlocksOther(par1World, par2, par3 + 3, par4 + 3, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 3, par4 + 3, false);
            
            this.breakBlocksOther(par1World, par2 - 1, par3 + 3, par4 + 2, false);
            this.breakBlocksOther(par1World, par2, par3 + 3, par4 + 2, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 3, par4 + 2, false);
            
            this.breakBlocksOther(par1World, par2 - 1, par3 + 3, par4 + 1, false);
            this.breakBlocksOther(par1World, par2, par3 + 3, par4 + 1, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 3, par4 + 1, false);
            
            this.breakBlocksOther(par1World, par2 - 1, par3 + 3, par4, false);
            this.breakBlocksOther(par1World, par2, par3 + 3, par4, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 3, par4, false);
            
            this.breakBlocksOther(par1World, par2 - 1, par3 + 3, par4 - 1, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 3, par4 + 1, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 3, par4, false);
            
            
            this.breakBlocksOther(par1World, par2, par3 + 1, par4 + 4, false);
            this.breakBlocksOther(par1World, par2, par3 + 2, par4 + 4, false);
            
            this.breakBlocksOther(par1World, par2 + 1, par3 + 2, par4 - 1, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 3, par4 - 1, false);
            
            this.breakBlocksOther(par1World, par2, par3 + 3, par4 - 1, false);
            
            this.setBlocks(par1World, par2, par3, par4 - 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 1, par3, par4 - 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 +1, par3, par4, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 1, par3, par4 + 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3, par4 + 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 1, par3, par4 + 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 1, par3, par4, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 1, par3, par4 - 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 - 1, par3, par4 + 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3, par4 + 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 1, par3, par4 + 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 - 1, par3, par4 + 3, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3, par4 + 3, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 1, par3, par4 + 3, true, SpacecraftBlocks.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 - 1, par3, par4 + 4, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3, par4 + 4, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 1, par3, par4 + 4, true, SpacecraftBlocks.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 + 2, par3, par4 + 4, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3, par4 + 3, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3, par4 + 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3, par4 + 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3, par4, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3, par4 - 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3, par4 - 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 + 1, par3, par4 - 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3, par4 - 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 1, par3, par4 - 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3, par4 - 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 - 2, par3, par4 - 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3, par4, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3, par4 + 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3, par4 + 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3, par4 + 3, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3, par4 + 4, true, SpacecraftBlocks.caravanModulePart.blockID);
            

            this.setBlocks(par1World, par2 - 1, par3 + 1, par4 + 4, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 1, par3 + 1, par4 + 4, true, SpacecraftBlocks.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 + 2, par3 + 1, par4 + 4, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 1, par4 + 3, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 1, par4 + 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 1, par4 + 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 1, par4, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 1, par4 - 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 1, par4 - 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 + 1, par3 + 1, par4 - 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 1, par4 - 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 1, par3 + 1, par4 - 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 1, par4 - 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 - 2, par3 + 1, par4 - 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 1, par4, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 1, par4 + 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 1, par4 + 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 1, par4 + 3, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 1, par4 + 4, true, SpacecraftBlocks.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 - 1, par3 + 1, par4 - 1, false, Block.workbench.blockID);
            this.setBlocks(par1World, par2 + 1, par3 + 1, par4 - 1, false, Block.chest.blockID);
            this.setBlocks(par1World, par2, par3 + 1, par4 - 1, false, Block.furnaceIdle.blockID);
            
            this.setBlocks(par1World, par2 - 1, par3 + 2, par4 + 4, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 1, par3 + 2, par4 + 4, true, SpacecraftBlocks.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 + 2, par3 + 2, par4 + 4, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 2, par4 + 3, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 2, par4 + 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 2, par4 + 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 2, par4, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 2, par4 - 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 2, par4 - 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 - 2, par3 + 2, par4 + 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 + 1, par3 + 2, par4 - 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 2, par4 - 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 1, par3 + 2, par4 - 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 2, par4 - 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 - 2, par3 + 2, par4 - 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 2, par4, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 2, par4 + 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 2, par4 + 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 2, par4 + 3, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 2, par4 - 1, false, GCCoreBlocks.glowstoneTorch.blockID);
            
            this.setBlocks(par1World, par2 - 2, par3 + 2, par4 + 4, true, SpacecraftBlocks.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 - 1, par3 + 3, par4 + 4, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 3, par4 + 4, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 1, par3 + 3, par4 + 4, true, SpacecraftBlocks.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 + 2, par3 + 3, par4 + 4, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 3, par4 + 3, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 3, par4 + 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 3, par4 + 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 3, par4, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 3, par4 - 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 3, par4 - 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 + 1, par3 + 3, par4 - 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 3, par4 - 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 1, par3 + 3, par4 - 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 3, par4 - 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 - 2, par3 + 3, par4 - 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 3, par4, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 3, par4 + 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 3, par4 + 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 3, par4 + 3, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 3, par4 + 4, true, SpacecraftBlocks.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2, par3 + 4, par4 + 4, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 4, par4 + 3, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 4, par4 + 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 4, par4 + 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 4, par4, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 4, par4 - 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 4, par4 - 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2, par3 + 5, par4 + 4, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 5, par4 + 3, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 5, par4 + 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 5, par4 + 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 5, par4, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 5, par4 - 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 5, par4 - 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 - 1, par3 + 4, par4 + 4, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 1, par3 + 4, par4 + 3, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 1, par3 + 4, par4 + 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 1, par3 + 4, par4 + 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 1, par3 + 4, par4, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 1, par3 + 4, par4 - 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 1, par3 + 4, par4 - 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 + 1, par3 + 4, par4 + 4, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 1, par3 + 4, par4 + 3, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 1, par3 + 4, par4 + 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 1, par3 + 4, par4 + 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 1, par3 + 4, par4, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 1, par3 + 4, par4 - 1, true, SpacecraftBlocks.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 1, par3 + 4, par4 - 2, true, SpacecraftBlocks.caravanModulePart.blockID);
            
            
        return true;
    }
    
    private void setBlocks(World par1World, int x, int y, int z, boolean item, int blockid)
    {
            if(par1World.blockExists(x, y, z))
            {
                    if(par1World.getBlockId(x, y, z) != blockid)
                    {
                            par1World.destroyBlock(x, y, z, item);
                    }
                    
                    par1World.setBlock(x, y, z, blockid);
            }
    }
    
    private void breakBlocks(World par1World, int x, int y, int z, boolean item)
    {
            if(par1World.blockExists(x, y, z))
            {
                    if(par1World.getBlockId(x, y, z) == SpacecraftBlocks.caravanModulePart.blockID 
                                    || par1World.getBlockId(x, y, z) == GCCoreBlocks.glowstoneTorch.blockID
                                    || par1World.getBlockId(x, y, z) == Block.furnaceBurning.blockID 
                                    || par1World.getBlockId(x, y, z) == Block.furnaceIdle.blockID 
                                    || par1World.getBlockId(x, y, z) == Block.chest.blockID
                    	            || par1World.getBlockId(x, y, z) == Block.workbench.blockID)
                    {
                            par1World.destroyBlock(x, y, z, item);
                    }
            }
    }
    
    private void breakBlocksOther(World par1World, int x, int y, int z, boolean item)
    {
            if(par1World.blockExists(x, y, z))
            {
                    
                    par1World.destroyBlock(x, y, z, item);
                    
            }
    }
    
    @Override
    public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
    {        

            this.breakBlocks(par1World, par2, par3 + 2, par4 - 1, false);
            
            this.breakBlocks(par1World, par2, par3, par4 - 1, false);
            this.breakBlocks(par1World, par2 + 1, par3, par4 - 1, false);
            this.breakBlocks(par1World, par2 +1, par3, par4, false);
            this.breakBlocks(par1World, par2 + 1, par3, par4 + 1, false);
            this.breakBlocks(par1World, par2, par3, par4 + 1, false);
            this.breakBlocks(par1World, par2 - 1, par3, par4 + 1, false);
            this.breakBlocks(par1World, par2 - 1, par3, par4, false);
            this.breakBlocks(par1World, par2 - 1, par3, par4 - 1, false);
            
            this.breakBlocks(par1World, par2 - 1, par3, par4 + 2, false);
            this.breakBlocks(par1World, par2, par3, par4 + 2, false);
            this.breakBlocks(par1World, par2 + 1, par3, par4 + 2, false);
            
            this.breakBlocks(par1World, par2 - 1, par3, par4 + 3, false);
            this.breakBlocks(par1World, par2, par3, par4 + 3, false);
            this.breakBlocks(par1World, par2 + 1, par3, par4 + 3, false);
            
            this.breakBlocks(par1World, par2 - 1, par3, par4 + 4, false);
            this.breakBlocks(par1World, par2, par3, par4 + 4, false);
            this.breakBlocks(par1World, par2 + 1, par3, par4 + 4, false);
            
            this.breakBlocks(par1World, par2 + 2, par3, par4 + 4, false);
            this.breakBlocks(par1World, par2 + 2, par3, par4 + 3, false);
            this.breakBlocks(par1World, par2 + 2, par3, par4 + 2, false);
            this.breakBlocks(par1World, par2 + 2, par3, par4 + 1, false);
            this.breakBlocks(par1World, par2 + 2, par3, par4, false);
            this.breakBlocks(par1World, par2 + 2, par3, par4 - 1, false);
            this.breakBlocks(par1World, par2 + 2, par3, par4 - 2, false);
            
            this.breakBlocks(par1World, par2 + 1, par3, par4 - 2, false);
            this.breakBlocks(par1World, par2, par3, par4 - 2, false);
            this.breakBlocks(par1World, par2 - 1, par3, par4 - 2, false);
            this.breakBlocks(par1World, par2 - 2, par3, par4 - 2, false);
            
            this.breakBlocks(par1World, par2 - 2, par3, par4 - 1, false);
            this.breakBlocks(par1World, par2 - 2, par3, par4, false);
            this.breakBlocks(par1World, par2 - 2, par3, par4 + 1, false);
            this.breakBlocks(par1World, par2 - 2, par3, par4 + 2, false);
            this.breakBlocks(par1World, par2 - 2, par3, par4 + 3, false);
            this.breakBlocks(par1World, par2 - 2, par3, par4 + 4, false);
            

            this.breakBlocks(par1World, par2 - 1, par3 + 1, par4 + 4, false);
            this.breakBlocks(par1World, par2 + 1, par3 + 1, par4 + 4, false);
            
            this.breakBlocks(par1World, par2 + 2, par3 + 1, par4 + 4, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 1, par4 + 3, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 1, par4 + 2, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 1, par4 + 1, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 1, par4, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 1, par4 - 1, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 1, par4 - 2, false);
            
            this.breakBlocks(par1World, par2 + 1, par3 + 1, par4 - 2, false);
            this.breakBlocks(par1World, par2, par3 + 1, par4 - 2, false);
            this.breakBlocks(par1World, par2 - 1, par3 + 1, par4 - 2, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 1, par4 - 2, false);
            
            this.breakBlocks(par1World, par2 - 2, par3 + 1, par4 - 1, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 1, par4, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 1, par4 + 1, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 1, par4 + 2, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 1, par4 + 3, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 1, par4 + 4, false);
            
            this.breakBlocks(par1World, par2 - 1, par3 + 1, par4 - 1, false);
            this.breakBlocks(par1World, par2 + 1, par3 + 1, par4 - 1, false);
            this.breakBlocks(par1World, par2, par3 + 1, par4 - 1, false);
            
            this.breakBlocks(par1World, par2 - 1, par3 + 2, par4 + 4, false);
            this.breakBlocks(par1World, par2 + 1, par3 + 2, par4 + 4, false);
            
            this.breakBlocks(par1World, par2 + 2, par3 + 2, par4 + 4, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 2, par4 + 3, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 2, par4 + 2, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 2, par4 + 1, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 2, par4, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 2, par4 - 1, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 2, par4 - 2, false);
            
            this.breakBlocks(par1World, par2 + 1, par3 + 2, par4 - 2, false);
            this.breakBlocks(par1World, par2, par3 + 2, par4 - 2, false);
            this.breakBlocks(par1World, par2 - 1, par3 + 2, par4 - 2, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 2, par4 - 2, false);
            
            this.breakBlocks(par1World, par2 - 2, par3 + 2, par4 - 1, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 2, par4, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 2, par4 + 1, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 2, par4 + 2, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 2, par4 + 3, false);
            
            this.breakBlocks(par1World, par2 - 2, par3 + 2, par4 + 4, false);
            
            this.breakBlocks(par1World, par2 - 1, par3 + 3, par4 + 4, false);
            this.breakBlocks(par1World, par2, par3 + 3, par4 + 4, false);
            this.breakBlocks(par1World, par2 + 1, par3 + 3, par4 + 4, false);
            
            this.breakBlocks(par1World, par2 + 2, par3 + 3, par4 + 4, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 3, par4 + 3, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 3, par4 + 2, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 3, par4 + 1, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 3, par4, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 3, par4 - 1, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 3, par4 - 2, false);
            
            this.breakBlocks(par1World, par2 + 1, par3 + 3, par4 - 2, false);
            this.breakBlocks(par1World, par2, par3 + 3, par4 - 2, false);
            this.breakBlocks(par1World, par2 - 1, par3 + 3, par4 - 2, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 3, par4 - 2, false);
            
            this.breakBlocks(par1World, par2 - 2, par3 + 3, par4 - 1, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 3, par4, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 3, par4 + 1, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 3, par4 + 2, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 3, par4 + 3, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 3, par4 + 4, false);
            
            this.breakBlocks(par1World, par2, par3 + 4, par4 + 4, false);
            this.breakBlocks(par1World, par2, par3 + 4, par4 + 3, false);
            this.breakBlocks(par1World, par2, par3 + 4, par4 + 2, false);
            this.breakBlocks(par1World, par2, par3 + 4, par4 + 1, false);
            this.breakBlocks(par1World, par2, par3 + 4, par4, false);
            this.breakBlocks(par1World, par2, par3 + 4, par4 - 1, false);
            this.breakBlocks(par1World, par2, par3 + 4, par4 - 2, false);
            
            this.breakBlocks(par1World, par2, par3 + 5, par4 + 4, false);
            this.breakBlocks(par1World, par2, par3 + 5, par4 + 3, false);
            this.breakBlocks(par1World, par2, par3 + 5, par4 + 2, false);
            this.breakBlocks(par1World, par2, par3 + 5, par4 + 1, false);
            this.breakBlocks(par1World, par2, par3 + 5, par4, false);
            this.breakBlocks(par1World, par2, par3 + 5, par4 - 1, false);
            this.breakBlocks(par1World, par2, par3 + 5, par4 - 2, false);
            
            this.breakBlocks(par1World, par2 - 1, par3 + 4, par4 + 4, false);
            this.breakBlocks(par1World, par2 - 1, par3 + 4, par4 + 3, false);
            this.breakBlocks(par1World, par2 - 1, par3 + 4, par4 + 2, false);
            this.breakBlocks(par1World, par2 - 1, par3 + 4, par4 + 1, false);
            this.breakBlocks(par1World, par2 - 1, par3 + 4, par4, false);
            this.breakBlocks(par1World, par2 - 1, par3 + 4, par4 - 1, false);
            this.breakBlocks(par1World, par2 - 1, par3 + 4, par4 - 2, false);
            
            this.breakBlocks(par1World, par2 + 1, par3 + 4, par4 + 4, false);
            this.breakBlocks(par1World, par2 + 1, par3 + 4, par4 + 3, false);
            this.breakBlocks(par1World, par2 + 1, par3 + 4, par4 + 2, false);
            this.breakBlocks(par1World, par2 + 1, par3 + 4, par4 + 1, false);
            this.breakBlocks(par1World, par2 + 1, par3 + 4, par4, false);
            this.breakBlocks(par1World, par2 + 1, par3 + 4, par4 - 1, false);
            this.breakBlocks(par1World, par2 + 1, par3 + 4, par4 - 2, false);

            this.breakBlocks(par1World, par2 - 1, par3 + 1, par4 - 1, false);
    }
    
    @Override
    public int getMobilityFlag()
    {
        return 2;
    }
    
}