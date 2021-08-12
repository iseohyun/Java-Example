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
	JButton btnAdd = new JButton("추가");
	JButton btnDel = new JButton("삭제");
	final static String[] header = {"영화", "장르"};
	JTextField txtMovie = new JTextField(header[0]);
	JTextField txtInfo = new JTextField(header[1]);
	JTextField inputMovie = new JTextField();
	JTextField inputInfo = new JTextField();
	
	F_Table() {
		// 전체 설정
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		// 테이블 페널
		add("Center", p);
		add("South", pBtn);
		
		// 테이블 설정
		DefaultTableModel col = new DefaultTableModel(header, 0);
		tb = new JTable(col);
		tb.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		pTb = new JScrollPane(tb);
		
		model = (DefaultTableModel) tb.getModel();
		String[][] record = {
				{"극한직업", "코미디"},
				{"신과 함께", "판타지"},
				{"겨울왕국", "애니메이션"},
				{"아바타", "SF"},
				{"베테랑", "코미디"},
				{"사도", "사극"},
				{"어벤져스", "판타지"},
				{"반지의 제왕", "판타지"},
				{"기생충", "드라마"},
				{"인터스텔라", "SF"},
				{"인셉션", "드라마"},
				{"범죄도시", "엑션"},
		};
		for(String[] rcd : record) {
			model.addRow(rcd);
		}
		p.add(pTb);
		
		// 버튼 및 텍스트
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
