package com.apowillow.fireworkfrenzy.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.effect.EnchantmentEffectTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Rarity;

public class AirStrikeEnchantment extends Enchantment {
	public AirStrikeEnchantment() {
		super(Rarity.UNCOMMON, EnchantmentEffectTarget., new EquipmentSlot[] {EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND});
	}

	@Override
	public int getMinPower(int level) {
		return 23;
	}

	@Override
	public int getMaxLevel() {
		return 1;
	}

	@Override
	protected boolean canAccept(Enchantment other) {
		return other != Enchantments.QUICK_CHARGE && super.canAccept(other);
	}
}
