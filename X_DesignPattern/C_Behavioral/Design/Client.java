package Design;

/**
 * 출처 : https://ko.wikipedia.org/wiki/%EC%A4%91%EC%9E%AC%EC%9E%90_%ED%8C%A8%ED%84%B4
 * 
 * @author Seohyun Jung
 * 
 * 
 */

// TO DO: 설명 추가하기


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

interface Command {
	void execute();
}

interface Mediator {
	void book();
	void view();
	void search();
	void registerView(BtnView v);
	void registerSearch(BtnSearch s);
	void registerBook(BtnBook b);
	void registerDisplay(LblDisplay d);
}

class ParticipantMediator implements Mediator {

	BtnView btnView;
	BtnSearch btnSearch;
	BtnBook btnBook;
	LblDisplay show;

	public void registerView(BtnView v) {
		btnView = v;
	}

	public void registerSearch(BtnSearch s) {
		btnSearch = s;
	}

	public void registerBook(BtnBook b) {
		btnBook = b;
	}

	public void registerDisplay(LblDisplay d) {
		show = d;
	}

	public void book() {
		btnBook.setEnabled(false);
		btnView.setEnabled(true);
		btnSearch.setEnabled(true);
		show.setText("booking...");
	}

	public void view() {
		btnView.setEnabled(false);
		btnSearch.setEnabled(true);
		btnBook.setEnabled(true);
		show.setText("viewing...");
	}
	
	public void search() {
		btnSearch.setEnabled(false);
		btnView.setEnabled(true);
		btnBook.setEnabled(true);
		show.setText("searching...");
	}
}

@SuppressWarnings("serial")
class BtnView extends JButton implements Command {
	Mediator med;
	BtnView(ActionListener al, Mediator m) {
		super("View");
		addActionListener(al);
		med = m;
		med.registerView(this);
	}

	public void execute() {
		med.view();
	}
}

@SuppressWarnings("serial")
class BtnSearch extends JButton implements Command {
	Mediator med;
	BtnSearch(ActionListener al, Mediator m) {
		super("Search");
		addActionListener(al);
		med = m;
		med.registerSearch(this);
	}

	public void execute() {
		med.search();
	}
}

@SuppressWarnings("serial")
class BtnBook extends JButton implements Command {
	Mediator med;
	BtnBook(ActionListener al, Mediator m) {
		super("Book");
		addActionListener(al);
		med = m;
		med.registerBook(this);
	}

	public void execute() {
		med.book();
	}
}

@SuppressWarnings("serial")
class LblDisplay extends JLabel {
	Mediator med;
	LblDisplay(Mediator m) {
		super("Just start...");
		med = m;
		med.registerDisplay(this);
		setFont(new Font("Arial", Font.BOLD, 24));
	}
}

@SuppressWarnings("serial")
class Client extends JFrame implements ActionListener {
	Mediator med = new ParticipantMediator();
	Client() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		p.add(new BtnView(this, med));
		p.add(new BtnBook(this, med));
		p.add(new BtnSearch(this, med));
		getContentPane().add(new LblDisplay(med), "North");
		getContentPane().add(p, "South");
		setSize(400, 200);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		Command comd = (Command) ae.getSource();
		comd.execute();
	}

	public static void main(String[] args) {
		new Client();
	}
}