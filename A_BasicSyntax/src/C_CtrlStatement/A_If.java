package C_CtrlStatement;

import java.io.*;

public class A_If {
	public static void main(String[] args) throws IOException {
		int ans;
		
		System.out.println("����� ����Դϱ�? [Y/y = Yes] :");
		ans = System.in.read();
		
		if(ans == 'y') {
			System.out.println("����� ����Դϴ�.");
		}else if(ans == 'Y'){
			System.out.println("����� ���� ����Դϴ�.");
		}else {
			System.out.println("����� ����� �ƴϹǴϴ�.");
		}
	}
}
