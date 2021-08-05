package B_Event;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A_Event extends Frame implements ActionListener{
	private Button btn1, btn2;
	private TextArea ta;
	public A_Event() {
		btn1 = new Button("눌러주세요");
		btn2 = new Button("종료");
		ta = new TextArea();
		
		add("North", btn1);
		add("Center", ta);
		add("South", btn2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Button btn = (Button)e.getSource();
		String cmd = btn.getLabel();
		if(cmd.equals("눌러주세요")) {
			btn.setBackground(Color.GREEN);
			ta.setText(ta.getText()+"버튼이 눌렸어요.\n");
		}else {
			dispose();
		}
	}
	
	public static void main(String[] args) {
		A_Event ev = new A_Event();
		ev.setSize(300, 400);
		ev.setVisible(true);
	}
}
