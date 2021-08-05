package A_Components;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class G2_Border extends Frame{
	Button b1, b2, b3, b4, b5;
	
	public G2_Border() {
		setLayout(new BorderLayout()); 
		
		b1 = new Button("1번 버튼");
		b2 = new Button("2번 버튼");
		b3 = new Button("3번 버튼");
		b4 = new Button("4번 버튼");
		b5 = new Button("5번 버튼");
		
		add("North",b1);
		add("South",b2);
		add("East",b3);
		add("West",b4);
		add("Center",b5);
	}
	
	public static void main(String[] agrs) {
		G2_Border lo = new G2_Border();
		lo.setSize(300, 400);
		lo.setVisible(true);
	}
}
