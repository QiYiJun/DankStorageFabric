package tfar.dankstorage.client.button;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.network.chat.TextComponent;
import tfar.dankstorage.client.screens.PortableDankStorageScreen;
import tfar.dankstorage.utils.PickupMode;
import tfar.dankstorage.utils.Utils;

public class TripleToggleButton extends SmallButton {

    protected PortableDankStorageScreen screen;

    public TripleToggleButton(int x, int y, int widthIn, int heightIn, OnPress callback, PortableDankStorageScreen screen) {
        super(x, y, widthIn, heightIn, new TextComponent(""), callback);
        this.screen = screen;
    }

    @Override
    public void tint() {
        PickupMode mode = Utils.getPickupMode(screen.getMenu().bag);
        RenderSystem.setShaderColor(mode.r(), mode.g(), mode.b(), 1);
    }
}