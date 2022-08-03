package dev.realz.swordsmod.swordeffects;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.TypedActionResult;

public class InfestedSword extends SwordItem {
    public InfestedSword(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 1, false, false));
        if (!MinecraftClient.getInstance().player.getItemCooldownManager().isCoolingDown(this)) {
            LightningEntity lightning = EntityType.LIGHTNING_BOLT.create(attacker.world);
            lightning.setPos(target.getX(), target.getY(), target.getZ());
            attacker.world.spawnEntity(lightning);
            assert MinecraftClient.getInstance().player != null;
            MinecraftClient.getInstance().player.getItemCooldownManager().set(this, 200);
            TypedActionResult.success(MinecraftClient.getInstance().player.getStackInHand(attacker.getActiveHand()));
            return true;
        }
        TypedActionResult.fail(MinecraftClient.getInstance().player.getStackInHand(attacker.getActiveHand()));
        return true;
    }
}
