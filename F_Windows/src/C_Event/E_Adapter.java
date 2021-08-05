package C_Event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class E_Adapter extends Frame implements WindowListener{
	private TextField tf;
	private Button btnExit;
	
	public E_Adapter() {
		tf = new TextField("우상단 x버튼을 누르면 종료합니다.");
		
		add("North", tf);
		
		addWindowListener(this);
	}
	
	public static void main(String [] args) {
		E_Adapter adpt = new E_Adapter();
		adpt.setSize(300, 400);
		adpt.setVisible(true);
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		dispose();
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
