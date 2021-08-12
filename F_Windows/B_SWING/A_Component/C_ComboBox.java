package A_Component;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class C_ComboBox extends JFrame implements ActionListener, ListSelectionListener {
	String rainbow[] = {"빨강", "주황", "노랑", "초록", "파랑", "남색", "보라"};
	JComboBox<String> CbColor = new JComboBox<>(rainbow);
	JList<String> ColList = new JList<>(rainbow);
	JList<String> MulSelect = new JList<>(rainbow);
	int LastSel = 10;
	
	C_ComboBox(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		GridBagConstraints c = new GridBagConstraints();
		GridBagLayout grid = new GridBagLayout();
		setLayout(grid);
		
		c.ipadx = 10;		c.ipady = 10;
		JLabel txtComb = new JLabel("콤보 박스");
		c.gridx = 0;		c.gridy = 0;
		grid.setConstraints(txtComb, c);
		add(txtComb);

		c.gridx = 0;		c.gridy = 1;
		grid.setConstraints(CbColor, c);
		add(CbColor);
		
		JLabel txtList = new JLabel("리스트");
		c.gridx = 1;		c.gridy = 0;
		grid.setConstraints(txtList, c);
		add(txtList);
		
		c.gridx = 1;		c.gridy = 1;
		grid.setConstraints(ColList, c);
		add(ColList);
		
		JLabel txtMulti = new JLabel("멀티체크");
		c.gridx = 2;		c.gridy = 0;
		grid.setConstraints(txtMulti, c);
		add(txtMulti);
		
		c.gridx = 2;		c.gridy = 1;
		grid.setConstraints(MulSelect, c);
		add(MulSelect);
		MulSelect.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		CbColor.addActionListener(this);
		ColList.addListSelectionListener(this);
		
		pack();
	}

	public static void main(String[] args) {
		new C_ComboBox();
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		if(LastSel == ColList.getSelectedIndex()) return;
		if(e.getSource().equals(ColList)){
			LastSel = ColList.getSelectedIndex();
			CbColor.setSelectedIndex(LastSel);
			int i, len;
			len = MulSelect.getSelectedIndices().length;
			int[] sel = MulSelect.getSelectedIndices();
			for(i = 0; i < len; i++) {
				if(sel[i] == LastSel) {
					// delete
					
					switch(len) {
					case 1:
						MulSelect.setSelectedIndices(new int[0]);
						break;
					case 2:
						int[] sel2 = new int[1];
						if(i == 0)	sel2[0] = sel[1];
						else	sel2[0] = sel[0];
						MulSelect.setSelectedIndices(sel2);
						break;
					default:
						int[] sel3 = new int[len-1];
						for(int j = 0; j < len-1; j++) {
							if(j >= i)	sel3[j] = sel[j+1];
							else	sel3[j] = sel[j];
						}
						MulSelect.setSelectedIndices(sel3);
					}
					return;
				}
			}
			
			// add
			int[] sel2 = new int[len + 1];
			for(int j = 0; j < len; j++)
				sel2[j] = sel[j];
			
			sel2[len] = LastSel;
			MulSelect.setSelectedIndices(sel2);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ColList.setSelectedIndex(CbColor.getSelectedIndex());
	}
}
