package proxy.virtualProxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {

    private volatile ImageState state;

    public ImageProxy(URL url) {
        this.state = new NotLoadedState(this,url);
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        state.paintIcon(c,g,x,y);
    }

    @Override
    public int getIconWidth() {
        return state.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return state.getIconHeight();
    }

    public void setState(ImageState state) {
        this.state = state;
    }
}
