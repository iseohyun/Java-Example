package B_Layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class B_Border extends JFrame{
	JButton b1 = new JButton("1번 버튼");
	JButton b2 = new JButton("2번 버튼");
	JButton b3 = new JButton("3번 버튼");
	JButton b4 = new JButton("4번 버튼");
	JButton b5 = new JButton("5번 버튼");
	
	public B_Border() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout()); 
		
		add("North",b1);
		add("South",b2);
		add("East",b3);
		add("West",b4);
		add("Center",b5);
		
		setSize(300, 400);
		setVisible(true);
	}
	
	public static void main(String[] agrs) {
		new B_Border();
	}
}