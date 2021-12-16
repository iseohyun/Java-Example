package Example;

import java.util.Scanner;

public class readString {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.print("Write anything :");
		String str=sc.next();
		System.out.print(str);
		sc.close();
	}
}
