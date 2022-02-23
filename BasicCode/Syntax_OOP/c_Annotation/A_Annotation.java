package c_Annotation;

@FunctionalInterface
interface Sub {
	public int sub(int x, int y);
}

@FunctionalInterface
interface Sum {
	public int sum(int x, int y);
}

public class A_Annotation {
	public static void main(String[] args) {
		Sub Num01 = (x, y) -> x - y;
		System.out.println(Num01.sub(3, 4));

		Sum Num02 = (x, y) -> x + y;
		System.out.println(Num02.sum(3, 4));

		Sub Num03 = (x, y) -> x + y;
		System.out.println(Num03.sub(3, 4));
	}
}