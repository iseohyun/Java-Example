package B_Component;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

class ButtonTest extends Frame{
	private Button b1, b2, b3;
	
	ButtonTest() {
		setLayout(new FlowLayout());
		b1 = new Button("ù��° ��");
		b2 = new Button("�ι�° ��");
		b3 = new Button("����° ��");
		
		add(b1);
		add(b2);
		add(b3);
		
		b1.setBackground(Color.BLUE);
		b2.setBackground(Color.RED);
		b3.setBackground(Color.YELLOW);		
		setBounds(300,400,800,600);
		setVisible(true);
	}	
}

public class B1_Button {
	public static void main(String [] args) {
		ButtonTest f = new ButtonTest();	
	}
}
