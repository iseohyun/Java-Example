package A_Component;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class B_Button extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	JRadioButton rdoFemale = new JRadioButton("여성");
	JRadioButton rdoMale = new JRadioButton("남성");
	ButtonGroup Sex = new ButtonGroup();
	JCheckBox chkboxConfirm = new JCheckBox("확인하였습니다.");
	JButton btnSend = new JButton("제출");
	JTextField view = new JTextField("제출하세요.");
	
	B_Button() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		// Layout
		GridBagLayout Grid = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		setLayout(Grid);
		
		Sex.add(rdoMale);
		Sex.add(rdoFemale);
		
		c.gridx = 0;		c.gridy = 0;
		Grid.setConstraints(rdoMale, c);
		add(rdoMale);
		
		c.gridx = 1;		c.gridy = 0;
		Grid.setConstraints(rdoMale, c);
		add(rdoFemale);

		c.gridx = 1;		c.gridy = 1;
		c.gridwidth = 2;
		Grid.setConstraints(chkboxConfirm, c);
		add(chkboxConfirm);
		chkboxConfirm.setEnabled(false);

		c.gridx = 1;		c.gridy = 2;
		c.gridwidth = 2;
		c.fill = GridBagConstraints.BOTH;
		Grid.setConstraints(btnSend, c);
		add(btnSend);
		btnSend.setEnabled(false);
		
		c.gridx = 1;		c.gridy = 3;
		c.gridwidth = 2;
		c.fill = GridBagConstraints.BOTH;
		Grid.setConstraints(view, c);
		add(view);
		view.setEnabled(false);
		view.setDisabledTextColor(Color.DARK_GRAY);
		
		// Event Setting
		rdoMale.addActionListener(this);
		rdoFemale.addActionListener(this);
		chkboxConfirm.addActionListener(this);
		btnSend.addActionListener(this);
		
		pack();
	}
	
	public static void main(String[] args) {
		new B_Button();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(chkboxConfirm)) {
			btnSend.setEnabled(chkboxConfirm.isSelected());
		}else if(e.getSource().equals(btnSend)){
			if(rdoMale.isSelected()) {
				view.setText("남성 선택 됨");
			}else if(rdoFemale.isSelected()){
				view.setText("여성 선택 됨");
			}
		}else if(e.getSource().equals(rdoMale)){
			chkboxConfirm.setEnabled(true);
		}else if(e.getSource().equals(rdoFemale)){
			chkboxConfirm.setEnabled(true);
		}
	}
}
