package a_Basic;

import java.awt.Button;
import java.awt.Frame;

@SuppressWarnings("serial")
public class B_Button extends Frame {
	Button b = new Button("¸¶Ä§");

	B_Button() {
		add(b);

		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new B_Button();
	}
}