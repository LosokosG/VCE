package losokos.vce.setup;

import java.util.function.Supplier;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;




public class ModArmorMaterial implements ArmorMaterial {

    private final int enchantablitity;
    private final int [] durability, damageReduction;
    private final float knockbackResistance, toughness;
    private String name;
    private final SoundEvent equipSound;
    private final Supplier<Ingredient> repairMaterial;

public ModArmorMaterial(int enchantablitity, int[] durability, int[] damageReduction,
          float knockbackResistance, float toughness, String name, SoundEvent equipSound,
          Supplier<Ingredient> repairMaterial){
    this.enchantablitity = enchantablitity;
    this.durability = durability;
    this.damageReduction = damageReduction;
    this.knockbackResistance = knockbackResistance;
    this.toughness = toughness;
    this.name = name;
    this.equipSound = equipSound;
    this.repairMaterial = repairMaterial;
}

    @Override
    public int getDurabilityForSlot(EquipmentSlot slot) {
        return this.durability[slot.getIndex()];
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slot) {
        return this.damageReduction[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantablitity;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }}


