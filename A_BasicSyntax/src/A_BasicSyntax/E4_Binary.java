package A_BasicSyntax;

public class E4_Binary {
	public static void main(String args[]) {
		float num;
		int repeat = 4;
		num = 1;
		for(int i = 0; i < repeat; i++ ) {
			System.out.print("["+ i + "] " + num + " \t= ");
			System.out.println(Integer.toBinaryString(Float.floatToIntBits(num)));
			num *= 2;
		}
		
		num = -1;
		for(int i = 0; i < repeat; i++ ) {
			System.out.print("["+ i + "] " + num + " \t= ");
			System.out.println(Integer.toBinaryString(Float.floatToIntBits(num)));
			num *= 2;
		}
		
		num = 1;
		for(int i = 0; i < repeat; i++ ) {
			System.out.print("["+ i + "] " + num + " \t= ");
			System.out.println(Integer.toBinaryString(Float.floatToIntBits(num)));
			num /= 2;
		}
		
		num = -1;
		for(int i = 0; i < repeat; i++ ) {
			System.out.print("["+ i + "] " + num + " \t= ");
			System.out.println(Integer.toBinaryString(Float.floatToIntBits(num)));
			num /= 2;
		}
		
		num = 1;
		for(int i = 0; i < repeat; i++ ) {
			System.out.print("["+ i + "] " + (1+num) + " \t= ");
			System.out.println(Integer.toBinaryString(Float.floatToIntBits((1+num))));
			num /= 2;
		}
	}
}
