package b_Layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class A1_Layout extends JFrame {
  final int BUTTON_ = 10;
  JPanel pn = new JPanel();
  JButton[] bt = new JButton[10];

  A1_Layout() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    for (int i = 0; i < 10; i++) {
      bt[i] = new JButton("Button" + i);
      pn.add(bt[i]);
    }

    setContentPane(pn);
    setSize(400, 300);
    setVisible(true);
  }

  public static void main(String[] args) {
    new A1_Layout();
  }
}

// 실습과제 : 프로그램의 크기를 변화시켜 봅니다. 버튼의 배열을 관찰해 봅니다.