package C_Layout;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class C4_Card extends Frame implements ActionListener{
	private static final long serialVersionUID = 1L;
	Button b1 = new Button("1번 버튼");
	Button b2 = new Button("2번 버튼");
	Button b3 = new Button("3번 버튼");
	Button b4 = new Button("4번 버튼");
	Button b5 = new Button("5번 버튼");

	CardLayout card = new CardLayout();
	
	public C4_Card() {
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
		card.next(this);
	}
}