package A_Object;

public class C_Equals {
	public static void main(String [] args) {
		Animal cat01 = new Animal("����");
		Animal cat02 = new Animal("����");
		
		System.out.println(cat01.equals(cat02));
		cat01.info();
		cat02.info();
		
		System.out.println();
		cat01 = cat02;
		System.out.println(cat02.equals(cat01));
		cat01.info();
		cat02.info();
		
		cat02.name = "����";
		cat01.info();
		cat02.info();
		
		cat01.name = "���";
		cat01.info();
		cat02.info();
	}
}
