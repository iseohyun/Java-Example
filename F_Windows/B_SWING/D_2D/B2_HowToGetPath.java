package D_2D;


public class B2_HowToGetPath {
	public static void main(String[] args) {
		// �ν��Ͻ� ����
		B2_HowToGetPath me = new B2_HowToGetPath();
		
		// �翬�ϰ�����, getClass()�Լ��� �ν��Ͻ��� ���� ��, ȣ�� �� �� ����.
		String path = me.getClass().getResource("").getPath();
		System.out.println(path);
		
		path = path.substring(0, path.indexOf("bin"));
		System.out.println(path);
	}
}
