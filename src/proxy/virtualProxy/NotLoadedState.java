package proxy.virtualProxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class NotLoadedState implements ImageState {

    private final ImageProxy proxy;

    private final URL url;

    private boolean retrieving = false;

    private volatile ImageIcon imageIcon;

    private Thread retrievingThread;

    public NotLoadedState(ImageProxy proxy, URL url) {
        this.proxy = proxy;
        this.url = url;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.drawString("Loading CD cover,please wait...", x + 300, y + 190);
        if (!retrieving) {
            retrieving = true;
            retrievingThread = new Thread(() -> {
                this.imageIcon = new ImageIcon(url);
                proxy.setState(new LoadedImageIconState(imageIcon));
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ignored) {
                }
                c.repaint();
            });
            retrievingThread.start();
        }

    }

    @Override
    public int getIconWidth() {
        return 800;
    }

    @Override
    public int getIconHeight() {
        return 600;
    }
}
