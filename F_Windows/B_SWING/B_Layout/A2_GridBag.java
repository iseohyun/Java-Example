package A_Layout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class A2_GridBag extends JFrame{
	private static final long serialVersionUID = 1L;
	final int N_BUTTONS = 5;
	JPanel pn = new JPanel();
	JButton[] bt = new JButton[N_BUTTONS];
	
	A2_GridBag() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		GridBagConstraints[] gbc = new GridBagConstraints[N_BUTTONS];
		GridBagLayout gbl = new GridBagLayout();
	
		pn.setLayout(gbl);
		for(int i = 0; i < N_BUTTONS; i++) {
			bt[i] = new JButton("Button" + i);
			gbc[i] = new GridBagConstraints();
			gbc[i].gridx = i;
			gbc[i].gridy = i;
			pn.add(bt[i], gbc[i]);
		}
		setContentPane(pn);
		
		setSize(400, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new A2_GridBag();
	}
}
