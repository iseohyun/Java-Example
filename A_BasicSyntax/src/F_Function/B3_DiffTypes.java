package F_Function;

public class B3_DiffTypes {
	public static void main(String[] args) {
		func1(1);
		func2(1.1f);
		func3("String");
	}

	static void func1(int input) {
		System.out.println("��� : " + input);
	}

	static void func2(float input) {
		System.out.println("��� : " + input);
	}

	static void func3(String input) {
		System.out.println("��� : " + input);
	}
}

// �ǽ����� : ����(char) 1���� �Է¹޴� �Լ��� �����ϴ�.
//		������� newFunc('x');�� ȣ���� �Ǹ�,
//		"��� : x"�� ����ǵ��� �մϴ�.
// �ǽ����� 2: ���� �빮�ڰ� �ԷµǸ� �ҹ��ڷ� �ٲٴ� ����� �߰��غ��ϴ�.
//		������� newFunc('a');�� ȣ���� �Ǹ�,
//		"��� : A"�� ����ǵ��� �մϴ�.
// �ǽ����� 3: ���ڸ� 4�� �޴� �Լ��� �����ϴ�. ���ڴ� char a, int x, char b, int y�Դϴ�.
//		�Լ��� a�� x��, b�� y���� ��µ˴ϴ�.
// �������, newFunc3('A', 3, 'B', 5);�� ȣ���� �Ǹ�, �Ʒ��� ���� ��µ˴ϴ�.
// ��� : AAABBBBB