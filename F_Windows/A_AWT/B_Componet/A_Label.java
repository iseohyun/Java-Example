package B_Componet;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class A_Label extends Frame{
	private static final long serialVersionUID = 1L;
	private Label lab1 = new Label("ù��° ��");
	
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