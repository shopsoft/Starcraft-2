package mattparks.mods.starcraft.mercury;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;

public class CommonProxyMercury implements IGuiHandler
{
    public void preInit(FMLPreInitializationEvent event)
    {
    	;
    }

    public void init(FMLInitializationEvent event)
    {
    	;
    }

    public void postInit(FMLPostInitializationEvent event)
    {
    	;
    }

    public void registerRenderInformation()
    {
    	;
    }

    public int getVineRenderID()
    {
        return -1;
    }

    public int getEggRenderID()
    {
        return -1;
    }

    public int getTreasureRenderID()
    {
        return -1;
    }

    public int getMachineRenderID()
    {
        return -1;
    }

    public int getTintedGlassPaneRenderID()
    {
        return -1;
    }

    public void spawnParticle(String var1, double var2, double var4, double var6)
    {
        ;
    }


    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity tile = world.getBlockTileEntity(x, y, z);

        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        return null;
    }
}
