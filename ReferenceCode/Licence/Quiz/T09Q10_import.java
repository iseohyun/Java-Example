package Quiz;

/**?***/import java.util.Scanner;

/*
 * �м������ ���ÿ�.
 * 
 */

public class T09Q10_import {
	public static void main(String[] args) {
		int x, y;
		System . out.print( "�� ������ �Է��Ͻÿ� : ") ;
		Scanner stdlnput = new Scanner(System.in) ;
		
		x = stdlnput.nextInt();
		y = stdlnput.nextInt();
		
		System.out.println(x + " �� " + y + " �� ���� ��� : " + (x + y)) ;
		
		stdlnput.close();
	}
}