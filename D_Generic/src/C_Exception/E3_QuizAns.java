package C_Exception;

import javax.swing.JOptionPane;

public class E3_QuizAns {
	public static void main(String [] args){
		int num = getNum();

		System.out.println(num);
	}
	static int getNum() {
		// Quiz 1. ���ڰ� �Էµ��� ������, ���ڰ� �Էµ� ������, �Է¹�������.
		int num = 0;
		while (num == 0) {
			String input = JOptionPane.showInputDialog("���ڸ� �Է��ϼ���.");
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
