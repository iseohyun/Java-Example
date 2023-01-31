package f_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A4_print {
  public static void main(String[] args) {
    String[] str = { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };
    ArrayList<String> arrList = new ArrayList<>();
    arrList.addAll(List.of(str));

    // 1. 일반적인 for문
    for (int i = 0; i < arrList.size(); i++) {
      System.out.print(arrList.get(i) + " ");
    }
    System.out.println();

    // 2. list for문
    for (String e : arrList) {
      System.out.print(e + ",");
    }
    System.out.println();

    // 3. Iterator 사용
    Iterator<String> iter = arrList.iterator();
    while (iter.hasNext()) {
      System.out.print(iter.next() + ".");
    }
  }
}
