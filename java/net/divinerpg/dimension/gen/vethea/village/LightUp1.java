/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package net.divinerpg.dimension.gen.vethea.village;
import java.util.Random;

import net.divinerpg.entity.vethea.EntityHungerHungry;
import net.divinerpg.helper.blocks.VetheaBlocks;
import net.minecraft.entity.EntityLiving;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class LightUp1 extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
		};
	}

	public LightUp1() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {
		
		EntityLiving entity = new EntityHungerHungry(world);
		entity.setLocationAndAngles(i+ 0F, j +1.0F, k+0F, 0.0F, 0.0F);
		world.spawnEntityInWorld(entity);
		
		world.setBlock(i + 0, j + 2, k + 2, VetheaBlocks.firelight);
		world.setBlock(i + 1, j + 0, k + 2, VetheaBlocks.darkEverstone);
		world.setBlock(i + 1, j + 2, k + 2, VetheaBlocks.darkEverstone);
		world.setBlock(i + 1, j + 4, k + 2, VetheaBlocks.firelight);
		world.setBlock(i + 2, j + 0, k + 1, VetheaBlocks.darkEverstone);
		world.setBlock(i + 2, j + 0, k + 2, VetheaBlocks.darkEverstone);
		world.setBlock(i + 2, j + 0, k + 3, VetheaBlocks.darkEverstone);
		world.setBlock(i + 2, j + 1, k + 2, VetheaBlocks.darkEverstone);
		world.setBlock(i + 2, j + 2, k + 0, VetheaBlocks.firelight);
		world.setBlock(i + 2, j + 2, k + 1, VetheaBlocks.darkEverstone);
		world.setBlock(i + 2, j + 2, k + 2, VetheaBlocks.darkEverstone);
		world.setBlock(i + 2, j + 2, k + 3, VetheaBlocks.darkEverstone);
		world.setBlock(i + 2, j + 2, k + 4, VetheaBlocks.firelight);
		world.setBlock(i + 2, j + 3, k + 2, VetheaBlocks.darkEverstone);
		world.setBlock(i + 2, j + 4, k + 1, VetheaBlocks.firelight);
		world.setBlock(i + 2, j + 4, k + 2, VetheaBlocks.darkEverstone);
		world.setBlock(i + 2, j + 4, k + 3, VetheaBlocks.firelight);
		world.setBlock(i + 2, j + 5, k + 2, VetheaBlocks.darkEverstone);
		world.setBlock(i + 2, j + 6, k + 2, VetheaBlocks.firelight);
		world.setBlock(i + 3, j + 0, k + 2, VetheaBlocks.darkEverstone);
		world.setBlock(i + 3, j + 2, k + 2, VetheaBlocks.darkEverstone);
		world.setBlock(i + 3, j + 4, k + 2, VetheaBlocks.firelight);
		world.setBlock(i + 4, j + 2, k + 2, VetheaBlocks.firelight);

		return true;
	}
}