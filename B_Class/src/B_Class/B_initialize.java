package B_Class;

class ClassInit {
	ClassInit(){
		System.out.println("호출 될까?");
	}
}

public class B_initialize {
	public static void main(String[] args) {
		ClassInit class1 = new ClassInit();
	}
}
