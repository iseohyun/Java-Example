package Quiz;

/*
 * �м������ ���ÿ�.
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
		System.out.println("�̸��� " + name + "�Դϴ�.");
	}
}

public class T08Q10_init{
	public static void main(String[] args) {
		Person p1 = new Person() ;
		Person p2 = new Person("����");
		p1.printPerson();
		p2. printPerson();
	}
}