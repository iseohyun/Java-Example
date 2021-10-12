package builder;

/**
 * 
 * @author Seohyun Jung
 *
 *		빌더 패턴 : 생성과정을 분리하여 생성함
 *
 *	  코드 해설:
 *		Origin <- 최종으로 컨트롤 하고 싶은 개체
 *		Builder : Origin을 레시피 대로 생성하는 도구
 *		Director : Builder를 생성해서 동작시킴
 */

public class Client {
	public static void main(String[] args) {
		Director dir = new Director();
		Builder type1 = new NewType1();
		Builder type2 = new NewType2();

		dir.setBuilder(type1);

		Origin object = dir.getObject();
		System.out.println(object.get());

		dir.setBuilder(type2);
		object = dir.getObject();
		System.out.println(object.get());
	}
}

class Origin {
	private String Contents = "";

	public void set(String c) {
		Contents = c;
	}

	public String get() {
		return Contents;
	}
}

abstract class Builder {
	protected Origin origin;

	public Origin get() {
		return origin;
	}

	public void create() {
		origin = new Origin();
	}

	public abstract void buildContents();
}

class NewType1 extends Builder {
	@Override
	public void buildContents() {
		origin.set("new type 1");
	}
}

class NewType2 extends Builder {
	@Override
	public void buildContents() {
		origin.set("new type 2");
	}
}

class Director {
	private Builder builder;

	public void setBuilder(Builder b) {
		builder = b;
		builder.create();
		builder.buildContents();
	}

	public Origin getObject() {
		return builder.get();
	}
}