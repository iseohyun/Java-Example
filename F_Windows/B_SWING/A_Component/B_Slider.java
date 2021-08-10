package A_Component;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class B_Slider extends JFrame implements ChangeListener{
	JPanel pn = new JPanel();
	JSlider sd = new JSlider();
	JTextPane tp = new JTextPane();
	
	B_Slider() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		sd.addChangeListener(this);
		
		tp.setText("0");
		tp.setEnabled(false);
		tp.setBackground(getBackground());
		tp.setDisabledTextColor(Color.black);
		
		pn.add(sd);
		pn.add(tp);
		
		setContentPane(pn);
		setSize(300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new B_Slider();
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(sd)) {
			sd.setValue(sd.getValue());
			tp.setText(Integer.toString(sd.getValue()));
		}
	}
}
