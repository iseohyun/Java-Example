package Iterator;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 	다이어그램 출처 : https://ko.wikipedia.org/wiki/%EB%B0%98%EB%B3%B5%EC%9E%90_%ED%8C%A8%ED%84%B4
 * 
 * @author Seohyun Jung
 *
 *		반복자 패턴 : 반복자를 사용하여 Aggregate를 효과적으로 로드 할 수 있도록 합니다.
 *			다이어그램에서 반복자 Iterator은 java.util.Iterator에 구현되어 있으며,
 *			제네릭을 이용하여, Aggregate에 맞도록 수정되었습니다.
 *
 */
public class Client {
	public static void main(String[] args) {
		LinkedList<Aggregate> list = new LinkedList<Aggregate>();
		list.add(new Aggregate1(1));
		list.add(new Aggregate1(2));
		list.add(new Aggregate1(3));
		list.add(new Aggregate1(4));
		list.add(new Aggregate1(5));

		Iterator<Aggregate> iter = list.iterator();
		while (iter.hasNext()) {
		    iter.next().iterator();
		}
	}
}

interface Aggregate{
	public void iterator();
}

class Aggregate1 implements Aggregate {
	private int ID;
	Aggregate1(int ID){
		this.ID = ID;
	}
	@Override
	public void iterator() {
		System.out.println("iterator : " + ID);
	}
}