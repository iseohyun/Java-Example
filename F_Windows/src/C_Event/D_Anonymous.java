package C_Event;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class D_Anonymous extends Frame {
	private Button btn1, btn2;
	private TextArea ta;
	public D_Anonymous() {
		btn1 = new Button("눌러주세요");
		btn2 = new Button("종료");
		ta = new TextArea();
		
		add("North", btn1);
		add("Center", ta);
		add("South", btn2);
		
		ActionListener listen = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();
				if(cmd.equals("눌러주세요")) {
					btn1.setBackground(Color.GREEN);
					ta.setText(ta.getText()+"버튼이 눌렸어요.\n");
				}else {
					dispose();
				}				
			}
		};
		
		btn1.addActionListener(listen);
		btn2.addActionListener(listen);
	}
	
	public static void main(String [] args) {
		D_Anonymous ev = new D_Anonymous();
		ev.setSize(300, 400);
		ev.setVisible(true);
	}
}