package D_2D;


public class B2_HowToGetPath {
	public static void main(String[] args) {
		// 인스턴스 생성
		B2_HowToGetPath me = new B2_HowToGetPath();
		
		// 당연하겠지만, getClass()함수는 인스턴스가 없을 때, 호출 할 수 없다.
		String path = me.getClass().getResource("").getPath();
		System.out.println(path);
		
		path = path.substring(0, path.indexOf("bin"));
		System.out.println(path);
	}
}
