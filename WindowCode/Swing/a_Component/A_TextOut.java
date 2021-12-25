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
 * 코드 실행 모습
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
	final String MsgTxtArea = "JTextArea는 기본적으로 텍스트를 출력하기 위한 도구 입니다."
			+ "폰트를 지정할 수는 있지만, 하나의 JTextArea에 있는 모든 문자는 하나의 설정만 따릅니다.";
	final String html = "<font size=\"2em\" color=\"green\">\r\n"
			+ "글자마다 <U>다른 속성</u>을 부여 할 수 있습니다.<br>\r\n"
			+ "</font>"
			+ "<span style = \" font-size:1.5em;  color: Red;\">\r\n"
			+ "지금은 <b>HTML</b>을 사용하고 있습니다.\r\n"
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

		// 좌상단
		pTextField.setLayout(new GridLayout(3, 2));

		labelText = new JLabel("Plain Text : ");
		pTextField.add(labelText);
		TextField.setText("이름");
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

		// 좌하단
		pPlainText.add(TextArea);
		JScrollPane scroll = new JScrollPane(TextArea);
		pPlainText.add(scroll);

		TextArea.setText(MsgTxtArea);
		TextArea.setLineWrap(true);
		TextArea.setSelectedTextColor(Color.yellow);
		TextArea.setSelectionColor(Color.black);
		TextArea.setFont(new Font("궁서", Font.PLAIN, 12));

		// 우측
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