package B_Componet;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class B_Button extends Frame implements ActionListener{
	private Panel p1, p2;
	private Button b1, b2, b3, b4;
	B_Button(){
		p1 = new Panel();
		p2 = new Panel();

		b1 = new Button("�г� 2 ���̱�");
		b2 = new Button("�г� 2 �Ⱥ��̱�");
		b3 = new Button("�г� 1 ���̱�");
		b4 = new Button("�г� 1 �Ⱥ��̱�");
		
		setLayout(new FlowLayout());
		add(p1);
		add(p2);
		
		p1.add(b1);
		p1.add(b2);
		p2.add(b3);
		p2.add(b4);
		
        p1.setBackground(Color.BLUE);
        p2.setBackground(Color.MAGENTA);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        addWindowListener(new WindowExit(this));
        
		setSize(300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new B_Button();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand(); //��ư�� ������ �ִ� ���̺� ���� �̾ƿ´�.
		if(cmd.equals("�г� 2 ���̱�")) {
			p2.setVisible(true);
		}else if(cmd.equals("�г� 2 �Ⱥ��̱�")) {
			p2.setVisible(false);
		}else if(cmd.equals("�г� 1 ���̱�")) {
			p1.setVisible(true);
		}else {
			p1.setVisible(false);
		}
	}
}