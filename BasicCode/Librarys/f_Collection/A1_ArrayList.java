package f_Collection;

import java.util.ArrayList;

public class A1_ArrayList {
  public static void main(String[] args) {
    ArrayList<String> arrList = new ArrayList<String>();

    arrList.add("넷");
    arrList.add("둘");
    arrList.add("셋");
    arrList.add("하나");
    System.out.println(arrList);

    arrList.remove(2);
    System.out.println(arrList);

    arrList.addAll(arrList);
    System.out.println(arrList);

    arrList.removeAll(arrList);
    arrList.add("하나");
    System.out.println(arrList);
  }
}