package a_Basic;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class C_Event extends Frame implements ActionListener {
	private Button b = new Button("눌러주세요");

	C_Event() {
		add(b);

		b.addActionListener(this);

		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new C_Event();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼이 눌림");
	}
}