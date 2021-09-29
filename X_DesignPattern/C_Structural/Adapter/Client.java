package Adapter;

/**
 * ��ó : https://jusungpark.tistory.com/22
 * 
 * @author Seohyun Jung
 *
 *		�ƴ��� ���� : �츮 ȸ�翡�� ���� ��Ű���� �츮 ȸ���� �ý��ۿ� �ٷ� �����ϸ� �ȴ�.
 *			Ÿ�翡�� �ۼ��� SW�� �츮ȸ�翡 �ý��ۿ� �ٷ� ������ �� ����.
 *			Ÿ�翡�� ���� SW�� �츮ȸ�翡 �°� �����Ϸ���, �������� �ַλ����� �����.
 *			(�ڵ嵵 �˾ƾ� �ǰ�, �����ϸ� A/S�� �ȵȴٴ���, �����ϴµ� �ð��� �ʹ� ���� �ɸ��ٴ���..)
 *			����, IF�� ��ġ���Ѽ� ���ư����� ����� ���� �ٽ��̴�.
 *
 *		�ڵ� �ؼ�)
 *			�츮ȸ�翡�� ����ϴ� ���ø����̼��� Bird��� ���̴�.
 *			������ ������ ������ �ߴµ�, ��ѱ⸦ �����ϴ°ͺ��� �����ϴ� ���� ���������� ���ٰ� ����.
 *			��ѱ⸦ �����ߴµ�, �츮�� ���� Interface�� ���� �޶�, ��ѱ⸦ ���� �����ϴ� �ͺ���
 *			adaptor�� ���� �����ϰԲ��Ϸ��� �Ѵ�.
 *
 *			main���� �츮ȸ�� �ý���(31�� for��)�� ���� ���� �����Ͽ��� �Ѵ�.
 *
 */

public class Client {
	public static void main(String[] args) {
		Bird duck = new Duck();
		Bird sparrow = new Sparrow();
		WildPigeon pigeonOrigin = new WildPigeon();
		PigeonAdapter pigeon = new PigeonAdapter(pigeonOrigin);
		Bird[] birds = { duck, sparrow, pigeon };

		for (Bird bird : birds) { // �츮ȸ�� �ý���
			System.out.println(bird);
			bird.cry();
			bird.fly();
		}
	}
}

// -> �츮 ȸ�翡�� ���� ��Ű��
interface Bird {
	public void cry();

	public void fly();
}

class Duck implements Bird {
	@Override
	public void cry() {
		System.out.println("�в�~");
	}

	@Override
	public void fly() {
		System.out.println("Ǫ��� Ǫ���");
	}
}

class Sparrow implements Bird {
	@Override
	public void cry() {
		System.out.println("±.±±.");
	}

	@Override
	public void fly() {
		System.out.println("�Ĵ��Ĵ�");
	}

}

// -> ������ ��Ű��
interface Pigeon {
	public void voice();

	public void fly();

	public void gogo();
}

class WildPigeon implements Pigeon {
	@Override
	public void voice() {
		System.out.println("������������");
	}

	@Override
	public void fly() {
		System.out.println("�ĵ����");
	}

	@Override
	public void gogo() {
		System.out.println("��~��~��~");
	}
}

// -> ������ ��Ű���� ���� �������� �ʰ�, �߰��� ����͸� �ۼ�
class PigeonAdapter implements Bird {
	Pigeon pigeon;

	public PigeonAdapter(Pigeon pigeon) {
		this.pigeon = pigeon;
	}

	@Override
	public void fly() {
		pigeon.fly();
	}

	@Override
	public void cry() {
		pigeon.voice();
	}
}