package e_examples;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class TextOut extends Frame implements ActionListener{
  Button btn1 = new Button("눌러주세요");
  TextArea ta = new TextArea();
  
  public TextOut() {
    add("North", btn1);
    add("Center", ta);
    
    btn1.addActionListener(this);
    
    addWindowListener(new WindowExit(this));
    
    setSize(300, 400);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new TextOut();
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    btn1.setBackground(Color.GREEN);
    ta.setText(ta.getText()+"버튼이 눌렸어요.\n");
  }
}

// 실습과제 : "버튼이 눌렸어요(숫자)"가 출력되도록 만들어 주세요.
//     숫자는 계속해서 증가합니다. 예를들어 "버튼이 눌렸어요(1)" -> "버튼이 눌렸어요(2)" -> "버튼이 눌렸어요(3)"