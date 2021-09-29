package Adapter;

/**
 * 출처 : https://jusungpark.tistory.com/22
 * 
 * @author Seohyun Jung
 *
 *		아답터 패턴 : 우리 회사에서 만든 패키지는 우리 회사의 시스템에 바로 적용하면 된다.
 *			타사에서 작성된 SW를 우리회사에 시스템에 바로 적용할 수 없다.
 *			타사에서 만든 SW를 우리회사에 맞게 수정하려면, 여러가지 애로사항이 생긴다.
 *			(코드도 알아야 되고, 변경하면 A/S가 안된다던지, 수정하는데 시간이 너무 많이 걸린다던지..)
 *			따라서, IF만 일치시켜서 돌아가도록 만드는 것이 핵심이다.
 *
 *		코드 해설)
 *			우리회사에서 사용하는 어플리케이션이 Bird라는 것이다.
 *			오리와 참새는 구현을 했는데, 비둘기를 개발하는것보다 구입하는 것이 전략적으로 좋다고 하자.
 *			비둘기를 구매했는데, 우리가 가진 Interface가 조금 달라서, 비둘기를 직접 수정하는 것보다
 *			adaptor를 만들어서 동작하게끔하려고 한다.
 *
 *			main에서 우리회사 시스템(31줄 for문)의 변경 없이 적용하여야 한다.
 *
 */

public class Client {
	public static void main(String[] args) {
		Bird duck = new Duck();
		Bird sparrow = new Sparrow();
		WildPigeon pigeonOrigin = new WildPigeon();
		PigeonAdapter pigeon = new PigeonAdapter(pigeonOrigin);
		Bird[] birds = { duck, sparrow, pigeon };

		for (Bird bird : birds) { // 우리회사 시스템
			System.out.println(bird);
			bird.cry();
			bird.fly();
		}
	}
}

// -> 우리 회사에서 만든 패키지
interface Bird {
	public void cry();

	public void fly();
}

class Duck implements Bird {
	@Override
	public void cry() {
		System.out.println("꽥꽥~");
	}

	@Override
	public void fly() {
		System.out.println("푸드덕 푸드덕");
	}
}

class Sparrow implements Bird {
	@Override
	public void cry() {
		System.out.println("짹.짹짹.");
	}

	@Override
	public void fly() {
		System.out.println("파닥파닥");
	}

}

// -> 구매한 패키지
interface Pigeon {
	public void voice();

	public void fly();

	public void gogo();
}

class WildPigeon implements Pigeon {
	@Override
	public void voice() {
		System.out.println("구구구구구구");
	}

	@Override
	public void fly() {
		System.out.println("후드드드드");
	}

	@Override
	public void gogo() {
		System.out.println("총~총~총~");
	}
}

// -> 구매한 패키지를 직접 수정하지 않고, 중간에 어댑터를 작성
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