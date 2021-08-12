package A_Component;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class F_Table extends JFrame implements ActionListener {
	JPanel p = new JPanel();
	JPanel pBtn = new JPanel();
	JScrollPane pTb;
	JTable tb;
	DefaultTableModel model;
	JButton btnAdd = new JButton("�߰�");
	JButton btnDel = new JButton("����");
	final static String[] header = {"��ȭ", "�帣"};
	JTextField txtMovie = new JTextField(header[0]);
	JTextField txtInfo = new JTextField(header[1]);
	JTextField inputMovie = new JTextField();
	JTextField inputInfo = new JTextField();
	
	F_Table() {
		// ��ü ����
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		// ���̺� ���
		add("Center", p);
		add("South", pBtn);
		
		// ���̺� ����
		DefaultTableModel col = new DefaultTableModel(header, 0);
		tb = new JTable(col);
		tb.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		pTb = new JScrollPane(tb);
		
		model = (DefaultTableModel) tb.getModel();
		String[][] record = {
				{"��������", "�ڹ̵�"},
				{"�Ű� �Բ�", "��Ÿ��"},
				{"�ܿ�ձ�", "�ִϸ��̼�"},
				{"�ƹ�Ÿ", "SF"},
				{"���׶�", "�ڹ̵�"},
				{"�絵", "���"},
				{"�����", "��Ÿ��"},
				{"������ ����", "��Ÿ��"},
				{"�����", "���"},
				{"���ͽ��ڶ�", "SF"},
				{"�μ���", "���"},
				{"���˵���", "����"},
		};
		for(String[] rcd : record) {
			model.addRow(rcd);
		}
		p.add(pTb);
		
		// ��ư �� �ؽ�Ʈ
		pBtn.setLayout(new GridLayout(3, 2));
		txtMovie.setEnabled(false);
		txtMovie.setDisabledTextColor(Color.black);
		pBtn.add(txtMovie);
		pBtn.add(inputMovie);
		txtInfo.setEnabled(false);
		txtInfo.setDisabledTextColor(Color.black);
		pBtn.add(txtInfo);
		pBtn.add(inputInfo);
		pBtn.add(btnAdd);
		btnAdd.addActionListener(this);
		pBtn.add(btnDel);
		btnDel.addActionListener(this);
		
		setSize(getPreferredSize());		
	}
	
	Border defaultMargin() {
		return BorderFactory.createEmptyBorder(10, 10, 10, 10);
	}
	
	public static void main(String[] args) {
		new F_Table();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(btnAdd)) {
			String[] rcd = {"", ""};
			rcd[0] = inputMovie.getText();
			rcd[1] = inputInfo.getText();
			model.addRow(rcd);
		}else {
			if(tb.getSelectedRow() != -1) {
				model.removeRow(tb.getSelectedRow());
			}else {
				model.removeRow(tb.getRowCount()-1);
			}
		}
	}
}
