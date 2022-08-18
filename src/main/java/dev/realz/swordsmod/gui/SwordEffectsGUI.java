package dev.realz.swordsmod.gui;

import dev.realz.swordsmod.swordeffects.SwordVariables;
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

        WToggleButton toggleButton = new WToggleButton(Text.literal("Slowness Toggle"));
        toggleButton.setOnToggle(on -> {
            SwordVariables.SLOWNESS = !SwordVariables.SLOWNESS;
            System.out.println(SwordVariables.SLOWNESS);
        });

        root.add(toggleButton, 0, 0);
        root.validate(this);
    }
}
