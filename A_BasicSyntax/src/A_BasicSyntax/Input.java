package A_BasicSyntax;

import javax.swing.JOptionPane;

public interface Input {
	static int getInt() {
		int num = 0;
		String msg = "숫자를 입력하세요.";
		while (num == 0) {
			String input = JOptionPane.showInputDialog(msg);
			try {
				num = Integer.parseInt(input);
				break;
			} catch (NumberFormatException e) {
				msg = "\"" + input + "\"은 숫자가 아닙니다. 숫자를 입력하세요.";
			}
		}
		return num;
	}
	
	static String getString() {
		return JOptionPane.showInputDialog("문자열을 입력해 주세요.");
	}
	
	static char getChar() {
		String Char = JOptionPane.showInputDialog("문자를 입력해 주세요. 여러문자를 입력하면 첫 문자만 입력이 됩니다.");
		return Char.charAt(0);
	}
	
	static double getDouble() {
		double num = 0;
		String msg = "숫자를 입력하세요.(소수가능)";
		while (num == 0) {
			String input = JOptionPane.showInputDialog(msg);
			try {
				num = Double.parseDouble(input);
				break;
			} catch (NumberFormatException e) {
				msg = "\"" + input + "\"은 숫자가 아닙니다. 숫자를 입력하세요.";
			}
		}
		return num;
	}
}