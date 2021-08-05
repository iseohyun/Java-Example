package B_Event;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class C_InnerEvent extends Frame {
	private Button btn1, btn2;
	private TextArea ta;
	public C_InnerEvent() {
		btn1 = new Button("눌러주세요");
		btn2 = new Button("종료");
		ta = new TextArea();
		
		add("North", btn1);
		add("Center", ta);
		add("South", btn2);
		
		InnerHandler hlr = new InnerHandler(ta, btn1, btn2, this);
		
		btn1.addActionListener(hlr);
		btn2.addActionListener(hlr);
	}
	
	class InnerHandler implements ActionListener{
		private Button btn1, btn2;
		private TextArea ta;
		private Frame f;
		InnerHandler(TextArea ta, Button btn1, Button btn2, Frame f) {
			this.ta = ta;
			this.btn1 = btn1;
			this.btn2 = btn2;
			this.f = f;
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
				f.dispose();
			}
		}
	}
	
	public static void main(String[] args) {
		C_InnerEvent ev = new C_InnerEvent();
		ev.setSize(300, 400);
		ev.setVisible(true);
	}
}