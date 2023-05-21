/*
*  프로그램이 종료되지 않는 이유는 종료 이벤트에 대해서 구현하지 않았기 때문입니다. 강제 종료하십시오.
* 
*/

package a_Basic;

import java.awt.Frame;

@SuppressWarnings("serial")
// 이 예제의 핵심은 Frame 클래스를 상속받았다는 것입니다.
public class A1_Create extends Frame {
    A1_Create() {
        // 1. 창의 크기를 결정합니다.
        setSize(300, 400);

        // 2. 아래 메서드를 추가하지 않으면 정상적으로 보이지 않습니다.
        setVisible(true);
    }

    public static void main(String[] args) {
        // 3. 윈도우 프로그램이든, 네트워크 프로그램이든 모든 프로그램의 시작은 main입니다.
        // A_Create myClass = new A_Create(); 에서 myClass는 사용되지 않기 때문에 생략되었습니다.
        new A1_Create();
    }
}

// 실습과제 : 창의 크기를 늘려봅시다. 500, 400으로 바꾸면 가로와 세로 중 어느것이 더 길어지나요?
// 실습과제 : visible을 주석처리하면 어떤 일이 벌어지나요?