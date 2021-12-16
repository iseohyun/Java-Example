package b_Layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class A2_Alignment extends JFrame {
	JPanel pn = new JPanel();
	JButton[] bt = new JButton[10];

	A2_Alignment() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		for (int i = 0; i < 10; i++) {
			bt[i] = new JButton("Button" + i);
			pn.add(bt[i]);
		}

		FlowLayout fl = new FlowLayout();
		fl.setAlignment(FlowLayout.RIGHT);

		pn.setLayout(fl);
		setContentPane(pn);

		setSize(400, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new A2_Alignment();
	}
}