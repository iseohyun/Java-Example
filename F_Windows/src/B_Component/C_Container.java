package B_Component;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class C_Container extends Frame implements ActionListener{
	private Panel p1, p2;
	private Button b1, b2, b3, b4;
	C_Container(){
		setLayout(new FlowLayout());
		p1 = new Panel();
		p2 = new Panel();
		
		b1 = new Button("�г� 2 ���̱�");
		b2 = new Button("�г� 2 �Ⱥ��̱�");
		b3 = new Button("�г� 1 ���̱�");
		b4 = new Button("�г� 1 �Ⱥ��̱�");
		
		p1.add(b1);
		p1.add(b2);
		p2.add(b3);
		p2.add(b4);
		
		add(p1);
		add(p2);
		
        p1.setBackground(Color.BLUE);
        p2.setBackground(Color.MAGENTA);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
		setSize(300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new C_Container();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("��ư�� ����");
	}
}
