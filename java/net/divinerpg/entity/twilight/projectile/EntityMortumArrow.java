package net.divinerpg.entity.twilight.projectile;

import net.divinerpg.api.entity.EntityModArrow;
import net.divinerpg.helper.items.TwilightItemsWeapons;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityMortumArrow extends EntityModArrow{

	private static Item arrow = TwilightItemsWeapons.mortumArrow;
	private static double damage = 61.0D;
	
	public EntityMortumArrow(World par1World) {
		super(par1World, damage, arrow);
	}
	
	public EntityMortumArrow(World par1World, double par2, double par4, double par6) {
        super(par1World, par2, par4, par6, damage, arrow);
    }
    
    public EntityMortumArrow(World par1World, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase, float par4, float par5)  {
        super(par1World, par2EntityLivingBase, par3EntityLivingBase, par4, par5, damage, arrow);
    }

    public EntityMortumArrow(World par1World, EntityLivingBase par2EntityLivingBase, float par3) {
        super(par1World, par2EntityLivingBase, par3, damage, arrow);
    }
}