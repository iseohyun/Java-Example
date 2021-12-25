package b_Layout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class C_GridBag extends JFrame {
	final int N_BUTTONS = 10;
	JPanel pn = new JPanel();
	JButton[] bt = new JButton[N_BUTTONS];

	C_GridBag() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		GridBagConstraints[] gbc = new GridBagConstraints[N_BUTTONS];
		GridBagLayout gbl = new GridBagLayout();

		pn.setLayout(gbl);
		for (int i = 0; i < N_BUTTONS; i++) {
			bt[i] = new JButton(Integer.toString(i));
			gbc[i] = new GridBagConstraints();
			gbc[i].gridx = (i*2+(i/5))%5;
			gbc[i].gridy = i%5;
			pn.add(bt[i], gbc[i]);
		}
		setContentPane(pn);

		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new C_GridBag();
	}
}

// 실습과제 : 버튼으로 하트를 만들어 봅니다.
// 실습과제 : 버튼이 눌렸을 때, 이벤트를 추가해 봅니다.