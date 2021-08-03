package A_Object;

class Animal implements Cloneable {
	String name = "나비";
	
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

public class B_Clone {
	public static void main(String[] args) {
		Animal cat01 = new Animal("철수");
		Animal cat02 = new Animal("키티");
		Animal cat03 = (Animal) cat01.clone();
		cat01.info();
		cat02.info();
		cat03.info();
		System.out.println();

		cat03.name = "메리";
		cat01.info();
		cat02.info();
		cat03.info();
	}
}
