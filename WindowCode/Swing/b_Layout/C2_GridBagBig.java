package b_Layout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class C2_GridBagBig extends JFrame {
	final int N_BUTTONS = 5;
	JPanel pn = new JPanel();
	JButton[] bt = new JButton[N_BUTTONS];

	C2_GridBagBig() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		GridBagConstraints[] gbc = new GridBagConstraints[N_BUTTONS];
		GridBagLayout gbl = new GridBagLayout();

		pn.setLayout(gbl);
		for (int i = 0; i < N_BUTTONS; i++) {
			bt[i] = new JButton("Button" + i);
			gbc[i] = new GridBagConstraints();
		}
		setContentPane(pn);

		gbc[0].gridx = 0;
		gbc[0].gridy = 1;
		pn.add(bt[0], gbc[0]);

		gbc[1].gridx = 0;
		gbc[1].gridy = 2;
		pn.add(bt[1], gbc[1]);

		gbc[2].gridx = 1;
		gbc[2].gridy = 0;
		pn.add(bt[2], gbc[2]);

		gbc[3].gridx = 2;
		gbc[3].gridy = 0;
		pn.add(bt[3], gbc[3]);

		gbc[4].gridx = 1;
		gbc[4].gridy = 1;
		gbc[4].gridwidth = 2;
		gbc[4].gridheight = 2;
		gbc[4].fill = GridBagConstraints.BOTH;

		pn.add(bt[4], gbc[4]);
		setSize(400, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new C2_GridBagBig();
	}
}