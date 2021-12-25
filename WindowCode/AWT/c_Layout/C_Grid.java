package c_Layout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class C_Grid extends Frame {
	Button b1 = new Button("1�� ��ư");
	Button b2 = new Button("2�� ��ư");
	Button b3 = new Button("3�� ��ư");
	Button b4 = new Button("4�� ��ư");
	Button b5 = new Button("5�� ��ư");

	public C_Grid() {
		setLayout(new GridLayout(2, 3, 5, 10));

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);

		addWindowListener(new WindowExit(this));

		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] agrs) {
		new C_Grid();
	}
}

// �ǽ����� : ��ư�� �ϳ� �� �߰� �� ���ϴ�.