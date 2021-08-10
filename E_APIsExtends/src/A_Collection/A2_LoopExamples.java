package A_Collection;
import java.util.*;

public class A2_LoopExamples {
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		arrList.add(40);
		arrList.add(20);
		arrList.add(30);
		arrList.add(10);
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i) + " ");
		}
		System.out.println();
		arrList.remove(1);
		
		for (int e : arrList) {
		    System.out.print(e + " ");
		}
		
		arrList.sort(null);
		
		Iterator<Integer> iter = arrList.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		arrList.set(0, 20);
		
		for (int e : arrList) {
		    System.out.print(e + " ");
		}
		
		System.out.println("리스트의 크기 : " + arrList.size());
	}
}