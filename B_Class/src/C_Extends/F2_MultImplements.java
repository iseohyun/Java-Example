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
		System.out.println("³Ä¿Ë³Ä¿Ë!");
	}
	public void play() {
		System.out.println("Áã Àâ±â ³îÀÌÇÏÀÚ~!");
	}
}
class DogM implements AnimalM, Pet {
	public void cry() {
		System.out.println("¸Û¸Û!");
	}
	public void play() {
		System.out.println("»êÃ¥°¡ÀÚ~!");
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