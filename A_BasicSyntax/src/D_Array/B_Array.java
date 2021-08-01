package D_Array;

public class B_Array {
	public static void main(String[] agrs) {
		int[] grade = new int[4];

		grade[0] = 50;
		grade[1] = 60;
		grade[2] = 70;
		grade[3] = 60;

		for(int i=0; i < 4; i++) {
			grade[i] += 10;
			System.out.println(grade[i]);
		}
	}
}
