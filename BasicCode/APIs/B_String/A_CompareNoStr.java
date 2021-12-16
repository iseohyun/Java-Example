package B_String;

public class A_CompareNoStr {
	public static void main(String[] args) {
		char[] char1 = { 'j', 'a', 'v', 'a', 'c', 'o', 'd', 'e' };
		char[] char2 = { 'j', 'a', 'v', 'a', 'C', 'o', 'd', 'e' };
		char[] char3 = { 'j', 'a', 'v', 'a', 'c', 'o', 'd', 'e' };
		int ret;

		System.out.print("char1 : ");
		System.out.println(char1);
		System.out.print("char2 : ");
		System.out.println(char2);
		System.out.print("char3 : ");
		System.out.println(char3);

		System.out.println("<<char1, char2 ��>>");
		ret = compareChar(char1, char2, min(char1.length, char2.length));
		printCompResault(ret);

		System.out.println("<<char1, char3 ��>>");
		ret = compareChar(char1, char3, min(char1.length, char3.length));
		printCompResault(ret);
	}

	public static int compareChar(char[] str1, char[] str2, int len) {
		for (int i = 0; i < len; i++) {
			if (str1[i] != str2[i]) {
				return i;
			}
		}
		return 0;
	}

	public static int min(int a, int b) {
		if (a > b) {
			return b;
		} else {
			return a;
		}
	}

	public static void printCompResault(int ret) {
		if (ret > 0) {
			System.out.println("String �Լ� ��� : ����ġ(���� ��)");
		} else if (ret < 0) {
			System.out.println("String �Լ� ��� : ����ġ(���� ����)");
		} else {
			System.out.println("String �Լ� ��� : ��ġ");
		}
	}
}