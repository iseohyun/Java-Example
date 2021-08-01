package B_Class;

class ClassInits {
	ClassInits(){
		System.out.println("호출 될까?");
	}
	ClassInits(int i){
		System.out.println("나는 누구?" + i);
	}
	ClassInits(char c){
		System.out.println("여긴 어디?" + c);
	}
	
}

public class B1_overloading {
	public static void main(String[] args) {
		ClassInits class1 = new ClassInits();
		ClassInits class2 = new ClassInits(1);
		ClassInits class3 = new ClassInits('A');
	}
}
