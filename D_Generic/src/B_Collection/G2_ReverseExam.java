package B_Collection;

import java.util.Iterator;
import java.util.TreeMap;

public class G2_ReverseExam {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(30, "삼십");
		tm.put(10, "십");
		tm.put(40, "사십");
		tm.put(20, "이십");
		
		System.out.println("맵에 저장된 키들의 집합 : " + tm.keySet());
		for (Integer key : tm.keySet()) {
			System.out.println(String.format("키 : %s, 값 : %s", key, tm.get(key)));
		}
		
		tm.remove(40);
		System.out.println("맵에 저장된 키들의 집합 : " + tm.keySet());
		Iterator<Integer> keys = tm.keySet().iterator();
		while (keys.hasNext()) {
			Integer key = keys.next();
			System.out.println(String.format("키 : %s, 값 : %s", key, tm.get(key)));
		}
				
		tm.replace(20, "twenty");
		System.out.println("맵에 저장된 키들의 집합 : " + tm.keySet());
		for (Integer key : tm.keySet()) {
			System.out.println(String.format("키 : %s, 값 : %s", key, tm.get(key)));
		}
		System.out.println("맵의 크기 : " + tm.size());
	}
}
