package A_Components;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class D_Exit extends Frame implements ActionListener{
	private Button b;
	D_Exit(){
		b = new Button("¸¶Ä§");
		add(b);
		b.addActionListener(this);
		setSize(300,400);
		setVisible(true);
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		dispose();
	}
	
	public static void main(String[] args) {
		new D_Exit();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		dispose();
	}
}
