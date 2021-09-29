package B_Class;

@SuppressWarnings("unused")
public class B_Initialize {
	static class Class1 {
		Class1() {
			System.out.println("생성시 호출");
		}
	}

	public static void main(String[] args) {
		Class1 c1 = new Class1();
	}
}