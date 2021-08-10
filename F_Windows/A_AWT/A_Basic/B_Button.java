package A_Basic;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class B_Button extends Frame{
	private Button b;
	B_Button(){
		b = new Button("¸¶Ä§");

		setLayout(new FlowLayout());
		add(b);
		
		setSize(300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new B_Button();
	}
}
