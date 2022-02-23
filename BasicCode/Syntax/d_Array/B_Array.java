package d_Array;

/**
 * 
 * 배열은 선언시 :
 * 		타입[] 변수명 = new 타입[갯수];
 *
 */
public class B_Array {
	public static void main(String[] agrs) {
		int[] grade = new int[4];

		grade[0] = 87;
		grade[1] = 92;
		grade[2] = 83;
		grade[3] = 71;

		for(int i=0; i < 4; i++) {
			grade[i] += 10;
			System.out.println(grade[i]);
		}
	}
}

//실습과제 1: 15점씩 올려주기로 하였습니다. 만약 100점이 넘으면 100점으로 출력해주세요. (if문을 사용하세요) 