package Quiz;

/**?***/import java.util.Scanner;

/*
 * 분석결과를 쓰시오.
 * 
 */

public class T09Q10_import {
	public static void main(String[] args) {
		int x, y;
		System . out.print( "두 정수를 입력하시오 : ") ;
		Scanner stdlnput = new Scanner(System.in) ;
		
		x = stdlnput.nextInt();
		y = stdlnput.nextInt();
		
		System.out.println(x + " 와 " + y + " 의 덧셈 결과 : " + (x + y)) ;
		
		stdlnput.close();
	}
}