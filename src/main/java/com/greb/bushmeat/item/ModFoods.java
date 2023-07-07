package com.greb.bushmeat.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties AXOLOTL_LEG = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.2F).build();
    public static final FoodProperties COOKED_AXOLOTL_LEG = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).build();
    public static final FoodProperties FRIED_AXOLOTL_LEG = (new FoodProperties.Builder()).nutrition(10).saturationMod(1.0F).build();
}
