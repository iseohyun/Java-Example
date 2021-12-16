package a_Basic;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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

@SuppressWarnings("serial")
public class D2_Exit extends Frame {
	public D2_Exit() {
		addWindowListener(new WindowExit(this));

		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new D2_Exit();
	}
}