package B_Componet;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class B_Button extends Frame implements ActionListener {
	private static final long serialVersionUID = 1L;
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Button A1 = new Button("패널 1 보이기");
	Button A2 = new Button("패널 1 안보이기");
	Button B1 = new Button("패널 2 보이기");
	Button B2 = new Button("패널 2 안보이기");

	B_Button() {
		setLayout(new FlowLayout());

		p1.setBackground(Color.BLUE);
		add(p1);
		p2.setBackground(Color.MAGENTA);
		add(p2);

		p1.add(A1);
		p1.add(A2);
		p2.add(B1);
		p2.add(B2);

		A1.addActionListener(this);
		A2.addActionListener(this);
		B1.addActionListener(this);
		B2.addActionListener(this);

		addWindowListener(new WindowExit(this));

		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new B_Button();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(A1)) {
			p2.setVisible(true);
		} else if (e.getSource().equals(A2)) {
			p2.setVisible(false);
		} else if (e.getSource().equals(B1)) {
			p1.setVisible(true);
		} else if (e.getSource().equals(B2)) {
			p1.setVisible(false);
		}
	}
}