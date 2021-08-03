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
		hm.put(new X("삼십"), new Y(30));
		hm.put(new X("십"), new Y(10));
		hm.put(new X("사십"), new Y(40));
		hm.put(new X("이십"), new Y(20));
		System.out.println("맵에 저장된 키들의 집합 : " + hm.keySet());
		for (X key : hm.keySet()) {
			System.out.println(String.format("키 : %s, 값 : %s", key.str, hm.get(key).i));
		}
		
		hm.remove("사십");
		System.out.println("맵에 저장된 키들의 집합 : " + hm.keySet());
		Iterator<X> keys = hm.keySet().iterator();
		while (keys.hasNext()) {
			X key = keys.next();
			System.out.println(String.format("키 : %s, 값 : %s", key.str, hm.get(key).i));
		}
		
		System.out.println("맵의 크기 : " + hm.size());
	}
}