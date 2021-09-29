package A_Component;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

@SuppressWarnings("serial")
public class K2_LayerPanel extends JFrame {
	public K2_LayerPanel() {
		JLayeredPane jp = getLayeredPane();

		JButton bt1 = new JButton();
		bt1.setBackground(Color.red);
		bt1.setBounds(10, 10, 60, 60);
		jp.add(bt1, 0);

		JButton bt2 = new JButton();
		bt2.setBackground(Color.orange);
		bt2.setBounds(30, 30, 60, 60);
		jp.add(bt2, 100);

		JButton bt3 = new JButton();
		bt3.setBackground(Color.yellow);
		bt3.setBounds(50, 50, 60, 60);
		jp.add(bt3, 100);

		JButton bt4 = new JButton();
		bt4.setBackground(Color.green);
		bt4.setBounds(70, 70, 60, 60);
		jp.add(bt4, 100);

		JButton bt5 = new JButton();
		bt5.setBackground(Color.blue);
		bt5.setBounds(90, 90, 60, 60);
		jp.add(bt5, 100);

		JButton bt6 = new JButton();
		bt6.setBackground(Color.magenta);
		bt6.setBounds(110, 110, 60, 60);
		jp.add(bt6, 100);

		setSize(300, 300);
		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new K2_LayerPanel();
	}
}