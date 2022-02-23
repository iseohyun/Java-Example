package behavioral.interpreter;

import java.util.ArrayDeque;
import java.util.Map;
/**
 * 출처 : https://en.wikipedia.org/wiki/Interpreter_pattern
 * 
 * @author Seohyun Jung
 *
 *	코드 해석)
 * 		+---+		+---+		+---+		+---+
 *		|	|		|	|		|	|		|	|
 *		+---+		+---+		+---+		+---+
 *		| + |		|   |		|	|		|	|
 *		+---+		+---+		+---+		+---+
 *		| - |		|   |		|	|		|	|
 *		+---+		+---+		+---+		+---+
 *		| z |		| 42|		|	|		|	|
 *		+---+		+---+		+---+		+---+
 *		| x |		| 10|		|-32| 10-42	|   |
 *		+---+		+---+		+---+		+---+
 *		| w |		| 5 |		| 5 |		|-27| 5 + (-32)
 *		+---+		+---+		+---+		+---+
 *		 <1>		 <2>		 <3>		 <4>
 *
 *		3 > + 가 입력된 순간 더 terminate이므로, 뺄셈을 진행
 *
 *		4 > - 가 입력된 순간 더이상 저장하지 않고, 덧셈 진행
 */


public class Client2 {
	public static void main(final String[] args) {
		Expr expr = parse("w x z - + Q1 +"); // 1>
		Map<String, Integer> context = Map.of("w", 5, "x", 10, "z", 42);

		// 이해를 돕기 위한 테스트 코드
		// Expr expr = parse("w x z - +");
		// Map<String, Integer> context = Map.of("w", 5, "x", 10, "z", 42, "Q1", 40);

		int result = expr.interpret(context); // 2>
		System.out.println(result);
	}

	public static Expr parse(String expression) { // 1>
		ArrayDeque<Expr> stack = new ArrayDeque<Expr>();
		for (String token : expression.split(" ")) {
			stack.push(parseToken(token, stack));
		}
		return stack.pop();
	}

	@FunctionalInterface
	public interface Expr {
		int interpret(Map<String, Integer> context);

		static Expr number(int number) {
			return context -> number;
		}

		static Expr plus(Expr left, Expr right) {
			return context -> left.interpret(context) + right.interpret(context);
		}

		static Expr minus(Expr left, Expr right) {
			return context -> left.interpret(context) - right.interpret(context);
		}

		static Expr variable(String name) {
			return context -> context.getOrDefault(name, 0);
		}
	}

	private static Expr parseToken(String token, ArrayDeque<Expr> stack) {
		Expr left, right;
		switch (token) {
		case "+":
			right = stack.pop();
			left = stack.pop();
			return Expr.plus(left, right);
		case "-":
			right = stack.pop();
			left = stack.pop();
			return Expr.minus(left, right);
		default:
			return Expr.variable(token);
		}
	}
}