package A_Collection;

import java.util.LinkedList;

public class B_LinkedList {
	public static void main(String[] args) {
		LinkedList<String> lnkList = new LinkedList<String>();

		lnkList.add("넷");
		lnkList.add("둘");
		lnkList.add("셋");
		lnkList.add("하나");

		for (int i = 0; i < lnkList.size(); i++) {
			System.out.print(lnkList.get(i) + " ");
		}

		System.out.println();
		lnkList.remove(1);
		for (String e : lnkList) {
			System.out.print(e + " ");
		}

		System.out.println();
		lnkList.set(2, "둘");
		for (String e : lnkList) {
			System.out.print(e + " ");
		}

		lnkList.addAll(lnkList);
		System.out.println();
		for (String e : lnkList) {
			System.out.print(e + " ");
		}
		System.out.println();
		System.out.println("===========");
		System.out.println("First : " + lnkList.getFirst().toString());
		System.out.println("Last : " + lnkList.getLast().toString());
		System.out.println("리스트의 크기 : " + lnkList.size());
	}
}