package a_Basic;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowExit extends WindowAdapter {
	private Frame f;

	public WindowExit(Frame f) {
		this.f = f;
	}

	@Override
	public void windowClosing(WindowEvent e) {
		f.dispose();
	}
}