package D_2D;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class C2_LineTo extends JFrame {
	public C2_LineTo() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300, 400);
	}

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		GeneralPath gp = new GeneralPath();
		gp.moveTo(150, 50);
		g.drawString("1", 150, 50);

		gp.lineTo(150, 250);
		g.drawString("2", 150, 250);

		gp.lineTo(50, 150);
		g.drawString("3", 50, 150);

		gp.lineTo(250, 150);
		g.drawString("4", 250, 150);

		gp.moveTo(50, 50);
		g.drawString("5", 50, 50);

		gp.lineTo(250, 250);
		g.drawString("6", 250, 250);

		gp.closePath();
		g2.draw(gp);
	}

	public static void main(String[] args) {
		new C2_LineTo();
	}
}