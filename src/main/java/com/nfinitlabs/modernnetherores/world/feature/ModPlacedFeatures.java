package com.nfinitlabs.modernnetherores.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class ModPlacedFeatures {

    //Nether Iron Ore
    public static final Holder<PlacedFeature>
            NETHER_IRON_ORE_PLACED = PlacementUtils.register("nether_iron_ore_placed",
            ModConfiguredFeatures.NETHER_IRON_ORE, ModOrePlacement.commonOrePlacement(12, // VeinsPerChunk
            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(150))));

    //Nether Copper Ore
    public static final Holder<PlacedFeature>
            NETHER_COPPER_ORE_PLACED = PlacementUtils.register("nether_copper_ore_placed",
            ModConfiguredFeatures.NETHER_COPPER_ORE, ModOrePlacement.commonOrePlacement(4, // VeinsPerChunk
            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(150))));

    //Nether lapis Ore
    public static final Holder<PlacedFeature>
            NETHER_LAPIS_ORE_PLACED = PlacementUtils.register("nether_lapis_ore_placed",
            ModConfiguredFeatures.NETHER_LAPIS_ORE, ModOrePlacement.commonOrePlacement(3, // VeinsPerChunk
            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(150))));

    //Nether Redstone Ore
    public static final Holder<PlacedFeature>
            NETHER_REDSTONE_ORE_PLACED = PlacementUtils.register("nether_redstone_ore_placed",
            ModConfiguredFeatures.NETHER_REDSTONE_ORE, ModOrePlacement.commonOrePlacement(3, // VeinsPerChunk
            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(150))));

    //Nether Coal Ore
    public static final Holder<PlacedFeature>
            NETHER_COAL_ORE_PLACED = PlacementUtils.register("nether_coal_ore_placed",
            ModConfiguredFeatures.NETHER_COAL_ORE, ModOrePlacement.commonOrePlacement(10, // VeinsPerChunk
            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(150))));

    //Nether Diamond Ore
    public static final Holder<PlacedFeature>
            NETHER_DIAMOND_ORE_PLACED = PlacementUtils.register("nether_diamond_ore_placed",
            ModConfiguredFeatures.NETHER_DIAMOND_ORE, ModOrePlacement.rareOrePlacement(2, // VeinsPerChunk
            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(150))));

    //Nether Emerald Ore
    public static final Holder<PlacedFeature>
            NETHER_EMERALD_ORE_PLACED = PlacementUtils.register("nether_emerald_ore_placed",
            ModConfiguredFeatures.NETHER_EMERALD_ORE, ModOrePlacement.rareOrePlacement(2, // VeinsPerChunk
            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(150))));

    //Nether Gold Ore
    public static final Holder<PlacedFeature>
            NETHER_GOLD_ORE_PLACED = PlacementUtils.register("nether_gold_ore_placed",
            ModConfiguredFeatures.NETHER_GOLD_ORE, ModOrePlacement.rareOrePlacement(2, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(150))));
}