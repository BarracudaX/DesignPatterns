package proxy.virtualProxy;

import javax.swing.*;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URL;

public class TestApp extends JFrame {

    private final JPanel mainPanel = new JPanel();

    public TestApp() throws MalformedURLException {
        init();
    }

    private void init() throws MalformedURLException {
        Icon imageIcon = new ImageProxy(new URL("http://images.amazon.com/images/P/B000005IRM.01.LZZZZZZZ.jpg"));
        ImageComponent imageComponent = new ImageComponent(imageIcon);
        getContentPane().add(imageComponent);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1200,900);
    }

    public static void main(String[] args) throws MalformedURLException {
        TestApp app = new TestApp();
    }

}
