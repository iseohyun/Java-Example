package D_2D;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class F3_Scale extends JFrame implements ActionListener {
	double scale = 1;

	JButton flipX = new JButton("x축 반전");
	JButton flipY = new JButton("y축 반전");
	JButton scaleUp = new JButton("2배 확대");
	JButton scaleDown = new JButton("1/2로 축소");

	Graphics2D g2;

	public F3_Scale() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 300);

		setLayout(new FlowLayout());

		add(flipX);
		add(flipY);
		add(scaleUp);
		add(scaleDown);

		flipX.addActionListener(this);
		flipY.addActionListener(this);
		scaleUp.addActionListener(this);
		scaleDown.addActionListener(this);
	}

	public void paint(Graphics g) {
		if (g2 == null) {
			g2 = (Graphics2D) getGraphics();
			g2.translate(150, 200);
		}

		System.out.println(g2);
		g2.clearRect(-100, -100, 200, 200);
		g2.draw(new Line2D.Float(-100, 0, 100, 0));
		g2.draw(new Line2D.Float(0, -100, 0, 100));
		g2.fill(new Ellipse2D.Float(50, 50, 20, 20));
	}

	public static void main(String[] args) {
		new F3_Scale();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == flipX)
			g2.scale(1, -1); // 좌표계를 x축을 중심으로 반전한다
		else if (e.getSource() == flipY)
			g2.scale(-1, 1); // 좌표계를 y축을 중심으로 반전한다.
		else if (e.getSource() == scaleUp)
			g2.scale(2, 2); // 좌표계를 2배 확대한다.
		else if (e.getSource() == scaleDown)
			g2.scale(0.5, 0.5); // 좌표계를 1/2로 축소한다.
		repaint();
	}
}