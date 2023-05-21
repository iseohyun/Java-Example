/*
 *  윈도우 종료 이벤트를 보다 간편하게 구현 할 수 있습니다.
 * 
 *  같은 패키지 않에 WindowExit로 작성된 클래스를 참조해야 합니다.
 * 
 *  앞선 예제에서 WindowListener를 상속받음으로 인해서 의도하지 않은 모든 메서드가 반드시 재정의 되어야 하는 불편함을 보았습니다.
 */
package a_Basic;

import java.awt.Frame;

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