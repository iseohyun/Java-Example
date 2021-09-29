package B_Componet;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class F_TextArea extends Frame implements TextListener, KeyListener {
	private static final long serialVersionUID = 1L;
	TextField tf = new TextField();
	TextArea ta = new TextArea();

	public F_TextArea() {
		ta.getScrollbarVisibility();
		add("Center", ta);
		add("South", tf);

		tf.addTextListener(this);
		tf.addKeyListener(this);

		addWindowListener(new WindowExit(this));

		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new F_TextArea();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyChar()) {
		case KeyEvent.VK_BACK_SPACE:
			tf.setText("");
			break;
		case KeyEvent.VK_ENTER:
			tf.setText("");
			ta.setText(ta.getText() + "\n");
			break;
		default:
			ta.setText(ta.getText() + e.getKeyChar());
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void textValueChanged(TextEvent e) {
	}
}