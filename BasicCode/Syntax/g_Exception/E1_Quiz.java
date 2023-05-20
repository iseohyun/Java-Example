/*
 * 숫자를 입력받는 프로그램입니다.
 *   최초에 사용자가 숫자를 입력하지 않으면, 숫자가 아니라는 경고가 출력 됩니다.
 *   재차 문자를 입력하면, 프로그램이 (정상) 종료됩니다.
 *   만약, 이후에 입력값으로 동작하는 코드가 존재했다면, 비정상 종료될 것입니다.
 * 
 */

package g_Exception;

import javax.swing.JOptionPane;

public class E1_Quiz {
    public static void main(String[] args) {
        int num = 0;
        String input = JOptionPane.showInputDialog("숫자를 입력하세요.");
        try {
            num = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            input = JOptionPane.showInputDialog("숫자아님. 숫자를 입력하세요.");
            // 여기서도 숫자를 입력하지 않는다면?
            num = Integer.parseInt(input);
        } catch (Exception e) {
        }
        System.out.println(num);
    }
}