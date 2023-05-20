package b_Component;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class B_Button extends Frame implements ActionListener {
  Panel p1 = new Panel();
  Panel p2 = new Panel();
  Button a1 = new Button("패널 2 보이기");
  Button a2 = new Button("패널 2 안보이기");
  Button b1 = new Button("패널 1 감추기");

  B_Button() {
    setLayout(new FlowLayout());
    
    p1.setBackground(Color.BLUE);
    add(p1);
    
    p2.setBackground(Color.MAGENTA);
    add(p2);

    p1.add(a1);
    p1.add(a2);
    p2.add(b1);

    a1.addActionListener(this);
    a2.addActionListener(this);
    b1.addActionListener(this);

    addWindowListener(new WindowExit(this));

    setSize(300, 400);
    setVisible(true);
  }

  public static void main(String[] args) {
    new B_Button();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource().equals(a1)) {
      p2.setVisible(true);
      a1.setEnabled(false);
      a2.setEnabled(true);
    } else if (e.getSource().equals(a2)) {
      p2.setVisible(false);
      a2.setEnabled(false);
      a1.setEnabled(true);
    } else if (e.getSource().equals(b1)) {
      if(p1.isVisible()) {
        System.out.println("1");
        p1.setVisible(false);
        b1.setLabel("패널1 보이기");
      }else {
        System.out.println("2");
        p1.setVisible(true);
        b1.setLabel("패널1 감추기");
      }
    }
  }
}

// 실습과제 : 패널을 추가 생성하고 이름은 "패널 1,2 보이기", "패널 1,2 안보이기"로 합니다.
//			해당 기능을 구현합니다.