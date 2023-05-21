/*
 * 마우스를 드레그하면, 따라서 선을 그립니다.
 * 
 */

package d_Graphic;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class A3_MouseDraw extends Frame {
    int x, y, ox, oy;

    A3_MouseDraw() {
        addWindowListener(new WindowExit(this));

        setSize(300, 400);
        setVisible(true);

        Graphics g = getGraphics();

        g.setColor(Color.red);

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                g.drawLine(ox, oy, x, y);

                ox = x;
                oy = y;
            }
        });

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                ox = e.getX();
                oy = e.getY();
            }
        });
    }

    public static void main(String[] args) {
        new A3_MouseDraw();
    }
}