/*
 * 타이틀 바에 문구를 출력하는 예시입니다.
 * 
 */

package a_Basic;

import java.awt.Frame;

@SuppressWarnings("serial")
public class A2_title extends Frame {
    public A2_title(String title) {
        // 프로그램의 타이틀바에 넣을 문자를 지정합니다.
        super(title);
        setSize(300, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new A2_title("Title Name");
    }
}
