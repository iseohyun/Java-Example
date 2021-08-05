package C_Lambda;

import java.util.function.DoubleUnaryOperator;

public class C_MethodReference {
	public static void main(String[] args) {
		DoubleUnaryOperator oper;
		
		oper = (n) -> Math.abs(n);
		System.out.println(oper.applyAsDouble(-5));
		
		oper = Math::abs;
		System.out.println(oper.applyAsDouble(-5));
	}
}
