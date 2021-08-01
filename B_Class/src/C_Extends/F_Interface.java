package C_Extends;

interface Animal2 {
	public abstract void cry();
}
class Cat2 implements Animal2 {
	public void cry() {
		System.out.println("衬克衬克!");
	}
}
class Dog2 implements Animal2 {
	public void cry() {
		System.out.println("港港!");
	}
}

public class F_Interface {
	public static void main(String[] args) {
		Cat2 c = new Cat2();
		Dog2 d = new Dog2();

		c.cry();
		d.cry();
	}
}