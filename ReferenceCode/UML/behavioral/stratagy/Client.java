package behavioral.stratagy;

import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * @author Seohyun Jung
 * 
 *		�������� : ����� �߰� �Ǵ���, '����߰�'�� �̿��Ͽ�
 *			�ڵ����� �þ�� �ʰ�, ������ ������ �ϴ� ����
 *
 *		���� ���, �Ʒ������� btn.add()�� �߰�/���������� ����� �߰��� �Ǿ��ٸ�,
 *			������������ �߰��ؾ��ϴ� ���(�Ǵ� ����)�� ã�ư��� ����� ���� �Ǵ� �����ؾ��ϹǷ�,
 *			�������� ȥ�������� ������ �������.
 *
 */

public class Client {
	public static void main(String[] args) throws IOException {
		Button btn = new Button();
		btn.add("Search all...");
		btn.add("Search image...");
		btn.add("Search news...");
		btn.add("Search map...");

		System.out.print("Input Number[1-4] : ");
		int mode = System.in.read() - '1';

		btn.clicked(mode);
	}

	static class Button {
		ArrayList<String> func = new ArrayList<String>();

		void clicked(int mode) {
			System.out.println(func.get(mode));
		}

		void add(String function) {
			func.add(function);
		}
	}
}