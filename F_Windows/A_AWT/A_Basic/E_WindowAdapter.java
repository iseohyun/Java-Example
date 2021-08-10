package A_Basic;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class WindowExit extends WindowAdapter{
	private Frame f;
	
	WindowExit(Frame f){
		this.f = f;
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		f.dispose();
	}
}

public class E_WindowAdapter extends Frame{
	public E_WindowAdapter() {
		addWindowListener(new WindowExit(this));
		
		setSize(300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new E_WindowAdapter();
	}
}
