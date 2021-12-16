package A_Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class F2_Tree {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(6);
		ts.add(4);
		ts.add(3);
		ts.add(5);
		ts.add(8);
		ts.add(7);
		ts.add(9);

		for (int e : ts) {
			System.out.print(e + " ");
		}

		System.out.println();
		ts.remove(40);
		Iterator<Integer> iter = ts.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}

		System.out.println();
		System.out.println("이진 검색 트리의 크기 : " + ts.size());
		System.out.println(ts.subSet(4, 8));
		System.out.println(ts.subSet(4, true, 8, true));
	}
}