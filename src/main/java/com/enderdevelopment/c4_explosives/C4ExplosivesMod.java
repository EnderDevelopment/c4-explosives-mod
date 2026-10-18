package com.enderdevelopment.c4_explosives;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.Registry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;

public class C4ExplosivesMod implements ModInitializer {
    public static final String MOD_ID = "c4_explosives";

    // Items
    public static final Item C4_EXPLOSIVE = new Item(new Item.Properties());
    public static final Item PORTABLE_C4 = new Item(new Item.Properties());

    // Blocks
    public static final Block C4_BLOCK = new Block(Block.Properties.of().strength(1.0f));

    // Block Entities
    public static final BlockEntityType<C4BlockEntity> C4_BLOCK_ENTITY = BlockEntityType.Builder.of(C4BlockEntity::new, C4_BLOCK).build(null);

    // Menu Types
    public static final MenuType<C4Menu> C4_MENU = new MenuType<>(C4Menu::new, ResourceLocation.tryParse(MOD_ID + ":c4_menu"));

    @Override
    public void onInitialize() {
        // Register items
        Registry.register(Registries.ITEM, ResourceLocation.tryParse(MOD_ID + ":c4_explosive"), C4_EXPLOSIVE);
        Registry.register(Registries.ITEM, ResourceLocation.tryParse(MOD_ID + ":portable_c4"), PORTABLE_C4);

        // Register blocks
        Registry.register(Registries.BLOCK, ResourceLocation.tryParse(MOD_ID + ":c4_block"), C4_BLOCK);

        // Register block entities
        Registry.register(Registries.BLOCK_ENTITY_TYPE, ResourceLocation.tryParse(MOD_ID + ":c4_block_entity"), C4_BLOCK_ENTITY);

        // Register menu types
        Registry.register(Registries.MENU, ResourceLocation.tryParse(MOD_ID + ":c4_menu"), C4_MENU);

        // Add items to creative tab
        CreativeModeTabs.register(CreativeModeTabs.BUILDING_BLOCKS, builder -> builder.accept(C4_BLOCK));
        CreativeModeTabs.register(CreativeModeTabs.TOOLS_AND_UTILITIES, builder -> builder.accept(C4_EXPLOSIVE));
        CreativeModeTabs.register(CreativeModeTabs.TOOLS_AND_UTILITIES, builder -> builder.accept(PORTABLE_C4));
    }
}