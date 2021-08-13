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
	private static final long serialVersionUID = 1L;
	Label lab;
	Button b = new Button("종료");
	
	public DialogMessage(Frame arg0, String msg) {
		super(arg0, "메시지 대화상자", true);
		
		setLayout(new FlowLayout());

		lab = new Label(msg);
		add(lab);
		add(b);
		setBackground(Color.GRAY);
		
		b.addActionListener(this);
		
		setSize(200,300);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
	}
}

public class G2_MessageToDialog extends Frame implements ActionListener{
	private static final long serialVersionUID = 1L;
	Button b1 = new Button("다이얼로그 열기");;
	TextField tf = new TextField("전달 메시지", 30);
	
	public G2_MessageToDialog() {
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