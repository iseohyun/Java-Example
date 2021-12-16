package d_Graphic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.QuadCurve2D;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class A2_DrawCurve extends JFrame {
	A2_DrawCurve() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setSize(300, 450);
		setVisible(true);
	}

	public void paint(Graphics g) {
		int grid = 50;
		int height = getSize().height;
		int width = getSize().width;
		g.setColor(Color.LIGHT_GRAY);
		for (int i = grid; i < width; i += grid) {
			g.drawString(Integer.toString(i).concat("-x"), i, 50);
			g.drawLine(i, 0, i, height);
		}
		for (int i = grid; i < height; i += grid) {
			g.drawString(Integer.toString(i).concat("-y"), 10, i);
			g.drawLine(0, i, width, i);
		}
		g.setColor(Color.black);

		Graphics2D g2 = (Graphics2D) g;

		QuadCurve2D q = new QuadCurve2D.Float();

		q.setCurve(60, 60, 70, 90, 120, 60);
		g2.draw(q);
	}

	public static void main(String[] args) {
		new A2_DrawCurve();
	}
}