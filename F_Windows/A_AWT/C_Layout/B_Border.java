package C_Layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

@SuppressWarnings("serial")
public class B_Border extends Frame{
	Button b1 = new Button("1번 버튼");
	Button b2 = new Button("2번 버튼");
	Button b3 = new Button("3번 버튼");
	Button b4 = new Button("4번 버튼");
	Button b5 = new Button("5번 버튼");
	
	public B_Border() {
		setLayout(new BorderLayout()); 
		
		add("North",b1);
		add("South",b2);
		add("East",b3);
		add("West",b4);
		add("Center",b5);
		
		addWindowListener(new WindowExit(this));
		
		setSize(300, 400);
		setVisible(true);
	}
	
	public static void main(String[] agrs) {
		new B_Border();
	}
}