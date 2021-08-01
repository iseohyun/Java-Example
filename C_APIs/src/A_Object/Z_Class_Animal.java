package A_Object;
public class Z_Class_Animal {
	
}

class Animal implements Cloneable {
	String name = "³ªºñ";
	
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
