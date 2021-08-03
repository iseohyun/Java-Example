package B_Collection;

import java.util.HashSet;
import java.util.Iterator;

public class E_Hash {
	public static void main(String[] args) {
		HashSet<String> hs01 = new HashSet<String>();
		HashSet<String> hs02 = new HashSet<String>();
		hs01.add("홍길동");
		hs01.add("이순신");
		System.out.println("임꺽정 추가 : " + ((hs01.add("임꺽정"))?"추가됨":"추가안됨"));
		System.out.println("임꺽정 추가 : " + ((hs01.add("임꺽정"))?"추가됨":"추가안됨"));
		
		System.out.print("Hash 01 : ");
		for (String e : hs01) {
			System.out.print(e + " ");
		}
		
		hs02.add("이성계");
		hs02.add("홍길동");
		hs02.add("이순신");
		hs02.add("장보고");
		
		System.out.println();
		System.out.print("Hash 02 : ");
		Iterator<String> iter02 = hs02.iterator();
		while (iter02.hasNext()) {
			System.out.print(iter02.next() + " ");
		}
		
		hs02.addAll(hs01);
		iter02 = hs02.iterator();
		System.out.println();
		System.out.print("02 + 01 : ");
		while (iter02.hasNext()) {
			System.out.print(iter02.next() + " ");
		}
		
		System.out.println();
		System.out.println("Hash02.size: " + hs02.size());
	}
}
