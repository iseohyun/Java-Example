package f_Collection;

import java.util.HashSet;

public class E1_Hash {
    public static void main(String[] args) {
        HashSet<String> hs01 = new HashSet<String>();
        hs01.add("임꺽정");
        System.out.println("Hash 01 : " + hs01);
        hs01.add("홍길동");
        System.out.println("Hash 01 : " + hs01);
        hs01.add("이순신");
        System.out.println("Hash 01 : " + hs01);
        hs01.add("임꺽정"); // 추가 안됨
        System.out.println("Hash 01 : " + hs01);
        hs01.add("장보고");
        System.out.println("Hash 01 : " + hs01);
    }
}