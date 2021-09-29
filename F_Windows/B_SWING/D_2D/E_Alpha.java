package D_2D;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class E_Alpha extends JFrame {
	public E_Alpha() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 300);
	}

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setPaint(Color.red);
		g2.fill(new Ellipse2D.Float(50, 50, 100, 100));
		g2.setPaint(Color.blue);
		for (float i = 0.0f; i <= 1.0f; i += 0.01f) {
			g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, i));
			g2.fill(new Ellipse2D.Float(100, 50, 100, 100));
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {
		new E_Alpha();
	}
}