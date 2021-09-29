package A_BasicSyntax;

import javax.swing.JOptionPane;

public interface Input {
	static int getNum() {
		int num = 0;
		while (num == 0) {
			String input = JOptionPane.showInputDialog("숫자를 입력하세요.");
			try {
				num = Integer.parseInt(input);
				if (num == 0) {
					break;
				}
			} catch (NumberFormatException e) {
			}
		}
		return num;
	}
	
	static int getNum(String str) {
		int num = 0;
		while (num == 0) {
			String input = JOptionPane.showInputDialog(str);
			try {
				num = Integer.parseInt(input);
				if (num == 0) {
					break;
				}
			} catch (NumberFormatException e) {
			}
		}
		return num;
	}
}
