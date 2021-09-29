package A_Collection;

import java.util.*;

public class A1_ArraySort {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();

		arrList.add("荐己");
		arrList.add("陛己");
		arrList.add("瘤备");
		arrList.add("拳己");
		arrList.add("格己");
		arrList.add("配己");

		for (int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i) + " ");
		}

		arrList.sort(null);
		// arrList.sort(Comparator.naturalOrder());
		System.out.println();
		for (String e : arrList) {
			System.out.print(e + " ");
		}

		System.out.println();
		arrList.sort(Comparator.reverseOrder());
		Iterator<String> iter = arrList.iterator();

		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
	}
}