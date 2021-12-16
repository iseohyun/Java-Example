package d_Graphic;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class F_Transform extends JFrame implements KeyListener {
	int BasicX = 100, BasixY = 100;
	Graphics2D g2;

	public F_Transform() {
		setTitle("방향키를 이용해서 움직여보세요");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		addKeyListener(this);

		setVisible(true);
		setSize(400, 300);
	}

	public void paint(Graphics g) {
		g2 = (Graphics2D) g;
		g2.clearRect(0, 0, getWidth(), getHeight());

		g2.translate(BasicX, BasixY);

		g2.draw(new Line2D.Float(-100, 0, 100, 0));
		g2.draw(new Line2D.Float(0, -100, 0, 100));
		g2.fill(new Ellipse2D.Float(50, 50, 20, 20));
	}

	public static void main(String[] args) {
		new F_Transform();
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
		case 37: // left
			g2.translate(--BasicX, BasixY);
			break;
		case 38: // up
			g2.translate(BasicX, --BasixY);
			break;
		case 39: // right
			g2.translate(++BasicX, BasixY);
			break;
		case 40: // down
			g2.translate(BasicX, ++BasixY);
			break;
		}

		repaint();
	}
}