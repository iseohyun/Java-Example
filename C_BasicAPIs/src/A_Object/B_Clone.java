package A_Object;

public class B_Clone {
	public static void main(String[] args) {
		Animal cat01 = new Animal("ö��");
		Animal cat02 = new Animal("ŰƼ");
		Animal cat03 = (Animal) cat01.clone();
		cat01.info();
		cat02.info();
		cat03.info();
		System.out.println();

		cat03.name = "�޸�";
		cat01.info();
		cat02.info();
		cat03.info();
	}
}
