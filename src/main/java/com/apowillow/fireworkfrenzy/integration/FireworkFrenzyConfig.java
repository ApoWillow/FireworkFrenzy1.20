package com.apowillow.fireworkfrenzy.integration;

import eu.midnightdust.lib.config.MidnightConfig;

public class FireworkFrenzyConfig extends MidnightConfig {
	@Entry public static int airStrikeJumpingChargeTime = 3;
	@Entry public static int airStrikeGroundedChargeTime = 40;
	@Entry public static float mobDamage = 3F;
	@Entry public static float playerDamage = 3F;
	@Entry public static double rocketJumpMultiplier = 1D;
	@Entry public static double otherEntityKnockBack = 0.5D;
	@Entry public static double airStrafingMultiplier = 3D;
	@Entry public static double airStrikeDamageMultiplier = 0.5;
	@Entry public static boolean showTooltip = true;
	@Entry public static boolean allowRocketJumping = true;
	@Entry public static boolean useRocketsFromInv = true;
	@Entry public static boolean elytraCancelsRocketJumping = true;
	@Entry public static boolean boostsCancelRocketJumping = true;
	@Entry public static boolean crossbowsGetInfinity = true;
	@Entry public static boolean infinityAffectsRockets = true;
}
