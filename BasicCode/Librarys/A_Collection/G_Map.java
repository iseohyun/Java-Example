package A_Collection;

import java.util.HashMap;
import java.util.Iterator;

public class G_Map {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("삼십", 30);
		hm.put("십", 10);
		hm.put("사십", 40);
		hm.put("이십", 20);
		System.out.println("맵에 저장된 키들의 집합 : " + hm.keySet());
		for (String key : hm.keySet()) {
			System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));
		}

		hm.remove("사십");
		System.out.println("맵에 저장된 키들의 집합 : " + hm.keySet());
		Iterator<String> keys = hm.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));
		}

		hm.replace("이십", 200);
		System.out.println("맵에 저장된 키들의 집합 : " + hm.keySet());
		for (String key : hm.keySet()) {
			System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));
		}
		System.out.println("맵의 크기 : " + hm.size());
	}
}