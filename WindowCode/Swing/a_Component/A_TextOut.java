package a_Component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 * 
 * �ڵ� ���� ���
 * 
 * https://example-code.tistory.com/15
 *
 */

@SuppressWarnings("serial")
public class A_TextOut extends JFrame {
	JPanel pTextField = new JPanel();
	JPanel pPlainText = new JPanel();
	JPanel pStyledText = new JPanel();

	JLabel labelText;
	JLabel labelPassWord;
	JLabel labelFormatted;
	JTextField TextField = new JTextField();
	JPasswordField PassWord = new JPasswordField();
	JFormattedTextField FormaedText;
	JTextArea TextArea = new JTextArea(20, 20);
	JTextPane TextPane01;
	final String MsgTxtArea = "JTextArea�� �⺻������ �ؽ�Ʈ�� ����ϱ� ���� ���� �Դϴ�."
			+ "��Ʈ�� ������ ���� ������, �ϳ��� JTextArea�� �ִ� ��� ���ڴ� �ϳ��� ������ �����ϴ�.";
	final String html = "<font size=\"2em\" color=\"green\">\r\n"
			+ "���ڸ��� <U>�ٸ� �Ӽ�</u>�� �ο� �� �� �ֽ��ϴ�.<br>\r\n"
			+ "</font>"
			+ "<span style = \" font-size:1.5em;  color: Red;\">\r\n"
			+ "������ <b>HTML</b>�� ����ϰ� �ֽ��ϴ�.\r\n"
			+ "</span>";
	
	A_TextOut() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		// layout
		GridBagLayout GridBag = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		setLayout(GridBag);

		c.gridx = 0;
		c.gridy = 0;
		GridBag.setConstraints(pTextField, c);
		add(pTextField);

		c.gridx = 1;
		c.gridy = 0;
		c.gridheight = 2;
		GridBag.setConstraints(pStyledText, c);
		add(pStyledText);

		c.gridx = 0;
		c.gridy = 1;
		GridBag.setConstraints(pPlainText, c);
		add(pPlainText);

		// �»��
		pTextField.setLayout(new GridLayout(3, 2));

		labelText = new JLabel("Plain Text : ");
		pTextField.add(labelText);
		TextField.setText("�̸�");
		pTextField.add(TextField);
		labelPassWord = new JLabel("Password : ");
		pTextField.add(labelPassWord);
		PassWord.setText("Password");
		pTextField.add(PassWord);
		labelFormatted = new JLabel("Formatted Text : ");
		pTextField.add(labelFormatted);
		DateFormat df = new SimpleDateFormat("yyyy.mm.dd");
		FormaedText = new JFormattedTextField(df);
		FormaedText.setText("2020.12.31");
		FormaedText.revalidate();
		pTextField.add(FormaedText);

		// ���ϴ�
		pPlainText.add(TextArea);
		JScrollPane scroll = new JScrollPane(TextArea);
		pPlainText.add(scroll);

		TextArea.setText(MsgTxtArea);
		TextArea.setLineWrap(true);
		TextArea.setSelectedTextColor(Color.yellow);
		TextArea.setSelectionColor(Color.black);
		TextArea.setFont(new Font("�ü�", Font.PLAIN, 12));

		// ����
		pStyledText.setLayout(new BorderLayout());
		TextPane01 = new JTextPane();

		pStyledText.add(TextPane01);
		pStyledText.setPreferredSize(new Dimension(300, 400));

		TextPane01.setContentType("text/html");
		TextPane01.setText(html);

		pack();
	}

	public static void main(String[] args) {
		new A_TextOut();
	}
}