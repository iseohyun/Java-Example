package A_BasicSyntax;

import java.io.IOException;

/**
 * 
 * @author Seohyun Jung
 *
 *	���� a�� �Է��� ����, ���� 1�� �Է��� ���ϴ�. ��� �ٸ��� ���غ��ô�.
 *	11�� �Է��غ���, 1�� �Է��� �Ͱ� ���� ���ϴ�.
 *
 */

public class G_Scanf {
	public static void main(String[] args) throws IOException {
		int i;
		
		System.out.print("���ڸ� �Է��� �ּ��� : ");
		i = System.in.read();
		System.out.println("����� ������ : " + i);
		System.out.println("���ڷ� �νĽ��Ѽ� ��� : " + (char)i);
	}
}