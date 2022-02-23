package f_Collection;

import java.util.HashMap;
import java.util.Map;

public class G3_Search {
	public static void main(String[] args) {

		Map<String, Object> hm = new HashMap<String, Object>();
		hm.put("num", 1);
		hm.put("name", "iseohyun");
		hm.put("email", "iseohyun@hanmail.net");
		hm.put("phone", "010-4266-4766");

		System.out.println(getKey(hm, 1));
		System.out.println(getKey(hm, "iseohyun"));
		System.out.println(getKey(hm, "iseohyun@hanmail.net"));

		String getPhone = (String) hm.get("phone");
		System.out.println(getPhone);

		hm.put("name", "Jung");
		System.out.println(getKey(hm, "iseohyun"));
		System.out.println(getKey(hm, "Jung"));

		System.out.println("Key Set   : " + hm.keySet());
		System.out.println("Value Set : " + hm.values());
	}

	public static <K, V> K getKey(Map<K, V> map, V value) {
		for (K key : map.keySet()) {
			if (value.equals(map.get(key))) {
				return key;
			}
		}
		return null;
	}
}