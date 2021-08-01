package C_Extends;

abstract class Animal {
	abstract void cry();
}

class Cat extends Animal {
	void cry() {
		System.out.println("�Ŀ˳Ŀ�!");
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("�۸�!"); 
	}
}

public class E_Abstract {
    public static void main(String[] args) {
        // Animal a = new Animal(); // �߻� Ŭ������ �ν��Ͻ��� ������ �� ����.
        Cat c = new Cat();
        Dog d = new Dog();

        c.cry();
        d.cry();
    }
}