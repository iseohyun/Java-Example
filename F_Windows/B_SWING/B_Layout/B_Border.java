package B_Layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class B_Border extends JFrame{
	JButton b1 = new JButton("1�� ��ư");
	JButton b2 = new JButton("2�� ��ư");
	JButton b3 = new JButton("3�� ��ư");
	JButton b4 = new JButton("4�� ��ư");
	JButton b5 = new JButton("5�� ��ư");
	
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