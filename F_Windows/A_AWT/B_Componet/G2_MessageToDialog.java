package B_Componet;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DialogMessage extends Dialog implements ActionListener{
	private Label lab;	//
	private Button b;
	
	public DialogMessage(Frame arg0, String msg) {
		super(arg0, "�޽��� ��ȭ����", true);
		lab = new Label(msg);
		b = new Button("����");
		
		setLayout(new FlowLayout());
		add(lab);
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
public class G2_MessageToDialog extends Frame implements ActionListener{
	private Button b1;
	private TextField tf;
	
	public G2_MessageToDialog() {
		b1 = new Button("���̾�α� ����");
		tf = new TextField("���� �޽���", 30);
		
		setLayout(new FlowLayout());
		add(tf);
		add(b1);
		
		b1.addActionListener(this);
		addWindowListener(new WindowExit(this));
		
		setSize(300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new G2_MessageToDialog();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(b1)) {
			new DialogMessage(this,tf.getText());
		}
	}	
}