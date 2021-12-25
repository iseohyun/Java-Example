package c_Layout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class C_Grid extends Frame {
	Button b1 = new Button("1번 버튼");
	Button b2 = new Button("2번 버튼");
	Button b3 = new Button("3번 버튼");
	Button b4 = new Button("4번 버튼");
	Button b5 = new Button("5번 버튼");

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

// 실습과제 : 버튼을 하나 더 추가 해 봅니다.