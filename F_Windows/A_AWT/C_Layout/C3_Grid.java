package C_Layout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class C3_Grid extends Frame{
	Button b1, b2, b3, b4, b5;
	
	public C3_Grid() {
		setLayout(new GridLayout(2,3)); 
		
		b1 = new Button("1�� ��ư");
		b2 = new Button("2�� ��ư");
		b3 = new Button("3�� ��ư");
		b4 = new Button("4�� ��ư");
		b5 = new Button("5�� ��ư");
		
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
		new C3_Grid();
	}
}
