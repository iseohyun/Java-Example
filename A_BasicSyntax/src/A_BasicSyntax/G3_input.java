package A_BasicSyntax;

/**
 * 
 * @author Seohyun Jung
 *
 *	이번 예제는 단순히 입력을 쉽게 하기 위한 과정입니다.
 *	getNum은 Java에서 기본적으로 제공하는 함수가 아니고, input.java에서 사용자가 작성한 파일입니다.
 *	클레스와, 예외까지 학습을 해야 이해 할 수 있는 내용이므로, 당장 이해하실 필요가 없습니다.
 *
 */

public class G3_input {
	public static void main(String[] args) {
		int num = Input.getNum();
		System.out.println("입력한 숫자 : " + num);
	}
}