package A_Object;

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
