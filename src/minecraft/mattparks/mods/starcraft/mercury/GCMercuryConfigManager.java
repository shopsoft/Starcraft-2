package mattparks.mods.starcraft.mercury;

import java.io.File;
import java.util.logging.Level;

import mattparks.mods.starcraft.core.SCCoreConfigManager;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;

public class GCMercuryConfigManager
{
    public static boolean loaded;

    static Configuration configuration;

    public GCMercuryConfigManager(File file)
    {
        if (!GCMercuryConfigManager.loaded)
        {
            GCMercuryConfigManager.configuration = new Configuration(file);
            this.setDefaultValues();
        }
    }

    // DIMENSIONS
    public static int dimensionIDMercury;

    // BLOCKS
    public static int idBlockMercury;

    // ITEMS
    public static int idItemMercuryBasic;
    public static int idTtemMercuryT4Schematic;
    public static int idItemSpaceshipTier4;
    
    // ARMOR
    public static int idArmorJetpack;
    
    // TOOLS

    // ENTITIES
    public static int idEntitySpaceshipTier4;

    // GUI
    public static int idGuiRocketCraftingBenchT4;

    // SCHEMATIC
    public static int idSchematicRocketT4;

    // ACHIEVEMENTS

    // GENERAL
    public static boolean disableGemOreMercury;
    public static boolean disableCoalOreMercury;  
    public static boolean disableTinOreMercury;
    public static boolean disableCopperOreMercury;
  
    public static boolean generateOtherMods;
    public static boolean disableMercuryVillageGen;

    private void setDefaultValues()
    {
        try
        {
            GCMercuryConfigManager.configuration.load();

            GCMercuryConfigManager.dimensionIDMercury = GCMercuryConfigManager.configuration.get("Dimensions", "Venus Dimension ID", -42).getInt(-42);

            GCMercuryConfigManager.idBlockMercury = GCMercuryConfigManager.configuration.get(Configuration.CATEGORY_BLOCK, "idBlockVenus", 7755).getInt(7755);
     
            GCMercuryConfigManager.idItemMercuryBasic = GCMercuryConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idItemvenusItemBasic", 7756).getInt(7756);
            GCMercuryConfigManager.idTtemMercuryT4Schematic = GCMercuryConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idTtemMercuryT4Schematic", 7757).getInt(7757);
            GCMercuryConfigManager.idItemSpaceshipTier4 = GCMercuryConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idItemSpaceshipTier4", 7544).getInt(7544);
            
            GCMercuryConfigManager.idArmorJetpack = GCMercuryConfigManager.configuration.get(Configuration.CATEGORY_ITEM, "idArmorJetpack", 7551).getInt(7551);
            
            
            //Block id's 7857-7870 used by Spacecraft Venus
            
            GCMercuryConfigManager.idEntitySpaceshipTier4 = GCMercuryConfigManager.configuration.get("Entities", "idEntitySpaceshipTier4", 174).getInt(174);
    
            GCMercuryConfigManager.idGuiRocketCraftingBenchT4 = GCMercuryConfigManager.configuration.get("GUI", "idGuiRocketCraftingBenchT4", 144).getInt(144);

            GCMercuryConfigManager.idSchematicRocketT4 = GCMercuryConfigManager.configuration.get("Schematic", "idSchematicRocketT4", 4).getInt(4);

            GCMercuryConfigManager.disableGemOreMercury = GCMercuryConfigManager.configuration.get(Configuration.CATEGORY_GENERAL, "Disable Gem Ore Gen on Mercury", false).getBoolean(false);
            GCMercuryConfigManager.disableCoalOreMercury = GCMercuryConfigManager.configuration.get(Configuration.CATEGORY_GENERAL, "Disable Coal Ore Gen on Mercury", false).getBoolean(false);
            GCMercuryConfigManager.disableTinOreMercury = GCMercuryConfigManager.configuration.get(Configuration.CATEGORY_GENERAL, "Disable Tin Ore Gen on Mercury", false).getBoolean(false);
            GCMercuryConfigManager.disableCopperOreMercury = GCMercuryConfigManager.configuration.get(Configuration.CATEGORY_GENERAL, "Disable Copper Ore Gen on Mercury", false).getBoolean(false);

            GCMercuryConfigManager.generateOtherMods = GCMercuryConfigManager.configuration.get(Configuration.CATEGORY_GENERAL, "Generate other mod's features on Mercury", false).getBoolean(false);        
            GCMercuryConfigManager.disableMercuryVillageGen = GCMercuryConfigManager.configuration.get(Configuration.CATEGORY_GENERAL, "Disable Mercury Village Gen", false).getBoolean(false);
        }
        catch (final Exception e)
        {
            FMLLog.log(Level.SEVERE, e, "Galacticraft Mercury has a problem loading it's configuration");
        }
        finally
        {
            GCMercuryConfigManager.configuration.save();
            GCMercuryConfigManager.loaded = true;
        }
    }
}
