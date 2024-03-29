package d_Graphic;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Rectangle2D;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class D1_Fill extends Frame {
    Paint gPaint1, gPaint2, gPaint3, gPaint4;

    public D1_Fill() {
        addWindowListener(new WindowExit(this));

        setVisible(true);
        setSize(400, 300);

        gPaint1 = new GradientPaint(10, 50, Color.white, 20, 60, Color.blue, true);
        gPaint2 = new GradientPaint(100, 50, Color.white, 100, 30, Color.blue, true);
        gPaint3 = new GradientPaint(190, 50, Color.white, 270, 250, Color.blue, false);
        gPaint4 = new GradientPaint(280, 50, Color.white, 280, 250, Color.blue, false);
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.setPaint(gPaint1);
        g2.fill(new Rectangle2D.Double(10, 50, 80, 200));
        g2.setPaint(gPaint2);
        g2.fill(new Rectangle2D.Double(100, 50, 80, 200));
        g2.setPaint(gPaint3);
        g2.fill(new Rectangle2D.Double(190, 50, 80, 200));
        g2.setPaint(gPaint4);
        g2.fill(new Rectangle2D.Double(280, 50, 80, 200));
    }

    public static void main(String[] args) {
        new D1_Fill();
    }
}