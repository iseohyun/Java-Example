package C_CtrlStatement;

import java.io.IOException;

public class C_Switch {
	public static void main(String[] args) throws IOException {
		int ans;

		System.out.println("���ڸ� �Է����ּ���? [0-9] :");

		ans = System.in.read();
		switch(ans-'0'){
			case 0: case 1: case 2: case 3:
				System.out.println("3����");
				break;
			case 4: case 5: case 6:
				System.out.println("4�̻� 6����");
				break;
			case 7: case 8: case 9:
				System.out.println("7�̻�");
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
		}
	}
}
