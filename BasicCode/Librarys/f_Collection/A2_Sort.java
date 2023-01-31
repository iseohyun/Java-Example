package f_Collection;

import java.util.ArrayList;
import java.util.Comparator;

public class A2_Sort {
  public static void main(String[] args) {
    ArrayList<String> arrList = new ArrayList<String>();
    arrList.add("수성");
    arrList.add("금성");
    arrList.add("지구");
    arrList.add("화성");
    arrList.add("목성");
    arrList.add("토성");
    System.out.println(arrList);

    arrList.sort(null);
    System.out.println(arrList);

    arrList.sort(Comparator.naturalOrder());
    System.out.println(arrList);
  }
}