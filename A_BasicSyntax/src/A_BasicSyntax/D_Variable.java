package A_BasicSyntax;

/**
 * 
 *	 ����� ������ �̿��Ͽ� ���� �� �� �ֽ��ϴ�. ������ ���ڿ� ���ڷ� ���е˴ϴ�.
 *	 ���ڴ� ������ �Ҽ��� ���е˴ϴ�.
 *	 ���ڴ� ���ڿ� ���ڿ��� ���е˴ϴ�.
 *
 */

public class D_Variable {
	public static void main(String[] args) {
		String person = "��";
		String name = "������";
		int birthYear = 2000;
		int age = 20;
		double tall = 174.9;
		String hobby = "��";
		String dream = "�ְ��� ���α׷���";
		
		System.out.println(person + "�� �̸��� " + name + "�Դϴ�.");
		System.out.println(person + "�� " + birthYear + "�⿡ �¾��, " + age + "�� �Դϴ�.");
		System.out.println(person + "�� Ű�� " + tall + "��ġ �Դϴ�.");
		System.out.println(person + "�� ��̴� " + hobby + " �Դϴ�.");
		System.out.println(person + "�� ���� " + dream + "�� �Ǵ� ���Դϴ�.");
		
		System.out.println("\n"+ person + "�� " + (2021 - age + 1) + "�⿡ �¾��, " + age + "�� �Դϴ�.");
	}
}

// �ǽ����� 1: "��"�� "ģ��"�� �ٲپ�ϴ�.
