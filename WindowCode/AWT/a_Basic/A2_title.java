package a_Basic;

import java.awt.Frame;

@SuppressWarnings("serial")
public class A2_title extends Frame{
	public A2_title(String title) {
		super(title);
		setSize(300,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new A2_title("Title Name");
	}
}
