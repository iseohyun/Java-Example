package B_Component;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class G3_Grid extends Frame{
	Button b1, b2, b3, b4, b5;
	
	public G3_Grid() {
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
	}
	
	public static void main(String[] agrs) {
		G3_Grid lo = new G3_Grid();
		lo.setSize(300, 400);
		lo.setVisible(true);
	}
}
