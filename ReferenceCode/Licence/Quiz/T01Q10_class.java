package Quiz;
/*
 * UML ���̾�׷��� ��Ÿ�� ���̴�.
 * 
 * User
 * ------------
 * - age : int
 * - name : String
 * ------------
 * + getSchedule() : Schedule
 * + Introduce(String) : void
 * 
 * � ���̾�׷��� ������ ���ΰ�? Class diagram
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
