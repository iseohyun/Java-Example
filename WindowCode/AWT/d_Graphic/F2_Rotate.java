package d_Graphic;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class F2_Rotate extends Frame implements KeyListener {
	int theta;
	Graphics2D g2;

	public F2_Rotate() {
		addWindowListener(new WindowExit(this));
		
		setTitle("�¿��ư�� �̿��ؼ� ȸ���غ�����");
		setVisible(true);
		setSize(300, 300);

		setLayout(new FlowLayout());

		addKeyListener(this);
	}

	public void paint(Graphics g) {
		if (g2 == null) {
			g2 = (Graphics2D) getGraphics();
			g2.translate(150, 150);
		}

		g2.rotate(Math.toRadians(theta));

		g2.clearRect(-100, -100, 200, 200);

		g2.draw(new Line2D.Float(-100, 0, 100, 0));

		g2.draw(new Line2D.Float(0, -100, 0, 100));

		g2.fill(new Ellipse2D.Float(50, 50, 20, 20));
	}

	public static void main(String[] args) {
		new F2_Rotate();
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
			theta = 15;
			break;
		case 39: // right
			theta = -15;
			break;
		}
		repaint();
	}
}

// �ǽ����� : ���ư��� �ӵ��� ������ ������.
// �ǽ����� : ���ư� ������ ����� ������.