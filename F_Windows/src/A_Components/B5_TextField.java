package A_Components;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;

class TextTest extends Frame{
	private TextField tf, tf2;
	private TextArea ta, ta2;
	
	TextTest () {
		setLayout(new FlowLayout());
		
		tf = new TextField("Hello World", 30);
		ta = new TextArea("Text", 5,30);
		
		add(tf);
		add(ta);
		
		tf2 = new TextField(40);
		ta2 = new TextArea(10,40);
		
		add(tf2);
		add(ta2);
				
		setSize(300, 400);
		setVisible(true);
	}
}
public class B5_TextField {
	public static void main(String[] args) {
		new TextTest();
	}
}
