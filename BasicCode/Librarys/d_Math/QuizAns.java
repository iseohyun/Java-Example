package d_Math;

public class QuizAns {
	public static void main(String[] args) {
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
		// radian = Math.sin(40.0/180.0 * Math.PI); // (40��= 40/180PI�̴�.)

		// �ڻ��� ��Ģ a^2 = b^2 + c^2 - 2bccosA
		double a = Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2) - 2 * b * c * Math.cos(Math.toRadians(degree)));

		// ���� S = 1/2*sinA*bc = 1/2 ah
		// h = sinA*bc/a
		double ret = Math.sin(Math.toRadians(degree)) * b * c / a;

		// ���� Ȯ�� (https://www.desmos.com/calculator/p83wgrjq95)
		// ���� : 3.9980580410364297
		return ret;
	}
}