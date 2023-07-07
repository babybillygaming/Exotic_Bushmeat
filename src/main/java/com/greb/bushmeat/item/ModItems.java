package com.greb.bushmeat.item;

import com.greb.bushmeat.bushmeat;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, bushmeat.MOD_ID);
    public static final RegistryObject<Item> AXOLOTL_LEG = ITEMS.register("axolotl_leg", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.COOKED_AXOLOTL_LEG)));
    public static final RegistryObject<Item> COOKED_AXOLOTL_LEG = ITEMS.register("cooked_axolotl_leg", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.COOKED_AXOLOTL_LEG)));
    public static final RegistryObject<Item> FRIED_AXOLOTL_LEG = ITEMS.register("fried_axolotl_leg", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.FRIED_AXOLOTL_LEG)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
