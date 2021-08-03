package B_Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class H_Iterator {
	public static void main(String [] args) {
		LinkedList<Integer> lnkList = new LinkedList<Integer>();
		lnkList.add(4);
		lnkList.add(2);
		lnkList.add(3);
		lnkList.add(1);
		
		Iterator<Integer> iter = lnkList.iterator();
		while (iter.hasNext()) {
		    System.out.print(iter.next() + " ");
		}
	}
}
