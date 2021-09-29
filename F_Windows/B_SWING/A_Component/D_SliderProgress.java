package A_Component;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class D_SliderProgress extends JFrame implements ChangeListener, ActionListener {
	JPanel pBtn = new JPanel();
	JProgressBar prog = new JProgressBar(0, 20);
	JTextField txtProg = new JTextField(3);
	JSlider slider = new JSlider();
	JTextField txtSlider = new JTextField(3);
	JButton plus = new JButton("+");
	JButton minus = new JButton("-");

	D_SliderProgress() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		GridBagConstraints c = new GridBagConstraints();
		GridBagLayout Grid = new GridBagLayout();
		setLayout(Grid);

		c.ipadx = 10;
		c.ipady = 10;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 0;
		Grid.setConstraints(txtProg, c);
		add(txtProg);

		txtProg.setEnabled(false);
		txtProg.setBackground(getBackground());
		txtProg.setHorizontalAlignment(JTextField.RIGHT);
		txtProg.setDisabledTextColor(Color.black);
		txtProg.setText(Integer.toString(prog.getValue()));

		c.gridx = 1;
		c.gridy = 0;
		Grid.setConstraints(prog, c);
		add(prog);
		prog.setStringPainted(false);

		c.gridx = 0;
		c.gridy = 1;
		Grid.setConstraints(txtSlider, c);
		add(txtSlider);
		txtSlider.setEditable(false);
		txtSlider.setHorizontalAlignment(JTextField.RIGHT);
		txtSlider.setDisabledTextColor(Color.black);
		txtSlider.setText(Integer.toString(slider.getValue()));

		c.gridx = 1;
		c.gridy = 1;
		Grid.setConstraints(slider, c);
		add(slider);
		slider.addChangeListener(this);

		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 2;
		Grid.setConstraints(pBtn, c);
		add(pBtn);
		pBtn.setLayout(new GridLayout(1, 2));
		pBtn.add(minus);
		pBtn.add(plus);
		plus.addActionListener(this);
		minus.addActionListener(this);

		pack();
	}

	public static void main(String[] args) {
		new D_SliderProgress();
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if (e.getSource().equals(slider)) {
			txtSlider.setText(Integer.toString(slider.getValue()));
			txtProg.setText(Integer.toString(prog.getValue()));
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(plus)) {
			prog.setValue(prog.getValue() + 1);
			slider.setValue(slider.getValue() + 1);
		} else {
			prog.setValue(prog.getValue() - 1);
			slider.setValue(slider.getValue() - 1);
		}
		txtProg.setText(Integer.toString(prog.getValue()));
		txtSlider.setText(Integer.toString(slider.getValue()));
	}
}