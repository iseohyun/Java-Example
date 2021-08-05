package A_Collection;

import java.util.ArrayList;

public class A_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		
		arrList.add("넷");
		arrList.add("둘");
		arrList.add("셋");
		arrList.add("하나");
		
		for(int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i) + " ");
		}
		
		System.out.println();
		arrList.remove(2);
		for(int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i) + " ");
		}
		
		System.out.println();
		arrList.addAll(arrList);
		for(int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i) + " ");
		}
		
		System.out.println();
		arrList.removeAll(arrList);
		arrList.add("하나");
		for(int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i) + " ");
		}
	}
}