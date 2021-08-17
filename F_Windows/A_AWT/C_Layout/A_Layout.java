package C_Layout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class A_Layout extends Frame{
	Button b1 = new Button("1�� ��ư");
	Button b2 = new Button("2�� ��ư");
	Button b3 = new Button("3�� ��ư");
	Button b4 = new Button("4�� ��ư");
	Button b5 = new Button("5�� ��ư");
	
	public A_Layout() {
		setLayout(new FlowLayout()); 
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		
		addWindowListener(new WindowExit(this));
		
		setSize(300, 400);
		setVisible(true);
	}
	
	public static void main(String[] agrs) {
		new A_Layout();
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