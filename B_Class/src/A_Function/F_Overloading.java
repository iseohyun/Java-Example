package A_Function;

public class F_Overloading {
	public static void main(String[] args) {
		int i = 1;
		float f = 2.1f;
		char c = 'a';
		double d = 4.1;

		printf(i);
		printf(f);
		printf(d);
		printf(c);

	}

	static void printf(int input) {
		System.out.println("Int :" + input);
	}

	static void printf(float input) {
		System.out.println("Float :" + input);
	}

	static void printf(double input) {
		System.out.println("Double :" + input);
	}

	static void printf(char input) {
		System.out.println("Char :" + input);
	}
}