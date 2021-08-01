package C_Extends;

import B_Class.D_This;

interface AnimalM {
	public abstract void cry();
}
interface Pet {
	public abstract void play();
}

class CatM implements AnimalM, Pet {
	public void cry() {
		System.out.println("�Ŀ˳Ŀ�!");
	}
	public void play() {
		System.out.println("�� ��� ��������~!");
	}
}
class DogM implements AnimalM, Pet {
	public void cry() {
		System.out.println("�۸�!");
	}
	public void play() {
		System.out.println("��å����~!");
	}
}

public class F2_MultImplements {
	public static void main(String[] args) {
		CatM c = new CatM();
		DogM d = new DogM();
		
		c.cry();
		c.play();
		d.cry();
		d.play();
    }
}