package d_Math;

public class Quiz {
	public static void main(String [] args) {
		double b = 4;
		double c = 6;
		double h;
		double degree = 50;

		// Quiz: getH() �Լ� �Ƿ�.
		// �ﰢ�� ABC�� �� ���� a, b, c��� ����.
		// �� A�� �� b�� c���̿� �ִ� ���̶�� �� ��,
		// ��A, ��b, ��c�� �̿��Ͽ�, ����h(���� BC���� ��A������ �Ÿ�)�� ���ϴ� �Լ��� ����ÿ�.
		h = getH(b, c, degree);
		
		System.out.println("���� : " + h);
	}
	
	static double getH(double b, double c, double degree) {
		// radian = Math.sin(40.0/180.0 * Math.PI); 		// (40��= 40/180PI�̴�.)
		// �ڻ��� ��Ģ a^2 = b^2 + c^2 + bccosA
		// S = 1/2*sinA*bc = 1/2 ah

		double ret = 0;
		// TODO : insert your code here...
		
		return ret;
	}
}