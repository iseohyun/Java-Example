package A_Basic;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class C_Event extends Frame implements ActionListener{
	private Button b;
	C_Event(){
		b = new Button("눌러주세요");
		
		setLayout(new FlowLayout());		
		add(b);
		
		b.addActionListener(this);
		
		setSize(300,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new C_Event();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("버튼이 눌림");
	}
}
