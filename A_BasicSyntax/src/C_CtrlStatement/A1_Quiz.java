package C_CtrlStatement;

import java.io.*;
import java.util.Random;

public class A1_Quiz {
	public static void main(String[] args) throws IOException {
		Random rand = new Random();
		int a = rand.nextInt(10);
		
		// 프로그램에서 임의의 난수(0~10)를 입력합니다.
		// 입력된 난수를 출력합니다.
		System.out.println("난수 : " + a);
		// 5보다 클 때 : System.out.println("5보다 큰 수 입니다.");
		// 5와 같을 때 : System.out.println("5입니다.");
		// 5보다 작을 때 : System.out.println("5보다 작은 수 입니다.");
		
		// Quiz 1 : 조건문(if)를 사용하여, 위 3개의 문구가 출력될 수 있도록 합니다.
	}
}
