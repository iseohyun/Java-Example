package B_Class;

class CtrlVal {
	int value = 0;
	void setValue(int input) {
		value = input;
	}
	int getValue() {
		return value;
	}
}

public class A2_Members {
	public static void main(String[] args) {
		CtrlVal class1 = new CtrlVal();
		int ret;
		System.out.println("���� �� : " + class1.value);
		
		class1.setValue(3);
		ret = class1.getValue();
		System.out.println("���� �� : " + class1.value);
		System.out.println("���� �� : " + ret);
		
		class1.setValue(9);
		ret = class1.getValue();
		System.out.println("���� �� : " + class1.value);
		System.out.println("���� �� : " + ret);
	}
}
