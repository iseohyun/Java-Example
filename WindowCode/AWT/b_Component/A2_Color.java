package b_Component;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

@SuppressWarnings("serial")
class LabelTest02 extends Frame {
	Label lab1 = new Label("첫번째 라벨");
	Label lab2 = new Label("두번째 라벨");
	Label lab3 = new Label("세번째 라벨");

	LabelTest02() {
		setLayout(new FlowLayout());

		add(lab1);
		add(lab2);
		add(lab3);

		lab1.setBackground(Color.BLUE);
		lab2.setBackground(Color.RED);
		lab3.setBackground(Color.YELLOW);

		addWindowListener(new WindowExit(this));

		setSize(300, 400);
		setVisible(true);
	}
}

public class A2_Color {
	public static void main(String[] args) {
		new LabelTest02();
	}
}