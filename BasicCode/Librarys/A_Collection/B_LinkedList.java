package A_Collection;

import java.util.LinkedList;

public class B_LinkedList {
	public static void main(String[] args) {
		LinkedList<String> lnkList = new LinkedList<String>();

		lnkList.add("��");
		lnkList.add("��");
		lnkList.add("��");
		lnkList.add("�ϳ�");

		for (int i = 0; i < lnkList.size(); i++) {
			System.out.print(lnkList.get(i) + " ");
		}

		System.out.println();
		lnkList.remove(1);
		for (String e : lnkList) {
			System.out.print(e + " ");
		}

		System.out.println();
		lnkList.set(2, "��");
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
		System.out.println("����Ʈ�� ũ�� : " + lnkList.size());
	}
}