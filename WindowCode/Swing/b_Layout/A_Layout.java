package b_Layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class A_Layout extends JFrame {
	final int BUTTON_ = 10;
	JPanel pn = new JPanel();
	JButton[] bt = new JButton[10];

	A_Layout() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		for (int i = 0; i < 10; i++) {
			bt[i] = new JButton("Button" + i);
			pn.add(bt[i]);
		}

		setContentPane(pn);
		setSize(400, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new A_Layout();
	}
}

// �ǽ����� : ���α׷��� ũ�⸦ ��ȭ���� ���ϴ�. ��ư�� �迭�� ������ ���ϴ�.