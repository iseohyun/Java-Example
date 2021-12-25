package d_Graphic;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class G_Buffer extends Frame implements ActionListener {
	Button b1 = new Button("바로 그리기");
	Button b2 = new Button("버퍼 사용하기");
	Graphics g;

	public G_Buffer() {
		addWindowListener(new WindowExit(this));
		setVisible(true);
		setSize(400, 300);

		setLayout(new FlowLayout());

		add(b1);
		add(b2);

		g = getGraphics();

		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	private void drawLines(Graphics g, Color color) {
		g.setColor(color);
		for (int i = 0; i < getHeight(); i++) {
			g.drawLine(0, i, getWidth(), i);
		}
	}

	private void drawOnFrame() {
		drawLines(g, Color.red);
	}

	private void drawOnBuffer() {
		Image buffer = createImage(getWidth() - 20, getHeight() - 80);
		Graphics g = buffer.getGraphics();
		drawLines(g, Color.blue);
		getGraphics().drawImage(buffer, 10, 70, this);
	}

	public static void main(String[] args) {
		new G_Buffer();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1)
			drawOnFrame();
		else if (e.getSource() == b2)
			drawOnBuffer();
	}
}