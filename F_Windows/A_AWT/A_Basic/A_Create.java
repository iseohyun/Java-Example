package A_Basic;

import java.awt.Frame;

@SuppressWarnings("serial")
public class A_Create extends Frame{
	A_Create(){
		setSize(300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new A_Create();		
	}
}