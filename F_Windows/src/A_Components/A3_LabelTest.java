package A_Components;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

class LabelTest02 extends Frame{
	private Label lab1, lab2, lab3;
	
	LabelTest02(){
		setLayout(new FlowLayout());
		lab1 = new Label("ù��° ��");
		lab2 = new Label("�ι�° ��");
		lab3 = new Label("����° ��");
		
		add(lab1);
		add(lab2);
		add(lab3);
		
		lab1.setBackground(Color.BLUE);
		lab2.setBackground(Color.RED);
		lab3.setBackground(Color.YELLOW);
		setBounds(300,400,800,600);
		setVisible(true);
	}	
}

public class A3_LabelTest {
	public static void main(String[] args) {
		LabelTest02 f = new LabelTest02();		
	}
}
