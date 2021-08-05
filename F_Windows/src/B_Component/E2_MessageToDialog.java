package B_Component;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DialogMessage extends Dialog implements ActionListener{
	private Label lab;	//
	private Button b;
	
	public DialogMessage(Frame arg0, String msg) {
		super(arg0, "메시지 대화상자", true);
		lab = new Label(msg);
		b = new Button("종료");
	}
	
	void display() {

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
public class E2_MessageToDialog extends Frame implements ActionListener{
	private Panel p;
	private Button b1, b2;
	
	public E2_MessageToDialog() {
		p = new Panel();
		b1 = new Button("다이얼로그 열기");
		b2 = new Button("종료");
		
		p.add(b1);
		p.add(b2);
		
		add(p);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setSize(300, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new E2_MessageToDialog();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("다이얼로그 열기")) {
			DialogMessage dm = new DialogMessage(this,"메인 메시지");
			dm.display();
		}else if(cmd.equals("종료")){
			dispose();
		}

	}	
}
