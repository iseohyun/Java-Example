package c_Layout;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class D_Card extends Frame implements ActionListener {
	Button b1 = new Button("1�� ��ư");
	Button b2 = new Button("2�� ��ư");
	Button b3 = new Button("3�� ��ư");
	Button b4 = new Button("4�� ��ư");
	Button b5 = new Button("5�� ��ư");

	CardLayout card = new CardLayout();

	public D_Card() {
		setLayout(card);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);

		addWindowListener(new WindowExit(this));

		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new D_Card();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		card.next(this);
	}
}

// �ǽ����� : ��ư�� �߰��� ���ϴ�. ("6�� ��ư")