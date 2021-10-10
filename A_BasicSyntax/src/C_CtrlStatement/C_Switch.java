package C_CtrlStatement;

import A_BasicSyntax.Input;

/**
 * 
 * switch���� :
 * 	switch(������ �� ����) {
 * 		case ����:
 * 			�ٵ�;
 * 			break; (��쿡 ���� ��������)
 * 		case ����:
 *        ...
 *        ... (���ϴ� ��ŭ case �߰�)
 *      default:
 *  }
 *
 *	switch���� if���� ���������� 100% ���� ������ �����մϴ�. �������� ���� �ϱ� ���ؼ� ����ϴ� �����Դϴ�.
 *
 */
public class C_Switch {
	public static void main(String[] args) {
		int a = Input.getInt();

		switch(a){
			case 1:
				System.out.println("�ϳ�");
				break;
			case 2:
				System.out.println("��");
			case 3:
				System.out.println("��");
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
		}
	}
}

// �ǽ����� 1: 1, 2, 3, 4�� ���� �Է��غ��ϴ�.
// �ǽ����� 2: 1�� �Է����� ��, "�ϾƾƳ�"�� ��µǵ��� ������ ���ϴ�.
// �ǽ����� 3: 2�� �Է����� ��, "��"�� ��µǵ��� �ڵ带 ������ ���ϴ�.
// �ǽ����� 4: 4�� �Է����� ��, "��"�� ��µǵ��� �ڵ带 ������ ���ϴ�.
// �ǽ����� 5(�߳���): �� �ڵ�� �Ȱ��� �����ϴ� �ڵ带 if�� elseif�� �̿��Ͽ� �ۼ��غ��ϴ�.
// �ǽ����� 6(����): �� ���ڰ� 16������ ��µǵ��� ������ ���ϴ�. 
// 		0~9���� �Է��ϸ� 0~9�� ��µǰ�, A=10, B=11, C=12, D=13, E=14, F=15�� ��µǵ��� switch���� �����ϼ���.
//		char a = Input.getChar(); // ���ڸ� �Է¹޽��ϴ�.