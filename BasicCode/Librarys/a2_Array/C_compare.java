package a2_Array;

import java.util.Arrays;

public class C_compare {
  public static void main(String[] args) {
    String[] colors1 = { "red", "orange", "yellow", "green", "blue", "indigo", "Violet" };
    String[] colors2 = { "red", "orange", "yellow", "blue", "indigo", "Violet" };
    
    // 차이가 일어나는 순간에 차이를 숫자로 반환합니다. 같다면 0을 반환합니다.
    int ret = Arrays.compare(colors1, colors2);
    System.out.println(ret);

    // 두 배열에서 처음으로 차이가나는 index를 반환합니다. 같다면 -1을 반환합니다.
    ret = Arrays.mismatch(colors1, colors2);
    System.out.println(ret);

    // 두 배열에서, 비교할 영역을 지정해서 비교합니다.
    System.out.println(Arrays.equals(colors1, 1, 3,colors2,1,3));
    System.out.println(Arrays.equals(colors1, 2, 4,colors2,2,4));    
  }
}