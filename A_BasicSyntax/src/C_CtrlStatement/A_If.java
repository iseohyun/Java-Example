package C_CtrlStatement;

import java.io.*;

public class A_If {
	public static void main(String[] args) throws IOException {
		int ans;
		
		System.out.println("당신은 사람입니까? [Y/y = Yes] :");
		ans = System.in.read();
		
		if(ans == 'y') {
			System.out.println("당신은 사람입니다.");
		}else if(ans == 'Y'){
			System.out.println("당신은 착한 사람입니다.");
		}else {
			System.out.println("당신은 사람이 아니므니다.");
		}
	}
}
