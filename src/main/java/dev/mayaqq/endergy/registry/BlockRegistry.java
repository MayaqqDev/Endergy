package dev.mayaqq.endergy.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockRegistry {
    public static final Block DRAGONIAN_GENERATOR = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static void register() {
        Registry.register(Registries.BLOCK, new Identifier("endergy", "dragonian_generator"), DRAGONIAN_GENERATOR);
        Registry.register(Registries.ITEM, new Identifier("endergy", "dragonian_generator"), new BlockItem(DRAGONIAN_GENERATOR, new FabricItemSettings()));
    }
}
