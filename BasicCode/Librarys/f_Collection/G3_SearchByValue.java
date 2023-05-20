package f_Collection;

import java.util.HashMap;
import java.util.Map;

public class G3_SearchByValue {
    public static void main(String[] args) {

        Map<String, Integer> hm = new HashMap<>();
        hm.put("blue", 101);
        hm.put("red", 105);
        hm.put("cyan", 106);
        hm.put("yellow", 202);
        hm.put("green", 203);

        System.out.println(hm);
        System.out.println("blue: " + hm.get("blue"));
        System.out.println("101: " + getKey(hm, 101));
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