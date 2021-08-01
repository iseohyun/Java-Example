package A_Function;

public class F2_Orders {
	public static void main(String[] args) {
		int i = 1;
		float f = 2.1f;
		
		printf(i, i);
		printf(i, f);
		printf(f, i);
	}

	static void printf(int input, int input2) {
		System.out.println("Int :" + input + " , Int2 :" + input2);
	}
	static void printf(int input, float input2) {
		System.out.println("Int :" + input + " , Float :" + input2);
	}
	static void printf(float input, int input2) {
		System.out.println("Float :" + input + " , Int :" + input2);
	}
}