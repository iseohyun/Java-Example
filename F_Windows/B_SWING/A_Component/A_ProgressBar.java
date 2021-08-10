package A_Component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class A_ProgressBar extends JFrame implements ActionListener{
	JPanel pn = new JPanel();
	JProgressBar prog = new JProgressBar(0, 20);
	JButton plus = new JButton("+");
	JButton minus = new JButton("-");
	JTextField num = new JTextField(3);
	
	A_ProgressBar(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		prog.setStringPainted(false);
		pn.add(prog);
		pn.add(plus);
		pn.add(minus);
		pn.add(num);
		num.setEditable(false);
		num.setHorizontalAlignment(JTextField.RIGHT);
		num.setText(Integer.toString(prog.getValue()));
		setContentPane(pn);

		plus.addActionListener(this);
		minus.addActionListener(this);
		
		setSize(300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new A_ProgressBar();	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(plus)){
			prog.setValue(prog.getValue()+1);
		}else {
			prog.setValue(prog.getValue()-1);
		}
		num.setText(Integer.toString(prog.getValue()));
	}
}
