package b_Component;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class A_Label extends Frame {
	private Label lab1 = new Label("첫번째 라벨");

	A_Label() {
		add(lab1);

		addWindowListener(new WindowExit(this));

		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new A_Label();
	}
}

class WindowExit extends WindowAdapter {
	private Frame f;

	WindowExit(Frame f) {
		this.f = f;
	}

	@Override
	public void windowClosing(WindowEvent e) {
		f.dispose();
	}
}