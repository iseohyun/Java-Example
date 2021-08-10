package A_Basic;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class C2_Anonymous extends Frame {
	private Button btn1, btn2;
	
	public C2_Anonymous() {
		btn1 = new Button("���1");
		btn2 = new Button("���2");
		
		setLayout(new FlowLayout());
		add(btn1);
		add(btn2);
		
		ActionListener listen = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if(cmd.equals("���1")) {
					System.out.println("1�� ��ư");
				}else {
					System.out.println("2�� ��ư");
				}				
			}
		};
		
		btn1.addActionListener(listen);
		btn2.addActionListener(listen);
	}
	
	public static void main(String[] args) {
		C2_Anonymous ev = new C2_Anonymous();
		ev.setSize(300, 400);
		ev.setVisible(true);
	}
}