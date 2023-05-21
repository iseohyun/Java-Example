/*
 * 클릭된 위치 정보를 가져와서, 이전 클릭된 위치까지 선을 긋습니다.
 */
package d_Graphic;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class C2_LineTo2 extends Frame {
    static int x, y, ox, oy;
    boolean isStart = false;

    public C2_LineTo2() {
        addWindowListener(new WindowExit(this));

        setVisible(true);
        setSize(300, 400);

        Graphics g = getGraphics();

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                printXY();

                if (isStart) {
                    g.drawLine(ox, oy, x, y);

                    ox = x;
                    oy = y;
                } else {
                    ox = e.getX();
                    oy = e.getY();
                    isStart = true;
                }
            }
        });

    }

    public static void main(String[] args) {
        new C2_LineTo2();
    }

    static void printXY() {
        System.out.println("(" + ox + ", " + oy + ") -> (" + x + ", " + y + ")");
    }
}