package f_Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class H2_Privious {
	public static void main(String[] args) {
		LinkedList<Integer> lnkList = new LinkedList<Integer>();
		lnkList.add(4);
		lnkList.add(2);
		lnkList.add(3);
		lnkList.add(1);
		ListIterator<Integer> iter = lnkList.listIterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}

		System.out.println();
		while (iter.hasPrevious()) {
			System.out.print(iter.previous() + " ");
		}
	}
}