package C_Exception;

import javax.swing.JOptionPane;

public class E_Quiz {
	public static void main(String[] args) {
		int num = 0;
		String input = JOptionPane.showInputDialog("���ڸ� �Է��ϼ���.");
		try {
			num = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			input = JOptionPane.showInputDialog("���ھƴ�. ���ڸ� �Է��ϼ���.");
			// ���⼭�� ���ڸ� �Է����� �ʴ´ٸ�?
			num = Integer.parseInt(input);
		} catch (Exception e) {
		}
		System.out.println(num);
	}
}