package A_Components;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class G_Layout extends Frame{
	Button b1, b2, b3, b4, b5;
	
	public G_Layout() {
		setLayout(new FlowLayout()); 
		
		b1 = new Button("1�� ��ư");
		b2 = new Button("2�� ��ư");
		b3 = new Button("3�� ��ư");
		b4 = new Button("4�� ��ư");
		b5 = new Button("5�� ��ư");
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
	}
	
	public static void main(String[] agrs) {
		G_Layout lo = new G_Layout();
		lo.setSize(300, 400);
		lo.setVisible(true);
	}
}
