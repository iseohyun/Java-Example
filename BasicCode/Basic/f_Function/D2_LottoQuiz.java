package f_Function;

import java.util.Random;

/**
 * 
 * �̹� ���並 ����� �Լ��� ������� �ֽ��ϴ�.
 * ��, �ѹ�����ϱ� ���ؼ��� 3���� �Լ��� ������� ȣ�� �ؾ��մϴ�.
 * �� 5���� ���並 ����ϱ� ���ؼ��� �� 15�� ȣ���� �̷������ �մϴ�.
 * 
 * 1. 3���� �ѹ��� ȣ�� �� �� �ִ� �Լ��� ����� ������.
 * 2. �ش� �Լ��� 5�� ȣ���غ�����.
 * 
 */

public class D2_LottoQuiz {
	static int[] lotto = new int[6];

	public static void main(String[] args) {
		genLotto(); // �ζ� ��ȣ�� �����Ѵ�.
		sort(); // ���� ��ȣ���� �����Ѵ�.
		printLotto(); // �ζ� ��ȣ�� �������Ѵ�.
	}

	// �ǽ����� . �ζ� ��ȣ�� �����ؼ�, ������� ���� �� ��, �������ϴ� �Լ��� �����Ѵ�.
	// �ǽ����� 2. �ش� �Լ��� 5�� ����Ѵ�.

	static void genLotto() {
		Random rand = new Random();

		lotto[0] = rand.nextInt(45) + 1;
		for (int i = 1; i < 6; i++) {
			lotto[i] = rand.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
	}

	static void sort() {
		for (int i = 0; i < 6; i++) {
			for (int j = i; j < 6; j++) {
				if (lotto[i] > lotto[j]) {
					lotto[i] ^= lotto[j];
					lotto[j] ^= lotto[i];
					lotto[i] ^= lotto[j];
				}
			}
		}
	}

	static void printLotto() {
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
	}
}