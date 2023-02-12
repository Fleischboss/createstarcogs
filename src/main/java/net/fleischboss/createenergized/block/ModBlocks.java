package net.fleischboss.createenergized.block;


import net.fleischboss.createenergized.block.custom.LaserBarrel;
import net.fleischboss.createenergized.block.custom.LaserController;
import net.fleischboss.createenergized.createenergized;
import net.fleischboss.createenergized.block.custom.LaserCoolantInput;
import net.fleischboss.createenergized.item.ModCreativeModeTab;
import net.fleischboss.createenergized.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.simibubi.create.foundation.data.BlockStateGen.axisBlock;
import static com.simibubi.create.foundation.data.ModelGen.customItemModel;


import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, createenergized.MOD_ID);


    public static final RegistryObject<Block> DURASTEEL_BLOCK = registerBlock("durasteel_block",
            ()  -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ENERGIZED);
    public static final RegistryObject<Block> DURASTEEL_CASING = registerBlock("durasteel_casing",
            ()  -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ENERGIZED);
    public static final RegistryObject<Block> ZERSIUM_BLOCK = registerBlock("zersium_block",
            ()  -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ENERGIZED);


    public static final RegistryObject<Block> DURASTEEL_PLATING = registerBlock("durasteel_plating",
            ()  -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(15f).explosionResistance(100f).requiresCorrectToolForDrops()), ModCreativeModeTab.ENERGIZED);

    public static final RegistryObject<Block> CERAMISTEEL_BRICKS = registerBlock("ceramisteel_bricks",
            ()  -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.ENERGIZED);
    //dyed plating
    public static final RegistryObject<Block> BLACK_DURASTEEL_PLATING = registerBlock("black_durasteel_plating",
            ()  -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(15f).explosionResistance(100f).requiresCorrectToolForDrops()), ModCreativeModeTab.ENERGIZED);

    public static final RegistryObject<Block> DARK_GRAY_DURASTEEL_PLATING = registerBlock("dark_grey_durasteel_plating",
            ()  -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(15f).explosionResistance(100f).requiresCorrectToolForDrops()), ModCreativeModeTab.ENERGIZED);

    public static final RegistryObject<Block> GREY_DURASTEEL_PLATING = registerBlock("grey_durasteel_plating",
            ()  -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(15f).explosionResistance(100f).requiresCorrectToolForDrops()), ModCreativeModeTab.ENERGIZED);

    public static final RegistryObject<Block> WHITE_DURASTEEL_PLATING = registerBlock("white_durasteel_plating",
            ()  -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(15f).explosionResistance(100f).requiresCorrectToolForDrops()), ModCreativeModeTab.ENERGIZED);

    public static final RegistryObject<Block> PINK_DURASTEEL_PLATING = registerBlock("pink_durasteel_plating",
            ()  -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(15f).explosionResistance(100f).requiresCorrectToolForDrops()), ModCreativeModeTab.ENERGIZED);

    public static final RegistryObject<Block> PURPLE_DURASTEEL_PLATING = registerBlock("purple_durasteel_plating",
            ()  -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(15f).explosionResistance(100f).requiresCorrectToolForDrops()), ModCreativeModeTab.ENERGIZED);

    public static final RegistryObject<Block> BLUE_DURASTEEL_PLATING = registerBlock("blue_durasteel_plating",
            ()  -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(15f).explosionResistance(100f).requiresCorrectToolForDrops()), ModCreativeModeTab.ENERGIZED);

    public static final RegistryObject<Block> LIME_DURASTEEL_PLATING = registerBlock("lime_durasteel_plating",
            ()  -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(15f).explosionResistance(100f).requiresCorrectToolForDrops()), ModCreativeModeTab.ENERGIZED);

    public static final RegistryObject<Block> GREEN_DURASTEEL_PLATING = registerBlock("green_durasteel_plating",
            ()  -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(15f).explosionResistance(100f).requiresCorrectToolForDrops()), ModCreativeModeTab.ENERGIZED);

    public static final RegistryObject<Block> DARK_GREEN_DURASTEEL_PLATING = registerBlock("dark_green_durasteel_plating",
            ()  -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(15f).explosionResistance(100f).requiresCorrectToolForDrops()), ModCreativeModeTab.ENERGIZED);

    public static final RegistryObject<Block> YELLOW_DURASTEEL_PLATING = registerBlock("yellow_durasteel_plating",
            ()  -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(15f).explosionResistance(100f).requiresCorrectToolForDrops()), ModCreativeModeTab.ENERGIZED);

    public static final RegistryObject<Block> RED_DURASTEEL_PLATING = registerBlock("red_durasteel_plating",
            ()  -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(15f).explosionResistance(100f).requiresCorrectToolForDrops()), ModCreativeModeTab.ENERGIZED);

    public static final RegistryObject<Block> MAGENTA_DURASTEEL_PLATING = registerBlock("magenta_durasteel_plating",
            ()  -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(15f).explosionResistance(100f).requiresCorrectToolForDrops()), ModCreativeModeTab.ENERGIZED);

    public static final RegistryObject<Block> BROWN_DURASTEEL_PLATING = registerBlock("brown_durasteel_plating",
            ()  -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(15f).explosionResistance(100f).requiresCorrectToolForDrops()), ModCreativeModeTab.ENERGIZED);

    public static final RegistryObject<Block> CYAN_DURASTEEL_PLATING = registerBlock("cyan_durasteel_plating",
            ()  -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(15f).explosionResistance(100f).requiresCorrectToolForDrops()), ModCreativeModeTab.ENERGIZED);


    //laser
public static final RegistryObject<Block> LASER_CONTROLLER = registerBlock("laser_controller",
        ()  -> new LaserController(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.ENERGIZED);

    public static final RegistryObject<Block> LASER_BARREL = registerBlock("laser_barrel",
            ()  -> new LaserBarrel(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.ENERGIZED);

    public static final RegistryObject<Block> LASER_COOLANT_INPUT = registerBlock("laser_coolant_input",
            ()  -> new LaserCoolantInput(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.ENERGIZED);







    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
    RegistryObject<T> toReturn = BLOCKS.register(name, block);
    registerBlockItem(name, toReturn, tab);
   return toReturn;
}





private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
CreativeModeTab tab) {
    return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties().tab(tab)));
}



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
