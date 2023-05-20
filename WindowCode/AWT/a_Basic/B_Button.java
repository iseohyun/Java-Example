package a_Basic;

import java.awt.Button;
import java.awt.Frame;

@SuppressWarnings("serial")
public class B_Button extends Frame {
  // Button클래스는 버튼을 생성하는 클래스 입니다.
  Button b = new Button("안녕?");

  B_Button() {
    // 생성된 인스턴스를 추가해 주어야 합니다. add는 Frame이 가진 메서드 입니다.
    add(b);

    setSize(300, 400);
    setVisible(true);
  }

  public static void main(String[] args) {
    new B_Button();
  }
}

// 실습과제 : 버튼을 추가해 봅니다. 추가한 버튼은 "어, 안녕!" 을 입력해 줍니다.
// 실습과제 : 버튼이 보이지 않나요? Layout(레이아웃; 배치)때문입니다.
//			아래 코드를 생성자에 추가해 줍니다.
//			setLayout(new FlowLayout());