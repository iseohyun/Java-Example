package X_Example;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class B_TextOut extends Frame implements ActionListener{
	private Button btn1;
	private TextArea ta;
	public B_TextOut() {
		btn1 = new Button("눌러주세요");
		ta = new TextArea();
		
		add("North", btn1);
		add("Center", ta);
		
		btn1.addActionListener(this);
		addWindowListener(new WindowExit(this));
		
		setSize(300, 400);
		setVisible(true);
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
		new B_TextOut();
	}
}