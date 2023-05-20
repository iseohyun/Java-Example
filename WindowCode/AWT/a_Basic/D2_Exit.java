package a_Basic;

import java.awt.Frame;

// 앞선 예제에서 WindowListener를 상속받음으로 인해서 불필요한 메서드가 반드시 재정의 되어야 하는 불편함을 보았습니다.
// WindowAdapter를 이용하여, 불필요한 코드를 줄일 수 있습니다.

@SuppressWarnings("serial")
public class D2_Exit extends Frame {
  public D2_Exit() {
    addWindowListener(new WindowExit(this));

    setSize(300, 400);
    setVisible(true);
  }

  public static void main(String[] args) {
    new D2_Exit();
  }
}