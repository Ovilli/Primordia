package net.ovilli.primordia.items;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class PRModFoodComponents {
    public static final FoodComponent FRUIT_BOWL = new FoodComponent.Builder().nutrition(3).saturationModifier(0.95f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1200), 1f).build();

    public static final FoodComponent DRIED_MAMMOTH_MEAT = new FoodComponent.Builder().nutrition(3).saturationModifier(0.95f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1200), 1f).build();
    public static final FoodComponent COOKED_MAMMOTH_MEAT = new FoodComponent.Builder().nutrition(3).saturationModifier(0.95f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1200), 1f).build();
    public static final FoodComponent RAW_MAMMOTH_MEAT = new FoodComponent.Builder().nutrition(3).saturationModifier(0.95f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1200), 1f).build();

    public static final FoodComponent HONEY_BERRY = new FoodComponent.Builder().nutrition(2).saturationModifier(0.15f)
            .snack().build();

}