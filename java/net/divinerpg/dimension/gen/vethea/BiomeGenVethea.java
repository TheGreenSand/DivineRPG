package net.divinerpg.dimension.gen.vethea;

import net.divinerpg.helper.blocks.VetheaBlocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenVethea extends BiomeGenBase {
	
    public BiomeGenVethea(int var1) {
        super(var1);
        this.setBiomeName("Vethea");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.topBlock = VetheaBlocks.dreamGrass;
        this.fillerBlock = VetheaBlocks.dreamDirt;
    }
}