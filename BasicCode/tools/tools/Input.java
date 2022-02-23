package tools;

import javax.swing.JOptionPane;

public interface Input {
	static int getInt() {
		int num = 0;
		String msg = "���ڸ� �Է��ϼ���.";
		boolean isInt = false;
		while (!isInt) {
			String input = JOptionPane.showInputDialog(msg);
			try {
				num = Integer.parseInt(input);
				isInt = true;
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
		boolean isDouble = false;
		while (!isDouble) {
			String input = JOptionPane.showInputDialog(msg);
			try {
				num = Double.parseDouble(input);
				isDouble = true;
			} catch (NumberFormatException e) {
				msg = "\"" + input + "\"�� ���ڰ� �ƴմϴ�. ���ڸ� �Է��ϼ���.";
			}
		}
		return num;
	}
}