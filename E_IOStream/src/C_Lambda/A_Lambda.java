package C_Lambda;

public class A_Lambda {
	public static void main(String [] args) {
		new Thread(new Runnable() {
			public void run() {
				System.out.println("�������� ����� ��ȸ�� ������ ����");
			}
		}).start();

		new Thread(()->{
			System.out.println("���� ǥ������ ����� ��ȸ�� ������ ����");
		}).start();
	}
}
