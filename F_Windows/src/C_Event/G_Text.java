package C_Event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class G_Text extends Frame implements TextListener, KeyListener{
	private TextField tf;
	private TextArea ta;
	public G_Text() {
		addWindowListener(new WindowExit(this));
		
		tf = new TextField();
		ta = new TextArea();
		
		add("Center", ta);
		add("South", tf);
		ta.getScrollbarVisibility();
		tf.addTextListener(this);
		tf.addKeyListener(this);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyChar()) {
		case KeyEvent.VK_BACK_SPACE:
			tf.setText("");
			break;
		case KeyEvent.VK_ENTER:
			tf.setText("");
			ta.setText(ta.getText()+"\n");
			break;
			
		default :
			ta.setText(ta.getText() + e.getKeyChar());
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void textValueChanged(TextEvent e) {
		// TODO Auto-generated method stub
	}
	
	public static void main(String [] args) {
		G_Text f = new G_Text();
		f.setSize(300, 400);
		f.setVisible(true);
	}
}
