package B_Class;

class ClassInits {
	ClassInits(){
		System.out.println("ȣ�� �ɱ�?");
	}
	ClassInits(int i){
		System.out.println("���� ����?" + i);
	}
	ClassInits(char c){
		System.out.println("���� ���?" + c);
	}
	
}

public class B1_overloading {
	public static void main(String[] args) {
		ClassInits class1 = new ClassInits();
		ClassInits class2 = new ClassInits(1);
		ClassInits class3 = new ClassInits('A');
	}
}
