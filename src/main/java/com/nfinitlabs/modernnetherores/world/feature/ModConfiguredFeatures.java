package com.nfinitlabs.modernnetherores.world.feature;

import com.nfinitlabs.modernnetherores.init.BlockInit;
import com.nfinitlabs.modernnetherores.init.BlockInit;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RuleTest NETHERRACK = new BlockMatchTest(Blocks.NETHERRACK);
    public static final RuleTest BASALT = new BlockMatchTest(Blocks.BASALT);
    public static final RuleTest BLACKSTONE = new BlockMatchTest(Blocks.BLACKSTONE);

    //Nether Iron Ore
    public static final List<OreConfiguration.TargetBlockState> NETHER_IRON_ORES = List.of(
            OreConfiguration.target(ModConfiguredFeatures.NETHERRACK, BlockInit.NETHER_IRON_ORE.get().defaultBlockState()),
            OreConfiguration.target(ModConfiguredFeatures.BASALT, BlockInit.NETHER_IRON_ORE_BASALT.get().defaultBlockState()),
            OreConfiguration.target(ModConfiguredFeatures.BLACKSTONE, BlockInit.NETHER_IRON_ORE_BLACkSTONE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>>
            NETHER_IRON_ORE =
            FeatureUtils.register("nether_iron_ore",
                    Feature.ORE, new OreConfiguration(NETHER_IRON_ORES, 15));

    //Nether Copper Ore
    public static final List<OreConfiguration.TargetBlockState> NETHER_COPPER_ORES = List.of(
            OreConfiguration.target(ModConfiguredFeatures.NETHERRACK, BlockInit.NETHER_COPPER_ORE.get().defaultBlockState()),
            OreConfiguration.target(ModConfiguredFeatures.BASALT, BlockInit.NETHER_COPPER_ORE_BASALT.get().defaultBlockState()),
            OreConfiguration.target(ModConfiguredFeatures.BLACKSTONE, BlockInit.NETHER_COPPER_ORE_BLACkSTONE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>>
            NETHER_COPPER_ORE =
            FeatureUtils.register("nether_copper_ore",
                    Feature.ORE, new OreConfiguration(NETHER_COPPER_ORES, 15));

    //Nether Lapis Ore
    public static final List<OreConfiguration.TargetBlockState> NETHER_LAPIS_ORES = List.of(
            OreConfiguration.target(ModConfiguredFeatures.NETHERRACK, BlockInit.NETHER_LAPIS_ORE.get().defaultBlockState()),
            OreConfiguration.target(ModConfiguredFeatures.BASALT, BlockInit.NETHER_LAPIS_ORE_BASALT.get().defaultBlockState()),
            OreConfiguration.target(ModConfiguredFeatures.BLACKSTONE, BlockInit.NETHER_LAPIS_ORE_BLACkSTONE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>>
            NETHER_LAPIS_ORE =
            FeatureUtils.register("nether_lapis_ore",
                    Feature.ORE, new OreConfiguration(NETHER_LAPIS_ORES, 15));


    //Nether Redstone Ore
    public static final List<OreConfiguration.TargetBlockState> NETHER_REDSTONE_ORES = List.of(
            OreConfiguration.target(ModConfiguredFeatures.NETHERRACK, BlockInit.NETHER_REDSTONE_ORE.get().defaultBlockState()),
            OreConfiguration.target(ModConfiguredFeatures.BASALT, BlockInit.NETHER_REDSTONE_ORE_BASALT.get().defaultBlockState()),
            OreConfiguration.target(ModConfiguredFeatures.BLACKSTONE, BlockInit.NETHER_REDSTONE_ORE_BLACkSTONE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>>
            NETHER_REDSTONE_ORE =
            FeatureUtils.register("nether_redstone_ore",
                    Feature.ORE, new OreConfiguration(NETHER_REDSTONE_ORES, 15));

    //Nether Coal Ore
    public static final List<OreConfiguration.TargetBlockState> NETHER_COAL_ORES = List.of(
            OreConfiguration.target(ModConfiguredFeatures.NETHERRACK, BlockInit.NETHER_COAL_ORE.get().defaultBlockState()),
            OreConfiguration.target(ModConfiguredFeatures.BASALT, BlockInit.NETHER_COAL_ORE_BASALT.get().defaultBlockState()),
            OreConfiguration.target(ModConfiguredFeatures.BLACKSTONE, BlockInit.NETHER_COAL_ORE_BLACkSTONE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>>
            NETHER_COAL_ORE =
            FeatureUtils.register("nether_coal_ore",
                    Feature.ORE, new OreConfiguration(NETHER_COAL_ORES, 15));


    //Nether Diamond Ore
    public static final List<OreConfiguration.TargetBlockState> NETHER_DIAMOND_ORES = List.of(
            OreConfiguration.target(ModConfiguredFeatures.NETHERRACK, BlockInit.NETHER_DIAMOND_ORE.get().defaultBlockState()),
            OreConfiguration.target(ModConfiguredFeatures.BASALT, BlockInit.NETHER_DIAMOND_ORE_BASALT.get().defaultBlockState()),
            OreConfiguration.target(ModConfiguredFeatures.BLACKSTONE, BlockInit.NETHER_DIAMOND_ORE_BLACkSTONE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>>
            NETHER_DIAMOND_ORE =
            FeatureUtils.register("nether_diamond_ore",
                    Feature.ORE, new OreConfiguration(NETHER_DIAMOND_ORES, 15));

    //Nether Emerald  Ore
    public static final List<OreConfiguration.TargetBlockState> NETHER_EMERALD_ORES = List.of(
            OreConfiguration.target(ModConfiguredFeatures.NETHERRACK, BlockInit.NETHER_EMERALD_ORE.get().defaultBlockState()),
            OreConfiguration.target(ModConfiguredFeatures.BASALT, BlockInit.NETHER_EMERALD_ORE_BASALT.get().defaultBlockState()),
            OreConfiguration.target(ModConfiguredFeatures.BLACKSTONE, BlockInit.NETHER_EMERALD_ORE_BLACkSTONE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>>
            NETHER_EMERALD_ORE =
            FeatureUtils.register("nether_emerald_ore",
                    Feature.ORE, new OreConfiguration(NETHER_EMERALD_ORES, 15));


    //Nether Gold  Ore
    public static final List<OreConfiguration.TargetBlockState> NETHER_GOLD_ORES = List.of(
            OreConfiguration.target(ModConfiguredFeatures.NETHERRACK, BlockInit.NETHER_EMERALD_ORE.get().defaultBlockState()),
            OreConfiguration.target(ModConfiguredFeatures.BASALT, BlockInit.NETHER_GOLD_ORE_BASALT.get().defaultBlockState()),
            OreConfiguration.target(ModConfiguredFeatures.BLACKSTONE, BlockInit.NETHER_GOLD_ORE_BLACkSTONE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>>
            NETHER_GOLD_ORE =
            FeatureUtils.register("nether_gold_ore",
                    Feature.ORE, new OreConfiguration(NETHER_GOLD_ORES, 15));



}