package A_Object;

class Animal implements Cloneable {
	String name = "����";
	
	Animal(String init){
		name = init;
	}
	
	public void info() {
		System.out.println("Name : " + name);
	}
	
	public Object clone() {
		Animal animal;
		try {
			animal = (Animal)super.clone();
			return animal;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}		
	}
}

public class A_ToString {
	public static void main(String[] args) { 
		Animal dog01 = new Animal("����");
		Animal dog02 = new Animal("��¯��");
	
		System.out.println(dog01.toString());
		System.out.println(dog02.toString());
	}
}
