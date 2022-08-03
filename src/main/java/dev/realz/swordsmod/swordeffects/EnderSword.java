package dev.realz.swordsmod.swordeffects;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class EnderSword extends SwordItem {
    public EnderSword(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (user.getInventory().getSlotWithStack(new ItemStack(Items.ENDER_PEARL)) != -1) {
            if (!user.getItemCooldownManager().isCoolingDown(this)) {
                EnderPearlEntity enderPearl = new EnderPearlEntity(world, user);
                enderPearl.setPos(user.getX(), user.getEyeY(), user.getZ());
                enderPearl.setVelocity(user, user.getPitch(), user.getHeadYaw(), 0.0F, 1.5F, 1F);
                user.world.spawnEntity(enderPearl);
                enderPearl.setOwner(user);
                Inventory inv = user.getInventory();
                if (!user.isCreative()) {
                    for (int i = 0; i < inv.size(); i++) {
                        if (inv.getStack(i).getItem().equals(Items.ENDER_PEARL)) {
                            inv.removeStack(i, 1);
                        }
                    }
                }
                user.getItemCooldownManager().set(this, 200);
                TypedActionResult.success(MinecraftClient.getInstance().player.getStackInHand(user.getActiveHand()));
            }
        }
        return TypedActionResult.fail(MinecraftClient.getInstance().player.getStackInHand(user.getActiveHand()));
    }
}
