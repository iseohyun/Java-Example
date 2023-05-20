package b_Component;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class D_Choice extends Frame implements ItemListener {
  boolean isFirst = true;
  Choice c = new Choice();

  D_Choice() {
    c.add("원하는 색을 선택해주세요.");
    c.add("빨간색");
    c.add("주황색");
    c.add("노란색");
    c.add("초록색");
    add(c);
    
    
    c.addItemListener(this);
    
    addWindowListener(new WindowExit(this));

    setSize(300, 400);
    setVisible(true);
  }

  public static void main(String[] args) {
    new D_Choice();
  }

  @Override
  public void itemStateChanged(ItemEvent e) {
    System.out.println(e.getItem());
    if(e.getItem() == "빨간색") {
      setBackground(Color.red);
    }else if(e.getItem() == "주황색") {
      setBackground(Color.orange);
    }else if(e.getItem() == "노란색") {
      setBackground(Color.yellow);
    }else if(e.getItem() == "초록색") {
      setBackground(Color.green);
    }
    
    if(isFirst) {
      c.remove(0);
      isFirst = false;
    }
  }
}

// 실습과제 "파란색"을 추가해봅니다.
// 실습과제 최초에 "빨간색"을 삭제해 봅니다. 
