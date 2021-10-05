package Quiz;

/*
 * 분석결과를 쓰시오.
 * 
 */
class Person {
	private String name;
	Person() {
		name = "HRDKorea" ;
	}
	Person(String name) {
	/**?**/this.name = name;
	}
	public void printPerson() {
		System.out.println("이름은 " + name + "입니다.");
	}
}

public class T08Q10_init{
	public static void main(String[] args) {
		Person p1 = new Person() ;
		Person p2 = new Person("강희영");
		p1.printPerson();
		p2. printPerson();
	}
}