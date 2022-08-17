package dev.realz.swordsmod.init;

import dev.realz.swordsmod.gui.SwordEffectsGUI;
import io.github.cottonmc.cotton.gui.client.CottonClientScreen;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;

public class ModKeybinds {

    public static void registerKeys() {
        KeyBinding abilityKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.rswords.abilities",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_R,
                "category.rswords.swordsmod"
        ));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (abilityKey.wasPressed()) {
                MinecraftClient.getInstance().setScreen(new CottonClientScreen(new SwordEffectsGUI()));
                client.player.sendMessage(Text.literal("You've pressed the key!"), false);
            }
        });
    }
}
