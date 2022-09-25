package com.nfinitlabs.modernnetherores.world.gen;

import com.nfinitlabs.modernnetherores.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(ModPlacedFeatures.NETHER_IRON_ORE_PLACED);
        base.add(ModPlacedFeatures.NETHER_COPPER_ORE_PLACED);
        base.add(ModPlacedFeatures.NETHER_LAPIS_ORE_PLACED);
        base.add(ModPlacedFeatures.NETHER_REDSTONE_ORE_PLACED);
        base.add(ModPlacedFeatures.NETHER_COAL_ORE_PLACED);
        base.add(ModPlacedFeatures.NETHER_DIAMOND_ORE_PLACED);
        base.add(ModPlacedFeatures.NETHER_EMERALD_ORE_PLACED);

        //Gold Ore
        base.add(ModPlacedFeatures.NETHER_GOLD_ORE_PLACED);





    }
}