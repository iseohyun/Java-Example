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
	private static final long serialVersionUID = 1L;
	
	public DialogTest(Frame arg0, String msg) {
		super(arg0, "메시지 대화상자", true);
		Label lab = new Label(msg);
		Button b = new Button("종교");
		
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

public class G_Dialog extends Frame implements ActionListener{
	private static final long serialVersionUID = 1L;
	Button b1 = new Button("다이얼로그 열기");
	
	public G_Dialog() {
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
		new DialogTest(this,"메인 메시지");
	}	
}
