package g_Exception;

import javax.swing.JOptionPane;

public class E2_CatchCatch {
  public static void main(String[] args) {
    int num = 0;
    String input = JOptionPane.showInputDialog("숫자를 입력하세요.");
    try {
      num = Integer.parseInt(input);
    } catch (NumberFormatException e) {
      input = JOptionPane.showInputDialog("숫자아님. 숫자를 입력하세요.");
      // 여기서도 숫자를 입력하지 않는다면?
      try {
        num = Integer.parseInt(input);
      } catch (NumberFormatException e2) {
        input = JOptionPane.showInputDialog("숫자를 입력하세요. 제발");
        // 여기서도 또 숫자를 입력하지 않는다면?
        num = Integer.parseInt(input);
      }
    } catch (Exception e) {
    }
    System.out.println(num);
  }
}