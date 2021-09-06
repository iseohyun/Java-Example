package Iterator;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 	���̾�׷� ��ó : https://ko.wikipedia.org/wiki/%EB%B0%98%EB%B3%B5%EC%9E%90_%ED%8C%A8%ED%84%B4
 * 
 * @author Seohyun Jung
 *
 *		�ݺ��� ���� : �ݺ��ڸ� ����Ͽ� Aggregate�� ȿ�������� �ε� �� �� �ֵ��� �մϴ�.
 *			���̾�׷����� �ݺ��� Iterator�� java.util.Iterator�� �����Ǿ� ������,
 *			���׸��� �̿��Ͽ�, Aggregate�� �µ��� �����Ǿ����ϴ�.
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