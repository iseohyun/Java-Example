package D_2D;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class A2_MouseDraw extends JFrame {
	int x, y, ox, oy;

	A2_MouseDraw() {
		setSize(300, 400);
		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Graphics g = getGraphics();
		System.out.println(g);

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
		new A2_MouseDraw();
	}
}