package C_Layout;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class C4_Card extends Frame implements ActionListener{
	Button b1, b2, b3, b4, b5;
	CardLayout card;
	
	public C4_Card() {
		card = new CardLayout(); 
		setLayout(card);
		b1 = new Button("1�� ��ư");
		b2 = new Button("2�� ��ư");
		b3 = new Button("3�� ��ư");
		b4 = new Button("4�� ��ư");
		b5 = new Button("5�� ��ư");
		
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
		new C4_Card();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		card.next(this);
	}
}