package d_Graphic;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Ellipse2D;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class B4_SetClip extends Frame {
    Image img;
    final String IMAGE_NAME = "source/cat.jpg";

    Graphics2D g2;

    public B4_SetClip() {
        addWindowListener(new WindowExit(this));

        setVisible(true);
        setSize(350, 350);

        try {
            String path = getClass().getResource("").getPath();
            System.out.println(path);
            path = path.substring(0, path.indexOf("bin")).concat(IMAGE_NAME);
            System.out.println(path);
            img = getToolkit().getImage(path);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void paint(Graphics g) {
        g.translate(-100, -50);

        g.setClip(new Ellipse2D.Float(150, 100, 220, 260));
        g.drawImage(img, 0, 0, this);
    }

    public static void main(String[] args) {
        new B4_SetClip();
    }
}