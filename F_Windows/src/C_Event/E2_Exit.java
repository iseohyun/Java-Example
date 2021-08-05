package C_Event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
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

public class E2_Exit extends Frame{
	private TextField tf;

	public E2_Exit() {
		tf = new TextField("우상단 X 클릭시 종료");
		
		add("North", tf);
		
		addWindowListener(new WindowExit(this));
	}
	
	public static void main(String [] args) {
		E2_Exit ex = new E2_Exit();
		ex.setSize(300, 400);
		ex.setVisible(true);
	}
}
