package net.divinerpg.api.items;

import java.util.List;

import net.divinerpg.DivineRPGAchievements;
import net.divinerpg.Reference;
import net.divinerpg.helper.Util;
import net.divinerpg.helper.items.ItemsFood;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemModFood extends ItemFood {

    protected String name;

    public ItemModFood(int food, float sat, boolean wolfFood, String name) {
        super(food, sat, wolfFood);
        this.name = name;
        setCreativeTab(DivineRPGTabs.food);
        setTextureName(Reference.PREFIX + name);
        setUnlocalizedName(name);
        GameRegistry.registerItem(this, name);
        LangRegistry.addItem(this);
    }

    public ItemModFood(String name, int food, float sat, boolean wolfFood, int potionID, int potionDuration, int potionAmplifier, float potionEffectProbability) {
        this(food, sat, wolfFood, name);
        setPotionEffect(potionID, potionDuration, potionAmplifier, potionEffectProbability);
    }
    
    @Override
    public ItemStack onEaten(ItemStack item, World world, EntityPlayer player) {
    	super.onEaten(item, world, player);
    	if(item.getItem() == ItemsFood.chickenDinner)
    		player.triggerAchievement(DivineRPGAchievements.mealToRemember);
    	return item;
    }

    protected int getHealAmount(ItemStack stack) {
        return func_150905_g(stack);
    }

    protected float getSaturation(ItemStack stack) {
        return func_150906_h(stack);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        list.add("Fills " + (double) getHealAmount(stack) / 2 + " Hunger Bars");
        list.add(getSaturation(stack) + " Saturation");
        list.add(!isWolfsFavoriteMeat() ? Util.BLUE + "Pet Food:" + EnumChatFormatting.RESET + " false"
                : Util.BLUE + "Pet Food:" + EnumChatFormatting.RESET + " true");
        list.add(Util.DARK_AQUA + Reference.MOD_NAME);
    }

}
