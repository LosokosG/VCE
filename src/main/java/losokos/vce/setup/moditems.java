package losokos.vce.setup;

import losokos.vce.custom.CopperChestplateItem;
import losokos.vce.custom.CopperHelmetItem;
import losokos.vce.custom.EvolvingChestplateItem;
import losokos.vce.tools.ModArmorTier;
import losokos.vce.tools.ModItemTier;
import losokos.vce.vce;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, vce.MOD_ID);
    /*
     ======================
         WEAPONS & TOOLS
     ======================
    */
//COPPER PICKAXE
public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(ModItemTier.COPPER_PICKAXE, 2, 1f, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));
//COPPER SWORD
public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordItem(ModItemTier.COPPER_SWORD, 0, 3f, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
//COPPER SHOVEL
public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ShovelItem(ModItemTier.COPPER_SHOVEL, 1, 2f, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));
//COPPER HOE
public static final RegistryObject<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe", () -> new HoeItem(ModItemTier.COPPER_HOE, 1, 2f, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));
//COPPER AXE
public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(ModItemTier.COPPER_AXE, 1, 2f, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));

    /*
     ======================
            ARMOR
     ======================
    */

    //COPPER HELMET

    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet", () -> new CopperHelmetItem(ModArmorTier.COPPER, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    //COPPER CHEST PLATE

    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () -> new CopperChestplateItem(ModArmorTier.COPPER, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));


    //COPPER LEGGINGS

    public static final RegistryObject<ArmorItem> COPPER_LEGGINGS = ITEMS.register("copper_leggings", () -> new ArmorItem(ModArmorTier.COPPER, EquipmentSlot.LEGS,
            (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));

    //COPPER BOOTS

    public static final RegistryObject<ArmorItem> COPPER_BOOTS = ITEMS.register("copper_boots", () -> new ArmorItem(ModArmorTier.COPPER, EquipmentSlot.FEET,
            (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));


    /*
 ======================
        TESTING
 ======================
*/
    //COPPER LIGHTNING WAND

    public static final RegistryObject<Item> EVOLVING_CHESTPLATE = ITEMS.register("evolving_chestplate", () -> new EvolvingChestplateItem(ModArmorTier.COPPER, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
