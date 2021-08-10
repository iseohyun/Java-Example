package B_Componet;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DialogTest extends Dialog implements ActionListener{
	public DialogTest(Frame arg0, String msg) {
		super(arg0, "�޽��� ��ȭ����", true);
		Label lab = new Label(msg);
		add(lab);
		
		Button b = new Button("����");
		add(b);
		
		setBackground(Color.GRAY);
		
		b.addActionListener(this);
		
		setSize(200,300);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		dispose();
	}
}

public class G_Dialog extends Frame implements ActionListener{
	private Button b1;
	
	public G_Dialog() {
		b1 = new Button("���̾�α� ����");
		
		setLayout(new FlowLayout());
		add(b1);
		
		b1.addActionListener(this);
		addWindowListener(new WindowExit(this));
		
		setSize(300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new G_Dialog();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		new DialogTest(this,"���� �޽���");
	}	
}
