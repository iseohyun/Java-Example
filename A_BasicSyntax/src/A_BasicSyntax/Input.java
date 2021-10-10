package A_BasicSyntax;

import javax.swing.JOptionPane;

public interface Input {
	static int getInt() {
		int num = 0;
		String msg = "���ڸ� �Է��ϼ���.";
		while (num == 0) {
			String input = JOptionPane.showInputDialog(msg);
			try {
				num = Integer.parseInt(input);
				break;
			} catch (NumberFormatException e) {
				msg = "\"" + input + "\"�� ���ڰ� �ƴմϴ�. ���ڸ� �Է��ϼ���.";
			}
		}
		return num;
	}
	
	static String getString() {
		return JOptionPane.showInputDialog("���ڿ��� �Է��� �ּ���.");
	}
	
	static char getChar() {
		String Char = JOptionPane.showInputDialog("���ڸ� �Է��� �ּ���. �������ڸ� �Է��ϸ� ù ���ڸ� �Է��� �˴ϴ�.");
		return Char.charAt(0);
	}
	
	static double getDouble() {
		double num = 0;
		String msg = "���ڸ� �Է��ϼ���.(�Ҽ�����)";
		while (num == 0) {
			String input = JOptionPane.showInputDialog(msg);
			try {
				num = Double.parseDouble(input);
				break;
			} catch (NumberFormatException e) {
				msg = "\"" + input + "\"�� ���ڰ� �ƴմϴ�. ���ڸ� �Է��ϼ���.";
			}
		}
		return num;
	}
}