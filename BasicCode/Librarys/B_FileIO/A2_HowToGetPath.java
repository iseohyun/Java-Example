package B_FileIO;

public class A2_HowToGetPath {
	public static void main(String[] args) {
		// �ν��Ͻ� ����
		A2_HowToGetPath me = new A2_HowToGetPath();

		// �翬�ϰ�����, getClass()�Լ��� �ν��Ͻ��� ���� ��, ȣ�� �� �� ����.
		String path = me.getClass().getResource("").getPath();
		System.out.println(path);

		path = path.substring(0, path.indexOf("bin"));
		System.out.println(path);
	}
}