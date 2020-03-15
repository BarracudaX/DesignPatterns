package proxy.virtualProxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class LoadedImageIconState implements ImageState {

    private volatile ImageIcon imageIcon;

    public LoadedImageIconState(ImageIcon imageIcon) {
       this.imageIcon = imageIcon;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        this.imageIcon.paintIcon(c, g, x, y);
    }

    @Override
    public int getIconWidth() {
        return this.imageIcon.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return this.imageIcon.getIconHeight();
    }
}
