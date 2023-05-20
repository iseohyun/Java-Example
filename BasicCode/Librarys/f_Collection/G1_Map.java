package f_Collection;

import java.util.HashMap;

public class G1_Map {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("삼십", 30);
        hm.put("십", 10);
        hm.put("사십", 40);
        hm.put("이십", 20);
        System.out.println(hm);

        hm.remove("사십");
        System.out.println(hm);

        hm.replace("이십", 200);
        System.out.println(hm);

        System.out.println(hm.get("삼십"));
        
        System.out.println("맵의 크기 : " + hm.size());
    }
}