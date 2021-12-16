package Example;

interface sum{
	default int add(int a, int b) {
		return a + b;
	}

	default float add(float a, float b) {
		return a + b;
	}

	default double add(double a, double b) {
		return a + b;
	}

	default String add(String a, String b) {
		return a + b;
	}
}

class Template<T> implements sum{
	T add(T a, T b) {
		return add(a, b);
	}
}

public class Temp {
	public static void main(String[] args) {
		Template<?> t = new Template<>();
		System.out.println(t.add(1, 2));
		System.out.println(t.add(1.1f, 2.2f));
		System.out.println(t.add(1.1, 2.2));
		System.out.println(t.add("abcd", "EFGH"));	
	}
}