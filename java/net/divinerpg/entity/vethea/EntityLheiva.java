package net.divinerpg.entity.vethea;

import net.divinerpg.Sounds;
import net.divinerpg.api.entity.EntityDivineRPGMob;
import net.divinerpg.helper.items.VetheanItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityLheiva extends EntityDivineRPGMob {
	
    private static final double spawnLayer = 3;

    public EntityLheiva(World var1) {
        super(var1);
        addAttackingAI();
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(net.divinerpg.api.entity.EntityStats.lheviaHealth);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(net.divinerpg.api.entity.EntityStats.lheviaDamage);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(net.divinerpg.api.entity.EntityStats.lheviaSpeed);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(net.divinerpg.api.entity.EntityStats.lheviaFollowRange);
    }

    @Override
    public boolean getCanSpawnHere() {
        return this.posY < 64.0D * spawnLayer  && this.posY > 64.0D * (spawnLayer - 1) && super.getCanSpawnHere();
    }

    @Override
    protected float getSoundVolume() {
        return 0.7F;
    }

    @Override
    protected String getLivingSound() {
        return Sounds.lhevia.getPrefixedName();
    }

    @Override
    protected String getHurtSound() {
        return Sounds.lheviaHurt.getPrefixedName();
    }

    @Override
    protected String getDeathSound() {
        return getHurtSound();
    }
    
    @Override
    public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
        Entity var1 = par1DamageSource.getEntity();
        if (var1 != null && var1 instanceof EntityPlayer) {
            if (((EntityPlayer)var1).inventory.hasItem(VetheanItems.heviaBelt))
                return super.attackEntityFrom(par1DamageSource, par2);
        }
        return false;
    }

    @Override
    protected void dropFewItems(boolean par1, int par2) {
        this.dropItem(VetheanItems.polishedPearls, 1);
    }

	@Override
	public String mobName() {
		return "Lheiva";
	}
}