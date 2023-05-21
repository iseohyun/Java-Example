package d_Graphic;

import java.awt.BasicStroke;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class C3_StrokeTypes extends Frame {
    public C3_StrokeTypes() {
        addWindowListener(new WindowExit(this));

        setVisible(true);
        setSize(300, 400);
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.setStroke(new BasicStroke(30, BasicStroke.CAP_ROUND, 0));
        g2.draw(new Line2D.Double(50, 50, 200, 50));

        g2.setStroke(new BasicStroke(30, 0, BasicStroke.JOIN_ROUND));
        g2.draw(new Rectangle2D.Double(50, 100, 50, 50));

        g2.setStroke(new BasicStroke(30, 0, BasicStroke.JOIN_BEVEL));
        g2.draw(new Rectangle2D.Double(150, 100, 50, 50));

        float[] dash = new float[] { 10, 5, 5, 5 };
        g2.setStroke(new BasicStroke(5, 0, BasicStroke.JOIN_MITER, 1.0f, dash, 0));
        g2.draw(new Rectangle2D.Double(50, 200, 150, 50));
    }

    public static void main(String[] args) {
        new C3_StrokeTypes();
    }
}