package A_Component;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class J_Image extends JFrame{
	private static final long serialVersionUID = 1L;
	
	J_Image() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		setLayout(new FlowLayout());
		
		ImageIcon icon = new ImageIcon("maple.jpg");
		JLabel img = new JLabel(icon);
		add(img);
		pack();
	}
	
	public static void main(String[] args) {
		new J_Image();
	}
}
