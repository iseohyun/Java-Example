package d_Array;

/**
 * 
 * �迭�� ����� :
 * 		Ÿ��[] ������ = new Ÿ��[����];
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

//�ǽ����� 1: 15���� �÷��ֱ�� �Ͽ����ϴ�. ���� 100���� ������ 100������ ������ּ���. (if���� ����ϼ���) 