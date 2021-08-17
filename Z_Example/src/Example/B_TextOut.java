package X_Example;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class B_TextOut extends Frame implements ActionListener{
	private static final long serialVersionUID = 1L;
	Button btn1 = new Button("눌러주세요");
	TextArea ta = new TextArea();
	
	public B_TextOut() {
		add("North", btn1);
		add("Center", ta);
		
		btn1.addActionListener(this);
		
		addWindowListener(new WindowExit(this));
		
		setSize(300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new B_TextOut();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		btn1.setBackground(Color.GREEN);
		ta.setText(ta.getText()+"버튼이 눌렸어요.\n");
	}
}