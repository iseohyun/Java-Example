package C_Math;

public class A_Sqrt {
	public static void main(String[] args) {
		System.out.println("Pi : " + Math.PI);
		System.out.println("e  : " + Math.E);

		double r = 3;
		double h = 10;

		// �������� r�̰�, ���̰� h�� �������...
		double s; // s = �ѳ���
		double v; // v = ����
		
		// s = 2(r^2)PI + 2rhPI
		s = 2* Math.sqrt(r) * Math.PI + 2 * r * h * Math.PI;
		
		// v = 2(r^2)hPI
		v = 2* Math.sqrt(r) * h * Math.PI;
	}
}
