package Quiz;
/*
 * UML 다이어그램을 나타낸 것이다.
 * 
 * User
 * ------------
 * - age : int
 * - name : String
 * ------------
 * + getSchedule() : Schedule
 * + Introduce(String) : void
 * 
 * 어떤 다이어그램을 구현한 것인가? Class diagram
 */

@SuppressWarnings("unused")
public class T01Q10_class {
	public class User {
		private int age;
		private String name;
		
		public Schedule getSchedule() {
			return null;
		}
		public void introduce(String introduce) {
		}
	}
	
	class Schedule{}
}
