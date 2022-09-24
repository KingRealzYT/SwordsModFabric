package dev.realz.swordsmod.gui;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.WPlainPanel;
import io.github.cottonmc.cotton.gui.widget.WToggleButton;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import net.minecraft.text.Text;

public class SwordEffectsGUI extends LightweightGuiDescription {
    public SwordEffectsGUI() {
        WPlainPanel root = new WPlainPanel();
        setRootPanel(root);
        root.setSize(120, 80);
        root.setInsets(Insets.ROOT_PANEL);

        WLabel label = new WLabel(Text.literal("Coming Soon!"));

        WToggleButton toggleButton = new WToggleButton(Text.literal("Slowness Toggle"));
        toggleButton.setOnToggle(on -> {
        });
        root.add(toggleButton, 0, 10);
        root.add(label, 25, 0);
        root.validate(this);
    }
}
