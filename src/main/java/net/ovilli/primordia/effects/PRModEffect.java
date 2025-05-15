package net.ovilli.primordia.effects;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.ovilli.primordia.Primordia;

public class PRModEffect {
    public static final RegistryEntry<StatusEffect> TRAUMA = registerStatusEffect("trauma",
            new PRModTraumaEffect(StatusEffectCategory.NEUTRAL, 0x36ebab)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED,
                            Identifier.of(Primordia.MOD_ID, "trauma"), -0.25f,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));


    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(Primordia.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        Primordia.LOGGER.info("Registering Mod Effects for " + Primordia.MOD_ID);
    }
}
