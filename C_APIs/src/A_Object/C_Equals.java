package A_Object;

import A_Object.Animal;

public class C_Equals {
	public static void main(String [] str) {
		Animal cat01 = new Animal("감자");
		Animal cat02 = new Animal("오이");
		
		System.out.println(cat01.equals(cat02));
		cat01.info();
		cat02.info();
		
		System.out.println();
		cat01 = cat02;
		System.out.println(cat02.equals(cat01));
		cat01.info();
		cat02.info();
		
		cat02.name = "수박";
		cat01.info();
		cat02.info();
		
		cat01.name = "당근";
		cat01.info();
		cat02.info();
	}
}
