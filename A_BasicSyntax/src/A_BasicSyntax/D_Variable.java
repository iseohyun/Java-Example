package A_BasicSyntax;

/**
 * 
 * @author Seohyun Jung
 *
 *	����� ������ �̿��Ͽ� ���� �� �� �ֽ��ϴ�. ������ ���ڿ� ���ڷ� ���е˴ϴ�.
 *	 ���ڴ� ������ �Ҽ��� ���е˴ϴ�.
 *	 ���ڴ� ���ڿ� ���ڿ��� ���е˴ϴ�.
 *
 */

public class D_Variable {
	public static void main(String[] args) {
		// TODO : ������ �����غ��ô�.
		String person = "��";
		String name = "������";
		int birthYear = 2000;
		int age = 20;
		double tall = 174.9;			//float tall = 174.9f;
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
