package dev.realz.swordsmod.gui;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WToggleButton;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import net.minecraft.text.Text;

public class SwordEffectsGUI extends LightweightGuiDescription {
    public SwordEffectsGUI() {
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(256, 240);
        root.setInsets(Insets.ROOT_PANEL);

        WToggleButton toggleButton = new WToggleButton(Text.literal("This is a toggle button."));
        toggleButton.setOnToggle(on -> {
            // This code runs on the client when you toggle the button.
            System.out.println("Toggle button toggled to " + (on ? "on" : "off"));
        });

        root.validate(this);
    }
}
