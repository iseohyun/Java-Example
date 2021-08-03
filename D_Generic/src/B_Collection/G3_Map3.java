package B_Collection;

import java.util.HashMap;
import java.util.Iterator;

class X{
	X(String str) { this.str = str;	}
	String str;
}
class Y{
	Y(int i){ this.i = i; }
	int	i;
}

public class G3_Map3 {
	public static void main(String[] args) {
		HashMap<X, Y> hm = new HashMap<X, Y>();
		hm.put(new X("���"), new Y(30));
		hm.put(new X("��"), new Y(10));
		hm.put(new X("���"), new Y(40));
		hm.put(new X("�̽�"), new Y(20));
		System.out.println("�ʿ� ����� Ű���� ���� : " + hm.keySet());
		for (X key : hm.keySet()) {
			System.out.println(String.format("Ű : %s, �� : %s", key.str, hm.get(key).i));
		}
		
		hm.remove("���");
		System.out.println("�ʿ� ����� Ű���� ���� : " + hm.keySet());
		Iterator<X> keys = hm.keySet().iterator();
		while (keys.hasNext()) {
			X key = keys.next();
			System.out.println(String.format("Ű : %s, �� : %s", key.str, hm.get(key).i));
		}
		
		System.out.println("���� ũ�� : " + hm.size());
	}
}