package mattparks.mods.starcraft.jupiter.util;

import java.util.HashMap;

import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import micdoodle8.mods.galacticraft.core.recipe.GCCoreNasaWorkbenchRecipe;
import net.minecraft.item.ItemStack;

public class SCJupiterUtil
{
    public static void addRocketBenchT3Recipe(ItemStack result, HashMap<Integer, ItemStack> input)
    {
        GalacticraftRegistry.addT2RocketRecipe(new GCCoreNasaWorkbenchRecipe(result, input));
    }
}
