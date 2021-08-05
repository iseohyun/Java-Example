package C_Exception;

import javax.swing.JOptionPane;

public class E3_QuizAns {
	public static void main(String [] args){
		int num = getNum();

		System.out.println(num);
	}
	static int getNum() {
		// Quiz 1. 숫자가 입력되지 않으면, 숫자가 입력될 때까지, 입력받으세요.
		int num = 0;
		while (num == 0) {
			String input = JOptionPane.showInputDialog("숫자를 입력하세요.");
			try {
				num = Integer.parseInt(input);
				if(num==0) {break;}
			}catch (NumberFormatException e) {
			}catch (Exception e) {
			}
		}
		return num;
	}
}
