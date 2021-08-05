package C_CtrlStatement;

public class A1_IfVariable {
	public static void main(String[] args){
		int a, b;
		
		a = 3;
		b = 3;
		if( a > b ) {
			System.out.println("Right?");
		}
		
		b = 4;
		if( a < b ) {
			System.out.println("Right!");
		}
		
		// TODO : a와 b가 같을 경우 "Same~Same"을 출력하세요.
		a = 4;
	}
}
