package com.nfinitlabs.modernnetherores.init;
import com.nfinitlabs.modernnetherores.ModernNetherOres;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModernNetherOres.MOD_ID);

    // Nether Iron Ore
    public static final RegistryObject<Block> NETHER_IRON_ORE = BLOCKS.register("nether_iron_ore",
            () -> new Block(Block.Properties.of(Material.STONE).strength(4f, 1200f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_IRON_ORE_BASALT = BLOCKS.register("nether_iron_ore_basalt",
            () -> new Block(Block.Properties.of(Material.STONE).strength(4f, 1200f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NETHER_IRON_ORE_BLACkSTONE = BLOCKS.register("nether_iron_ore_blackstone",
            () -> new Block(Block.Properties.of(Material.STONE).strength(4f, 1200f).requiresCorrectToolForDrops()));

    // Nether Copper Ore
    public static final RegistryObject<Block> NETHER_COPPER_ORE = BLOCKS.register("nether_copper_ore",
            () -> new Block(Block.Properties.of(Material.STONE).strength(4f, 1200f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_COPPER_ORE_BASALT = BLOCKS.register("nether_copper_ore_basalt",
            () -> new Block(Block.Properties.of(Material.STONE).strength(4f, 1200f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NETHER_COPPER_ORE_BLACkSTONE = BLOCKS.register("nether_copper_ore_blackstone",
            () -> new Block(Block.Properties.of(Material.STONE).strength(4f, 1200f).requiresCorrectToolForDrops()));

    // Nether Lapis Ore
    public static final RegistryObject<Block> NETHER_LAPIS_ORE = BLOCKS.register("nether_lapis_ore",
            () -> new Block(Block.Properties.of(Material.STONE).strength(4f, 1200f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_LAPIS_ORE_BASALT = BLOCKS.register("nether_lapis_ore_basalt",
            () -> new Block(Block.Properties.of(Material.STONE).strength(4f, 1200f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NETHER_LAPIS_ORE_BLACkSTONE = BLOCKS.register("nether_lapis_ore_blackstone",
            () -> new Block(Block.Properties.of(Material.STONE).strength(4f, 1200f).requiresCorrectToolForDrops()));

    // Nether Redstone Ore
    public static final RegistryObject<Block> NETHER_REDSTONE_ORE = BLOCKS.register("nether_redstone_ore",
            () -> new Block(Block.Properties.of(Material.STONE).strength(4f, 1200f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_REDSTONE_ORE_BASALT = BLOCKS.register("nether_redstone_ore_basalt",
            () -> new Block(Block.Properties.of(Material.STONE).strength(4f, 1200f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NETHER_REDSTONE_ORE_BLACkSTONE = BLOCKS.register("nether_redstone_ore_blackstone",
            () -> new Block(Block.Properties.of(Material.STONE).strength(4f, 1200f).requiresCorrectToolForDrops()));

    // Nether Coal Ore
    public static final RegistryObject<Block> NETHER_COAL_ORE = BLOCKS.register("nether_coal_ore",
            () -> new Block(Block.Properties.of(Material.STONE).strength(4f, 1200f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_COAL_ORE_BASALT = BLOCKS.register("nether_coal_ore_basalt",
            () -> new Block(Block.Properties.of(Material.STONE).strength(4f, 1200f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NETHER_COAL_ORE_BLACkSTONE = BLOCKS.register("nether_coal_ore_blackstone",
            () -> new Block(Block.Properties.of(Material.STONE).strength(4f, 1200f).requiresCorrectToolForDrops()));

    // Nether Diamond Ore
    public static final RegistryObject<Block> NETHER_DIAMOND_ORE = BLOCKS.register("nether_diamond_ore",
            () -> new Block(Block.Properties.of(Material.STONE).strength(4f, 1200f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_DIAMOND_ORE_BASALT = BLOCKS.register("nether_diamond_ore_basalt",
            () -> new Block(Block.Properties.of(Material.STONE).strength(4f, 1200f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NETHER_DIAMOND_ORE_BLACkSTONE = BLOCKS.register("nether_diamond_ore_blackstone",
            () -> new Block(Block.Properties.of(Material.STONE).strength(4f, 1200f).requiresCorrectToolForDrops()));

    // Nether Emerald Ore
    public static final RegistryObject<Block> NETHER_EMERALD_ORE = BLOCKS.register("nether_emerald_ore",
            () -> new Block(Block.Properties.of(Material.STONE).strength(4f, 1200f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_EMERALD_ORE_BASALT = BLOCKS.register("nether_emerald_ore_basalt",
            () -> new Block(Block.Properties.of(Material.STONE).strength(4f, 1200f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NETHER_EMERALD_ORE_BLACkSTONE = BLOCKS.register("nether_emerald_ore_blackstone",
            () -> new Block(Block.Properties.of(Material.STONE).strength(4f, 1200f).requiresCorrectToolForDrops()));

    // Nether Gold Ore
    public static final RegistryObject<Block> NETHER_GOLD_ORE = BLOCKS.register("nether_gold_ore",
            () -> new Block(Block.Properties.of(Material.STONE).strength(4f, 1200f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_GOLD_ORE_BASALT = BLOCKS.register("nether_gold_ore_basalt",
            () -> new Block(Block.Properties.of(Material.STONE).strength(4f, 1200f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NETHER_GOLD_ORE_BLACkSTONE = BLOCKS.register("nether_gold_ore_blackstone",
            () -> new Block(Block.Properties.of(Material.STONE).strength(4f, 1200f).requiresCorrectToolForDrops()));


    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        BLOCKS.getEntries().stream().map(RegistryObject::get).forEach( (block) -> {
            final Item.Properties properties = new Item.Properties().tab(ItemInit.ModCreativeTab.instance);

            final BlockItem blockItem = new BlockItem(block, properties);

            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });
    }
}