package B_Component;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class G4_Card extends Frame implements ActionListener{
	Button b1, b2, b3, b4, b5;
	CardLayout card;
	
	public G4_Card() {
		card = new CardLayout(); 
		setLayout(card);
		b1 = new Button("1�� ��ư");
		b2 = new Button("2�� ��ư");
		b3 = new Button("3�� ��ư");
		b4 = new Button("4�� ��ư");
		b5 = new Button("5�� ��ư");
		
		add("North",b1);
		add("South",b2);
		add("East",b3);
		add("West",b4);
		add("Center",b5);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	
	public static void main(String[] agrs) {
		G4_Card lo = new G4_Card();
		lo.setSize(300, 400);
		lo.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		card.next(this);
	}
}
